package connection;

import java.sql.*;

public class ConnectionExercise {
	
	private static ConnectionExercise instance = new ConnectionExercise();
	
	private final String DRIVER = "com.mysql.jdbc.Driver";
	
	private final String URL = "jdbc:mysql://localhost/rental";
	private final String USER = "root";
	private final String PASS = "1234";
	
	private java.sql.Connection con = null;
	private Statement stmt = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	private ConnectionExercise(){
		
	}
	
	public static ConnectionExercise getInstance(){
		return instance;
	}
	
	public void openCon(){
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
			if(con!=null){
				con.close();
			}else if(stmt!=null){
				stmt.close();
			}else if(ps!=null){
				ps.close();
			}else if(rs!=null){
				rs.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getAllUsers(){
		openCon();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM users;");
			while(rs.next()){
				System.out.println(rs.getString("ID_User"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeCon();
		}
		
	}
	
	public void registerUser(){
		openCon();
		try {
			ps = con.prepareStatement("INSERT INTO users VALUES(?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, null);
			ps.setString(2, "wdfw");
			ps.setString(3, "nufwfwll");
			ps.setString(4, "nfwull");
			ps.setString(5, "nfwull");
			ps.setString(6, "nfwull");
			ps.setString(7, "nusall");
			ps.setString(8, "nuall");
			ps.setString(9, "nudll");
			ps.setString(10, "nucll");
			ps.setString(11, "nuvll");
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeCon();
		}
	}
}
