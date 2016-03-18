package view;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import model.Item;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

public class RentARide extends JFrame implements ActionListener, ItemListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField price;
	private JTextField totalLast30Days;
	private JTextField textField;
	
	private JComboBox locationComboBox;
	private JComboBox pickupComboBox;
	private JComboBox dropoffComboBox;
	private JComboBox categoryComboBox;
	private JTable table_1;
	private JTable table;
	private JTable table_2;
	private JTable table_3;
	
	public RentARide(String email){
		setTitle("Rent a Ride");
		this.setBounds(100, 100, 820, 600);
		getContentPane().setLayout(null);
		
		
		
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
		
		/*
		 * Model for ComboBoxes
		 */
		Vector<Item> comboBoxModel = new Vector<Item>();
		for(int i=0;i<10;i++){
			comboBoxModel.addElement(new Item(i,"Auswahl "+i));
		}
		
		locationComboBox = new JComboBox(comboBoxModel);
		locationComboBox.setBounds(92, 70, 146, 20);
		getContentPane().add(locationComboBox);
		locationComboBox.addItemListener(this);
		
		pickupComboBox = new JComboBox(comboBoxModel);
		pickupComboBox.setBounds(92, 35, 146, 20);
		getContentPane().add(pickupComboBox);
		pickupComboBox.addItemListener(this);
		
		dropoffComboBox = new JComboBox(comboBoxModel);
		dropoffComboBox.setBounds(354, 35, 146, 20);
		getContentPane().add(dropoffComboBox);
		dropoffComboBox.addItemListener(this);
		
		categoryComboBox = new JComboBox(comboBoxModel);
		categoryComboBox.setBounds(354, 70, 146, 20);
		getContentPane().add(categoryComboBox);
		categoryComboBox.addItemListener(this);
		
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
		rentButton.addActionListener(this);
		
		
		/*
		 * Model for JTables
		 */
		//Vector mit den Titeln erstellen
		Vector<String> columnNames = new Vector<String>();
		columnNames.addElement("");
		columnNames.addElement("");
		columnNames.addElement("");
	
		//Vector mit den DatensÃ¤tze erstellen
		@SuppressWarnings("rawtypes")
		Vector<Vector> data = new Vector<Vector>();
		
		//erstellt ein Vector mit den Noten
		for(int i=0; i<10; i++){
			
			Vector<Object> row = new Vector<Object>();
				
			row.addElement("prüfung"+i);	
			row.addElement("note"+i);
			row.addElement("Gewichtung"+i);
			
			data.addElement(row);						
		}
		
		//Tabel Model erstellen
		TableModel model = new DefaultTableModel(data, columnNames);
		
		JLabel lblMostPopularVehicles = new JLabel("Most popular vehicles");
		lblMostPopularVehicles.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMostPopularVehicles.setBounds(528, 38, 197, 14);
		getContentPane().add(lblMostPopularVehicles);
		
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(528, 63, 252, 106);
		getContentPane().add(scrollPane);
		
		table_1 = new JTable(model);
		table_1.setEnabled(false);
		scrollPane.setViewportView(table_1);
		table_1.setTableHeader(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(26, 115, 473, 402);
		getContentPane().add(scrollPane_1);
		
		table = new JTable(model);
		scrollPane_1.setViewportView(table);
		table.setTableHeader(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(528, 196, 252, 136);
		getContentPane().add(scrollPane_2);
		
		table_2 = new JTable(model);
		scrollPane_2.setViewportView(table_2);
		table_2.setTableHeader(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(528, 381, 252, 145);
		getContentPane().add(scrollPane_3);
		
		table_3 = new JTable(model);
		scrollPane_3.setViewportView(table_3);
		table_3.setTableHeader(null);

		
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("Rent it!")){		
			int id = ((Item) locationComboBox.getSelectedItem()).getId();
			System.out.println(id);
			
			/*
			 * Model for JTables
			 */
			//Vector mit den Titeln erstellen
			Vector<String> columnNames = new Vector<String>();
			columnNames.addElement("");
			columnNames.addElement("");
			columnNames.addElement("");
		
			//Vector mit den DatensÃ¤tze erstellen
			@SuppressWarnings("rawtypes")
			Vector<Vector> data = new Vector<Vector>();
			
			//erstellt ein Vector mit den Noten
			for(int i=1*id; i<2*id; i++){
				
				Vector<Object> row = new Vector<Object>();
					
				row.addElement("prüfung"+i);	
				row.addElement("note"+i);
				row.addElement("Gewichtung"+i);
				
				data.addElement(row);						
			}
			
			//Tabel Model erstellen
			TableModel model = new DefaultTableModel(data, columnNames);
			
			//das alte Table Model mit den neuen Model wechseln
			this.table_1.setModel(model);
			this.table_1.setTableHeader(null);
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		if(arg0.getStateChange() == ItemEvent.SELECTED){
			
			Item item1 = (Item) this.locationComboBox.getSelectedItem();
			Item item2 = (Item) this.pickupComboBox.getSelectedItem();
			Item item3 = (Item) this.dropoffComboBox.getSelectedItem();
			Item item4 = (Item) this.categoryComboBox.getSelectedItem();
			System.out.println("\nlocationComboBox: "  + item1.getId());
			System.out.println("pickupComboBox: "  + item2.getId());
			System.out.println("dropoffComboBox: "  + item3.getId());
			System.out.println("categoryComboBox: "  + item4.getId());
			
			int x = item1.getId()+item2.getId()+item3.getId()+item4.getId();
		
			/*
			 * Model for JTables
			 */
			//Vector mit den Titeln erstellen
			Vector<String> columnNames = new Vector<String>();
			columnNames.addElement("");
			columnNames.addElement("");
			columnNames.addElement("");
		
			//Vector mit den DatensÃ¤tze erstellen
			@SuppressWarnings("rawtypes")
			Vector<Vector> data = new Vector<Vector>();
			
			//erstellt ein Vector mit den Noten
			for(int i=0+x; i<2*x; i++){
				
				Vector<Object> row = new Vector<Object>();
					
				row.addElement("prüfung"+i);	
				row.addElement("note"+i);
				row.addElement("Gewichtung"+i);
				
				data.addElement(row);						
			}
			
			//Tabel Model erstellen
			TableModel model = new DefaultTableModel(data, columnNames);
			
			//das alte Table Model mit den neuen Model wechseln
			this.table.setModel(model);
			this.table.setTableHeader(null);
		}
		
	}
}
