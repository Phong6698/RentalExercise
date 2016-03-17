package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Login extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField email;
	private JPasswordField password;
	
	
	
	
	public Login() {
		setTitle("Rent a Ride - User Login");
		this.setBounds(100, 100, 384, 206);
		getContentPane().setLayout(null);
		
		JLabel emailLabel = new JLabel("E-Mail");
		emailLabel.setBounds(30, 46, 46, 14);
		getContentPane().add(emailLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(30, 81, 46, 14);
		getContentPane().add(passwordLabel);
		
		email = new JTextField();
		email.setBounds(134, 43, 200, 20);
		getContentPane().add(email);
		email.setColumns(10);
		
		JButton newButton = new JButton("New user...");
		newButton.setBounds(30, 122, 89, 23);
		getContentPane().add(newButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(134, 122, 89, 23);
		getContentPane().add(cancelButton);
		
		JButton loginButton = new JButton("Log in");
		loginButton.setBounds(245, 122, 89, 23);
		getContentPane().add(loginButton);
		
		password = new JPasswordField();
		password.setBounds(134, 78, 200, 20);
		getContentPane().add(password);
		
		this.setVisible(true);
	}
}
