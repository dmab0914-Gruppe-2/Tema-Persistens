package UILayer;

import javax.swing.JPanel;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import CtrLayer.*;
import ModelLayer.*;

@SuppressWarnings("serial")
public class CustomerGUI extends JPanel {
	private JTextField txtSearch;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtZip;
	private JTextField txtCity;
	private JTextField txtPhone;
	private JTextField txtID;
	private JTextField txtEmail;
	private JLabel lblStatus;
	private CustomerController customerController;

	/**
	 * Create the panel.
	 */
	public CustomerGUI() {
		customerController = new CustomerController();
		setPreferredSize(new Dimension(750, 500));
		setMinimumSize(new Dimension(750, 500));

		JLayeredPane layeredPane = new JLayeredPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.TRAILING).addGroup(
				Alignment.LEADING,
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE,
								730, Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.TRAILING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE,
								478, Short.MAX_VALUE).addContainerGap()));

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCustomer();
			}
		});

		JButton btnCancel = new JButton("Cancel");

		JLabel lblCustomer = new JLabel("Customer");
		lblCustomer.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtSearch = new JTextField();
		txtSearch.setColumns(10);

		JButton btnFindByPhone = new JButton("Find by Phone");
		btnFindByPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				findCustomer();
			}
		});

		JButton btnNewCustomer = new JButton("New Customer");
		btnNewCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				createCustomer();
			}
		});

		JButton btnClear = new JButton("Clear Fields");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearFields();
			}
		});

		JButton btnDeleteCustomer = new JButton("Delete Customer");
		btnDeleteCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteCustomer();
			}
		});

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);

		JLabel lblName = new JLabel("Name");

		txtName = new JTextField();
		txtName.setColumns(10);

		JLabel lblAddress = new JLabel("Address");

		txtAddress = new JTextField();
		txtAddress.setColumns(10);

		JLabel lblzipCode = new JLabel("ZipCode");

		txtZip = new JTextField();
		txtZip.setColumns(10);

		JLabel lblCity = new JLabel("City");

		txtCity = new JTextField();
		txtCity.setColumns(10);

		JLabel lblPhone = new JLabel("Phone");

		txtPhone = new JTextField();
		txtPhone.setColumns(10);

		JLabel lblID = new JLabel("ID");

		txtID = new JTextField();
		txtID.setEditable(false);
		txtID.setColumns(10);

		JLabel lblEmail = new JLabel("Email");

		txtEmail = new JTextField();
		txtEmail.setColumns(10);

		lblStatus = new JLabel("");
		GroupLayout gl_layeredPane = new GroupLayout(layeredPane);
		gl_layeredPane
				.setHorizontalGroup(gl_layeredPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_layeredPane
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_layeredPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblCustomer)
														.addGroup(
																gl_layeredPane
																		.createSequentialGroup()
																		.addComponent(
																				txtSearch,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnFindByPhone))
														.addGroup(
																gl_layeredPane
																		.createParallelGroup(
																				Alignment.TRAILING,
																				false)
																		.addComponent(
																				btnNewCustomer,
																				Alignment.LEADING,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				btnClear,
																				Alignment.LEADING,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				btnDeleteCustomer,
																				Alignment.LEADING,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)))
										.addGap(27)
										.addComponent(separator,
												GroupLayout.PREFERRED_SIZE, 16,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_layeredPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_layeredPane
																		.createSequentialGroup()
																		.addGroup(
																				gl_layeredPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								gl_layeredPane
																										.createSequentialGroup()
																										.addGroup(
																												gl_layeredPane
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																lblCity)
																														.addComponent(
																																lblPhone))
																										.addGap(18)
																										.addGroup(
																												gl_layeredPane
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																txtCity,
																																GroupLayout.DEFAULT_SIZE,
																																245,
																																Short.MAX_VALUE)
																														.addComponent(
																																txtPhone,
																																GroupLayout.DEFAULT_SIZE,
																																245,
																																Short.MAX_VALUE)
																														.addComponent(
																																txtEmail,
																																245,
																																245,
																																245)))
																						.addGroup(
																								gl_layeredPane
																										.createSequentialGroup()
																										.addComponent(
																												lblzipCode)
																										.addPreferredGap(
																												ComponentPlacement.UNRELATED)
																										.addComponent(
																												txtZip,
																												GroupLayout.DEFAULT_SIZE,
																												244,
																												Short.MAX_VALUE))
																						.addGroup(
																								gl_layeredPane
																										.createSequentialGroup()
																										.addGroup(
																												gl_layeredPane
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																lblAddress)
																														.addComponent(
																																lblName))
																										.addPreferredGap(
																												ComponentPlacement.UNRELATED)
																										.addGroup(
																												gl_layeredPane
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																txtName,
																																GroupLayout.DEFAULT_SIZE,
																																244,
																																Short.MAX_VALUE)
																														.addComponent(
																																txtAddress,
																																GroupLayout.DEFAULT_SIZE,
																																244,
																																Short.MAX_VALUE))))
																		.addGap(205))
														.addComponent(lblEmail)
														.addGroup(
																gl_layeredPane
																		.createSequentialGroup()
																		.addGap(117)
																		.addComponent(
																				btnCancel)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnSave))
														.addGroup(
																gl_layeredPane
																		.createSequentialGroup()
																		.addGap(48)
																		.addComponent(
																				txtID,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(lblID)
														.addComponent(lblStatus))
										.addContainerGap()));
		gl_layeredPane
				.setVerticalGroup(gl_layeredPane
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								gl_layeredPane
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_layeredPane
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(
																separator,
																GroupLayout.DEFAULT_SIZE,
																456,
																Short.MAX_VALUE)
														.addGroup(
																gl_layeredPane
																		.createSequentialGroup()
																		.addGroup(
																				gl_layeredPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								gl_layeredPane
																										.createSequentialGroup()
																										.addComponent(
																												lblCustomer)
																										.addGap(18)
																										.addGroup(
																												gl_layeredPane
																														.createParallelGroup(
																																Alignment.BASELINE)
																														.addComponent(
																																txtSearch,
																																GroupLayout.PREFERRED_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																btnFindByPhone))
																										.addGap(30)
																										.addComponent(
																												btnNewCustomer)
																										.addGap(18)
																										.addComponent(
																												btnClear)
																										.addGap(18)
																										.addComponent(
																												btnDeleteCustomer))
																						.addGroup(
																								gl_layeredPane
																										.createSequentialGroup()
																										.addGroup(
																												gl_layeredPane
																														.createParallelGroup(
																																Alignment.BASELINE)
																														.addComponent(
																																lblName)
																														.addComponent(
																																txtName,
																																GroupLayout.PREFERRED_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.PREFERRED_SIZE))
																										.addGap(18)
																										.addGroup(
																												gl_layeredPane
																														.createParallelGroup(
																																Alignment.BASELINE)
																														.addComponent(
																																lblAddress)
																														.addComponent(
																																txtAddress,
																																GroupLayout.PREFERRED_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.PREFERRED_SIZE))
																										.addGap(18)
																										.addGroup(
																												gl_layeredPane
																														.createParallelGroup(
																																Alignment.BASELINE)
																														.addComponent(
																																lblzipCode)
																														.addComponent(
																																txtZip,
																																GroupLayout.PREFERRED_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.PREFERRED_SIZE))
																										.addGap(18)
																										.addGroup(
																												gl_layeredPane
																														.createParallelGroup(
																																Alignment.BASELINE)
																														.addComponent(
																																lblCity)
																														.addComponent(
																																txtCity,
																																GroupLayout.PREFERRED_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.PREFERRED_SIZE))
																										.addGap(18)
																										.addGroup(
																												gl_layeredPane
																														.createParallelGroup(
																																Alignment.BASELINE)
																														.addComponent(
																																lblPhone)
																														.addComponent(
																																txtPhone,
																																GroupLayout.PREFERRED_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.PREFERRED_SIZE))
																										.addGap(18)
																										.addGroup(
																												gl_layeredPane
																														.createParallelGroup(
																																Alignment.BASELINE)
																														.addComponent(
																																lblEmail)
																														.addComponent(
																																txtEmail,
																																GroupLayout.PREFERRED_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.PREFERRED_SIZE))))
																		.addGap(18)
																		.addGroup(
																				gl_layeredPane
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								lblID)
																						.addComponent(
																								txtID,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE))
																		.addGap(28)
																		.addComponent(
																				lblStatus)
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				157,
																				Short.MAX_VALUE)
																		.addGroup(
																				gl_layeredPane
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								btnSave)
																						.addComponent(
																								btnCancel))))
										.addContainerGap()));
		layeredPane.setLayout(gl_layeredPane);
		setLayout(groupLayout);

	}

	private void clearFields() {
		txtName.setText("");
		txtAddress.setText("");
		txtZip.setText("");
		txtCity.setText("");
		txtPhone.setText("");
		txtEmail.setText("");
		txtID.setText("");
	}

	private void findCustomer() {
		String search = txtSearch.getText().trim();
		@SuppressWarnings("unused")
		int a = 0;
		try {
			a = Integer.parseInt(search);

			Customer myCustomer = customerController.findCustomer(search);

			if (myCustomer != null) {
				clearFields();

				txtName.setText(myCustomer.getName());
				txtAddress.setText(myCustomer.getAddress());
				txtZip.setText(Integer.toString(myCustomer.getZipCode()));
				txtCity.setText(myCustomer.getCity());
				txtPhone.setText(myCustomer.getPhoneNumber());
				txtEmail.setText(myCustomer.getEmail());
				txtID.setText(Integer.toString(myCustomer.getCustomerID()));

				lblStatus.setText("Customer found!");

			} else {
				lblStatus.setText("Nothing found!");
			}
		} catch (NumberFormatException nfe) {
			lblStatus.setText("Invalid Search!");
		}
	}

	private void createCustomer() {
		if (txtZip.getText().length() >= 1) {
			String name = txtName.getText();
			String address = txtAddress.getText();
			int zip = Integer.parseInt(txtZip.getText());
			String city = txtCity.getText();
			String phone = txtPhone.getText();
			String email = txtEmail.getText();

			try {
				customerController.addCustomer(name, address, zip, city, phone,
						email);
				lblStatus.setText("Customer created!");
				clearFields();
			} catch (Exception e) {
				lblStatus.setText("Error in new customer, try again!");
			}
		}
	}

	private void updateCustomer() {
		if (txtZip.getText().length() >= 1) {
			String name = txtName.getText();
			String address = txtAddress.getText();
			int zip = Integer.parseInt(txtZip.getText());
			String city = txtCity.getText();
			String phone = txtPhone.getText();
			String email = txtEmail.getText();
			int id = Integer.parseInt(txtID.getText());
			if(txtID.getText().length() >= 1){
				int result = customerController.updateCustomer(id, name, address, zip, city, phone, email);
				
				if(result == 1) {
				clearFields();
				lblStatus.setText("Customer updated");
				}else {
					lblStatus.setText("Error in update");
				}
			} else {
			 lblStatus.setText("No custoemr is open");
			}
		}
	}
	private void deleteCustomer() {
	
	}
}
