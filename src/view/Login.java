package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import connection.Connection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Login extends JFrame implements ActionListener{

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
		emailLabel.setBounds(30, 46, 82, 14);
		getContentPane().add(emailLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(30, 81, 94, 14);
		getContentPane().add(passwordLabel);
		
		email = new JTextField();
		email.setBounds(134, 43, 200, 20);
		getContentPane().add(email);
		email.setColumns(10);
		
		JButton newButton = new JButton("New user...");
		newButton.setBounds(30, 122, 106, 23);
		getContentPane().add(newButton);
		newButton.addActionListener(this);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(146, 122, 89, 23);
		getContentPane().add(cancelButton);
		cancelButton.addActionListener(this);
		
		JButton loginButton = new JButton("Log in");
		loginButton.setBounds(245, 122, 89, 23);
		getContentPane().add(loginButton);
		loginButton.addActionListener(this);
		
		password = new JPasswordField();
		password.setBounds(134, 78, 200, 20);
		getContentPane().add(password);
		
		this.setVisible(true);
	}




	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("New user...")){
			new Registration();

		}else if(arg0.getActionCommand().equals("Cancel")){
			this.dispose();
		}else if(arg0.getActionCommand().equals("Log in")){
			if(Connection.getInstance().loginUser(this.email.getText(), this.password.getText())){
				new RentARide(this.email.getText());
				this.dispose();
			}else{
				JOptionPane.showMessageDialog(this,"Wrong Login Data!");
			}
			
		}
		
	}
}
