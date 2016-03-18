package connection;

import java.sql.*;

import model.User;

public class ConnectionExercise {
	
	private static ConnectionExercise instance = new ConnectionExercise();
	
	private final String DRIVER = "com.mysql.jdbc.Driver";
	
	private final String URL = "";
	private final String USER = "";
	private final String PASS = "";
	
	private java.sql.Connection con = null;
	private Statement stmt = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	private ConnectionExercise(){
		
	}
	
	
	public static ConnectionExercise getInstance(){
		return instance;
	}
	
	
	public void setCon(){
		
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASS);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}
	
	public void closeCon(){
		try {
			con.close();
			stmt.close();
			ps.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void getUsers(){
		setCon();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM user");
			
			while(rs.next()){
				String id = rs.getString("ID_User");

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeCon();
		}
		
		
		
	}
	
	public void registerUser(User user){
		 setCon();
		try {
			ps = con.prepareStatement("INSERT INTO user VALUES (?,?,?)");
			ps.setString(1, null);
			ps.setString(2, user.getFirstname());
			ps.setString(3, user.getLastname());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeCon();
		}
	}
	
}
