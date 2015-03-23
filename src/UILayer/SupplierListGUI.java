package UILayer;

/**
 * Sales GUI and methods
 * 
 * @author Andreas
 * @version (01/02-2014) dd/mm-yyyy
 */

import CtrLayer.SupplierController;
import ModelLayer.Supplier;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Window.Type;

public class SupplierListGUI {

	JFrame frmRegisteredProducts;
	private JTable table;
	DefaultTableModel supplierTable;
	SupplierController scon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupplierListGUI window = new SupplierListGUI();
					window.frmRegisteredProducts.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SupplierListGUI() {
		scon = new SupplierController();
		initialize();
		loadSuppliersTable();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("serial")
	private void initialize() {
		frmRegisteredProducts = new JFrame();
		frmRegisteredProducts.setType(Type.POPUP);
		frmRegisteredProducts.setTitle("All Suppliers");
		frmRegisteredProducts.setMinimumSize(new Dimension(650, 0));
		frmRegisteredProducts.setBounds(100, 100, 450, 300);
		frmRegisteredProducts.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JScrollPane scrollPane = new JScrollPane();
		frmRegisteredProducts.getContentPane().add(scrollPane,
				BorderLayout.CENTER);

		supplierTable = new DefaultTableModel(new Object[][] {}, new String[] {
				"ID", "Name", "Purchase price", "Sales price",
				"Country of origin", "Supplier name" }); /*
														 * { Class[] columnTypes
														 * = new Class[] {
														 * String.class,
														 * String.class,
														 * Double.class,
														 * Double.class,
														 * Double.class,
														 * Integer.class,
														 * String.class };
														 * public Class
														 * getColumnClass(int
														 * columnIndex) { return
														 * columnTypes
														 * [columnIndex]; } });
														 */
		table = new JTable(new DefaultTableModel(new Object[][] {},
				new String[] { "ID", "Name", "Address", "Country", "Email",
						"Phone" }) {
			Class[] columnTypes = new Class[] { Integer.class, String.class,
					String.class, String.class, String.class, Object.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
	}

	/**
	 * Load all products into a row each in the table.
	 */
	private void loadSuppliersTable() {
		ArrayList<Supplier> suppliers = scon.getAllProducts();
		for (Supplier s : suppliers) {
			supplierTable.addRow(new Object[] { Integer.toString(s.getId()),
					s.getName(), s.getAddress(), s.getCountry(), s.getEmail(),
					s.getPhoneno()

			});
		}
		supplierTable.newDataAvailable(null);
	}
}
