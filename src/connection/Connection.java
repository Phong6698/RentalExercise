package connection;

import java.sql.*;

import connection.Connection;
import model.User;

public class Connection {
	
	private static Connection instance = new Connection();
	
	private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	private final String DB_URL = "jdbc:mysql://localhost/rental";
	private final String USER = "root";
	private final String PASS = "1234";
	
	protected java.sql.Connection con = null;
	protected Statement stmt = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	
	private Connection() {
	}

	public static Connection getInstance() {
		return Connection.instance;
	}
	
	public void setCon(){
		try {
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB_URL, USER, PASS);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeCon(){
		try {
			if(con != null){
				con.close();
			}else if(stmt != null){
				stmt.close();
			}else if(ps != null){
				ps.close();
			}else if(rs != null){
				rs.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getUsers(){
		setCon();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM users");
			
			while (rs.next()) {
			 
			      String userID = rs.getString("ID_User");
			      String firstname = rs.getString("Firstname");
			      System.out.println(userID);
			      System.out.println(firstname);
			}
			
			      
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally{
			closeCon();
		}
	}
	
	public void registerUser(User user){
		
		setCon();
			
		try {
			ps = con.prepareStatement("INSERT INTO users VALUES (?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, null);
			ps.setString(2, user.getFirstname());
			ps.setString(3, user.getLastname());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getAddress2());
			ps.setString(6, user.getZipCode());
			ps.setString(7, user.getCity());
			ps.setString(8, user.getTelephone());
			ps.setString(9, user.getEmail());
			ps.setString(10, user.getCreditCardNumber());
			ps.setString(11, user.getPassword());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			closeCon();
		}
		
		
	}
	
	public boolean loginUser(String email, String password){
		
		boolean loginSuccess = false;
		
		setCon();
			
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM users");
			
			
			
			while (rs.next()) {
				
				if(rs.getString("Email").equals(email) && rs.getString("Password").equals(password)){
					loginSuccess = true;
					break;
				}else{
					loginSuccess = false;
				}
	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			closeCon();
		}
		
		return loginSuccess;
		
	}
	
}
