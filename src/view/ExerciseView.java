package view;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import model.Item;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class ExerciseView extends JFrame implements ItemListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	
	public ExerciseView() {
		getContentPane().setLayout(null);
		this.setBounds(100, 100, 536, 390);
		
		Vector<Item> modelCB = new Vector<Item>();
		
		modelCB.add(new Item(1, "Val"+1));
		modelCB.add(new Item(2, "Val"+2));
		modelCB.add(new Item(3, "Val"+3));
		modelCB.add(new Item(4, "Val"+4));
		
		comboBox = new JComboBox(modelCB);
		comboBox.setBounds(54, 31, 89, 20);
		getContentPane().add(comboBox);
		comboBox.addItemListener(this);
		
		comboBox_1 = new JComboBox(modelCB);
		comboBox_1.setBounds(214, 31, 89, 20);
		getContentPane().add(comboBox_1);
		comboBox_1.addItemListener(this);
		
		comboBox_2 = new JComboBox(modelCB);
		comboBox_2.setBounds(374, 31, 89, 20);
		getContentPane().add(comboBox_2);
		comboBox_2.addItemListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 62, 409, 227);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setTableHeader(null);
		
		JButton btnPush = new JButton("PUSH IT!");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Vector<Object> columnName = new Vector<Object>();
				columnName.add("bla1");
				columnName.add("bla2");
				columnName.add("bla3");
				columnName.add("bla4");
				columnName.add("bla5");
	
				
				Vector<Vector> data = new Vector<Vector>();
				
				for(int i=0; i<100; i++){
					Vector<Object> row = new Vector<Object>();
					row.add("1: "+i);
					row.add("2: "+i);
					row.add("3: "+i);
					row.add("4: "+i);
					row.add("5: "+i);
					data.add(row);
				}
				
				TableModel modelT = new DefaultTableModel(data, columnName);
				
				table.setModel(modelT);
				
			}
		});
		btnPush.setBounds(214, 307, 89, 23);
		getContentPane().add(btnPush);
		
		this.setVisible(true);
	}

	
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		if(arg0.getStateChange() == ItemEvent.SELECTED){
			
			int c1 = ((Item) comboBox.getSelectedItem()).getId();
			int c2 = ((Item) comboBox_1.getSelectedItem()).getId();
			int c3 = ((Item) comboBox_2.getSelectedItem()).getId();
			
			int x = c1 + c2 + c3;
			
			Vector<Object> columnName = new Vector<Object>();
			columnName.add("bla1");
			columnName.add("bla2");
			columnName.add("bla3");
			
			Vector<Vector> data = new Vector<Vector>();
			
			for(int i=0+x; i<2*x; i++){
				Vector<Object> row = new Vector<Object>();
				row.add("1: "+i);
				row.add("2: "+i);
				row.add("3: "+i);
				data.add(row);
			}
			
			TableModel modelT = new DefaultTableModel(data, columnName);
			
			this.table.setModel(modelT);
			
		}
		
	}
}
