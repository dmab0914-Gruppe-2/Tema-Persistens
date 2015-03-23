package UILayer;

import javax.swing.JPanel;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import CtrLayer.*;
import ModelLayer.*;
import DBLayer.*;

public class SupplierGUI extends JPanel {
	private JTextField textField_idInput;
	private JTextField textField_name;
	private JTextField textField_address;
	private JTextField textField_country;
	private JTextField textField_phone;
	private JTextField textField_email;
	private SupplierController scon;
	JButton btnFindById;
	JButton btnNewSupplier;
	JButton btnCancel;
	JButton btnClear;
	private JTextField textField_id;
	
	/**
	 * Create the panel.
	 */
	public SupplierGUI() {
		scon = new SupplierController();
		setPreferredSize(new Dimension(750, 500));
		setMinimumSize(new Dimension(750, 500));
		
		JLayeredPane layeredPane = new JLayeredPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JButton btnSave = new JButton("Save");
		
		btnCancel = new JButton("Cancel");
		
		JButton btnRevertChanges = new JButton("Revert Changes");
		
		JLabel lblSupplier = new JLabel("Supplier");
		lblSupplier.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textField_idInput = new JTextField();
		textField_idInput.setColumns(10);
		
		btnFindById = new JButton("Find by ID");
		btnNewSupplier = new JButton("New Supplier");
		
		btnClear = new JButton("Clear Fields");
		
		
		JButton btnDeleteSupplier = new JButton("Delete Supplier");
		btnDeleteSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteSupplier();
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JLabel lblName = new JLabel("Name");
		
		textField_name = new JTextField();
		textField_name.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		
		textField_address = new JTextField();
		textField_address.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Country");
		
		textField_country = new JTextField();
		textField_country.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone");
		
		textField_phone = new JTextField();
		textField_phone.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		
		textField_email = new JTextField();
		textField_email.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		
		textField_id = new JTextField();
		textField_id.setEditable(false);
		textField_id.setColumns(10);
		GroupLayout gl_layeredPane = new GroupLayout(layeredPane);
		gl_layeredPane.setHorizontalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSupplier)
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addComponent(textField_idInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnFindById))
						.addGroup(gl_layeredPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnNewSupplier, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnClear, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnDeleteSupplier, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(27)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addComponent(btnRevertChanges)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSave))
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_layeredPane.createSequentialGroup()
									.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPhone)
										.addComponent(lblEmail))
									.addGap(18)
									.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_phone, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
										.addComponent(textField_email, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
										.addComponent(textField_id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_layeredPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_country, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
								.addGroup(gl_layeredPane.createSequentialGroup()
									.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblAddress)
										.addComponent(lblName))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_name, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
										.addComponent(textField_address, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
							.addGap(249))
						.addComponent(lblNewLabel_1))
					.addContainerGap())
		);
		gl_layeredPane.setVerticalGroup(
			gl_layeredPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_layeredPane.createSequentialGroup()
									.addComponent(lblSupplier)
									.addGap(18)
									.addGroup(gl_layeredPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_idInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnFindById))
									.addGap(30)
									.addComponent(btnNewSupplier)
									.addGap(18)
									.addComponent(btnClear)
									.addGap(18)
									.addComponent(btnDeleteSupplier))
								.addGroup(gl_layeredPane.createSequentialGroup()
									.addGroup(gl_layeredPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblName)
										.addComponent(textField_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_layeredPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblAddress)
										.addComponent(textField_address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_layeredPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel)
										.addComponent(textField_country, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_layeredPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPhone)
										.addComponent(textField_phone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_layeredPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEmail)
										.addComponent(textField_email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_layeredPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1)
										.addComponent(textField_id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
							.addGroup(gl_layeredPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnSave)
								.addComponent(btnCancel)
								.addComponent(btnRevertChanges))))
					.addContainerGap())
		);
		layeredPane.setLayout(gl_layeredPane);
		setLayout(groupLayout);
		actionListerners();
	}
	
	public void findSupplier()
	{
		
		int i = -1;
		try
		{
			String s =  textField_idInput.getText();
			i = Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			
		}//endTryCatch
		
		if(i !=-1)
		{
			Supplier s = new Supplier(); 
			s = scon.findSupplier(i);
			textField_address.setText(s.getAddress());
			textField_country.setText(s.getCountry());
			textField_email.setText(s.getEmail());
			textField_name.setText(s.getName());
			textField_phone.setText(s.getPhoneno());
			textField_id.setText(Integer.toString(s.getId()));
			
		}//endIf
	}//endFindSupplier
	
	private void addSupplier()
	{
		scon.addSupplier(
				textField_name.getText(), 
				textField_address.getText(), 
				textField_country.getText(), 
				textField_phone.getText(), 
				textField_email.getText());
	}//endAddSupplier
	
	private void clearFields()
	{
		textField_address.setText("");
		textField_country.setText("");
		textField_email.setText("");
		textField_idInput.setText("");
		textField_name.setText("");
		textField_phone.setText("");
		textField_id.setText("0");
	}//endClearFields
	
	private void deleteSupplier()
	{
		int dialogButton = JOptionPane.YES_NO_OPTION;
		int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this Supplier?", "Confirm deletion!",dialogButton);
		if(dialogResult==0)
		{
			try
			{
				scon.deleteSupplier(Integer.parseInt(textField_idInput.getText()));	
			}
			catch(NumberFormatException e)
			{
				System.out.println("Not a number! " + e);
			}//endCatch
		}//endIf
	}//end deleteSupplier()
	
	private void actionListerners()
	{
		
		btnFindById.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				findSupplier();
			}
		});
		
		btnNewSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addSupplier();
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearFields();
			}
		});
	}
}//endClass
