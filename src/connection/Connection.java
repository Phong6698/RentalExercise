package connection;

import java.sql.*;

import model.User;

public class Connection {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/rental";
	static final String USER = "root";
	static final String PASS = "1234";
	
	protected java.sql.Connection con = null;
	protected Statement stmt = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	
	
	public void getCon(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeCon(){
		try {
			con.close();
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getUsers(){
		getCon();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM users");
			
			while (rs.next()) {
			 
			      String userID = rs.getString("ID_User");
			      String firstname = rs.getString("Firstname");
			      System.out.println(userID);
			      System.out.println(firstname);
			}
			
			closeCon();
			      
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void registerUser(User user){
		
		getCon();
			
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
