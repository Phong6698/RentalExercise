package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Registration extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField address1;
	private JTextField address2;
	private JTextField zip;
	private JTextField city;
	private JTextField telephone;
	private JTextField email;
	private JTextField creditCardNumber;
	private JPasswordField password1;
	private JPasswordField password2;
	
	public Registration() {
		setTitle("Rent a Ride - User Registration");
		this.setBounds(100, 100, 384, 389);
		getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setBounds(42, 35, 90, 14);
		getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setBounds(42, 60, 90, 14);
		getContentPane().add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(42, 85, 90, 14);
		getContentPane().add(lblAddress);
		
		JLabel lblZipcity = new JLabel("Zip / City");
		lblZipcity.setBounds(42, 146, 90, 14);
		getContentPane().add(lblZipcity);
		
		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setBounds(42, 171, 90, 14);
		getContentPane().add(lblTelephone);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setBounds(42, 196, 90, 14);
		getContentPane().add(lblEmail);
		
		JLabel lblCreditCardNumber = new JLabel("Credit Card Number");
		lblCreditCardNumber.setBounds(42, 221, 113, 14);
		getContentPane().add(lblCreditCardNumber);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(42, 246, 90, 14);
		getContentPane().add(lblPassword);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setBounds(42, 271, 90, 14);
		getContentPane().add(lblPassword_1);
		
		firstname = new JTextField();
		firstname.setBounds(154, 32, 173, 20);
		getContentPane().add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setColumns(10);
		lastname.setBounds(154, 57, 173, 20);
		getContentPane().add(lastname);
		
		address1 = new JTextField();
		address1.setColumns(10);
		address1.setBounds(154, 82, 173, 20);
		getContentPane().add(address1);
		
		address2 = new JTextField();
		address2.setColumns(10);
		address2.setBounds(154, 110, 173, 20);
		getContentPane().add(address2);
		
		zip = new JTextField();
		zip.setColumns(10);
		zip.setBounds(154, 143, 55, 20);
		getContentPane().add(zip);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(219, 143, 108, 20);
		getContentPane().add(city);
		
		telephone = new JTextField();
		telephone.setColumns(10);
		telephone.setBounds(154, 168, 173, 20);
		getContentPane().add(telephone);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(154, 193, 173, 20);
		getContentPane().add(email);
		
		creditCardNumber = new JTextField();
		creditCardNumber.setColumns(10);
		creditCardNumber.setBounds(154, 218, 173, 20);
		getContentPane().add(creditCardNumber);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(154, 305, 77, 23);
		getContentPane().add(cancelButton);
		
		JButton registerButton = new JButton("Register");
		registerButton.setBounds(253, 305, 77, 23);
		getContentPane().add(registerButton);
		
		password1 = new JPasswordField();
		password1.setBounds(154, 243, 173, 20);
		getContentPane().add(password1);
		
		password2 = new JPasswordField();
		password2.setBounds(154, 268, 173, 20);
		getContentPane().add(password2);
		
		
		this.setVisible(true);
	}
}
