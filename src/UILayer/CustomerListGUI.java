package UILayer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Window.Type;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import CtrLayer.CustomerController;
import ModelLayer.Customer;

public class CustomerListGUI {

	JFrame frmRegisteredCustomers;
	private JTable table;
	DefaultTableModel customersTable;
	CustomerController customerController;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerListGUI window = new CustomerListGUI();
					window.frmRegisteredCustomers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CustomerListGUI() {
		customerController = new CustomerController();
		initialize();
		loadcustomersTable();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegisteredCustomers = new JFrame();
		frmRegisteredCustomers.setType(Type.POPUP);
		frmRegisteredCustomers.setTitle("Registered Customers");
		frmRegisteredCustomers.setMinimumSize(new Dimension(650, 0));
		frmRegisteredCustomers.setBounds(100, 100, 450, 300);
		frmRegisteredCustomers.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		frmRegisteredCustomers.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		customersTable = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"ID", "Name", "Address", "zipCide", "city", "phone number", "Email"
				}
				); /*{
			Class[] columnTypes = new Class[] {
				String.class, String.class, Double.class, Double.class, Double.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});*/
		table = new JTable(customersTable);
		scrollPane.setViewportView(table);
	}

	/**
	 * Load all customers into a row each in the table.
	 */
	private void loadcustomersTable()
	{
		ArrayList<Customer> customers = customerController.getAllCustomers();
		for(Customer customer : customers)
		{
			customersTable.addRow(new Object []{
					customer.getCustomerID(),
					customer.getName(),
					customer.getAddress(),
					customer.getZipCode(),
					customer.getCity(),
					customer.getPhoneNumber(),
					customer.getEmail(),
			});
		}
		customersTable.newDataAvailable(null);
	}
}
