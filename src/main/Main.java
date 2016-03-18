package main;

import connection.Connection;
import connection.ConnectionExercise;
import model.User;
import view.ExerciseView;
import view.Login;
import view.Registration;
import view.RentARide;

public class Main {

	public static void main(String[] args) {
		new Login();
		new ExerciseView();
		
		ConnectionExercise.getInstance().registerUser();
		ConnectionExercise.getInstance().getAllUsers();

	}

}
