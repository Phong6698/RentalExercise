package view;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class RentARide extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField price;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTextField totalLast30Days;
	private JTextField textField;
	
	public RentARide(){
		setTitle("Rent a Ride");
		this.setBounds(100, 100, 820, 600);
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(26, 116, 474, 404);
		getContentPane().add(table);
		
		JLabel lblPickUp = new JLabel("Pick up:");
		lblPickUp.setBounds(26, 38, 56, 14);
		getContentPane().add(lblPickUp);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setBounds(26, 73, 56, 14);
		getContentPane().add(lblLocation);
		
		JLabel lblDropOff = new JLabel("Drop off:");
		lblDropOff.setBounds(271, 38, 65, 14);
		getContentPane().add(lblDropOff);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(271, 73, 73, 14);
		getContentPane().add(lblCategory);
		
		JComboBox locationComboBox = new JComboBox();
		locationComboBox.setBounds(92, 70, 146, 20);
		getContentPane().add(locationComboBox);
		
		JComboBox pickupComboBox = new JComboBox();
		pickupComboBox.setBounds(92, 35, 146, 20);
		getContentPane().add(pickupComboBox);
		
		JComboBox dropoffComboBox = new JComboBox();
		dropoffComboBox.setBounds(354, 35, 146, 20);
		getContentPane().add(dropoffComboBox);
		
		JComboBox categoryComboBox = new JComboBox();
		categoryComboBox.setBounds(354, 70, 146, 20);
		getContentPane().add(categoryComboBox);
		
		JLabel lblNewLabel = new JLabel("Rental Price:");
		lblNewLabel.setBounds(26, 531, 80, 14);
		getContentPane().add(lblNewLabel);
		
		price = new JTextField();
		price.setEditable(false);
		price.setBounds(115, 528, 86, 20);
		getContentPane().add(price);
		price.setColumns(10);
		
		JButton rentButton = new JButton("Rent it!");
		rentButton.setBounds(411, 527, 89, 23);
		getContentPane().add(rentButton);
		
		table_1 = new JTable();
		table_1.setBounds(528, 53, 252, 107);
		getContentPane().add(table_1);
		
		JLabel lblMostPopularVehicles = new JLabel("Most popular vehicles");
		lblMostPopularVehicles.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMostPopularVehicles.setBounds(528, 38, 197, 14);
		getContentPane().add(lblMostPopularVehicles);
		
		table_2 = new JTable();
		table_2.setBounds(528, 195, 252, 138);
		getContentPane().add(table_2);
		
		table_3 = new JTable();
		table_3.setBounds(528, 379, 252, 146);
		getContentPane().add(table_3);
		
		JLabel lblLastDays = new JLabel("Last 30 days");
		lblLastDays.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLastDays.setBounds(528, 180, 197, 14);
		getContentPane().add(lblLastDays);
		
		JLabel lblFutureReservations = new JLabel("Future Reservations");
		lblFutureReservations.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFutureReservations.setBounds(528, 365, 197, 14);
		getContentPane().add(lblFutureReservations);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(528, 337, 146, 14);
		getContentPane().add(lblTotal);
		
		JLabel label_1 = new JLabel("Total");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(528, 531, 165, 14);
		getContentPane().add(label_1);
		
		totalLast30Days = new JTextField();
		totalLast30Days.setEditable(false);
		totalLast30Days.setBounds(694, 334, 86, 20);
		getContentPane().add(totalLast30Days);
		totalLast30Days.setColumns(10);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(694, 528, 86, 20);
		getContentPane().add(textField);
		
		
		this.setVisible(true);
	}
}
