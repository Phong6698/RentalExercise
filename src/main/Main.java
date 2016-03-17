package main;

import connection.Connection;
import model.User;
import view.Login;
import view.Registration;
import view.RentARide;

public class Main {

	public static void main(String[] args) {
		new Login();
		new Registration();
		new RentARide();
		
		Connection connection = new Connection();	
		connection.getUsers();
		
		User user = new User();
		user.setFirstname("1");
		user.setLastname("1");
		user.setAddress("1");
		user.setAddress2("1");
		user.setZipCode("1");
		user.setCity("1");
		user.setTelephone("1");
		user.setEmail("1");
		user.setCreditCardNumber("1");
		user.setPassword("1");
		
		connection.registerUser(user);
		
		connection.getUsers();

	}

}
