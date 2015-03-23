package UILayer;

/**
 * Main GUI and methods to access other GUIs
 * 
 * @author Andreas Reng Mogensen, Jacob Pedersen, Nicklas Welle, Ronnie Knudsen
 * @version (23/03-2015) dd/mm-yyyy
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class MainGUI extends JFrame {

	private JPanel contentPane;

	DefaultTableModel model = new DefaultTableModel();

	/**
	 * Create the frame.
	 */
	public MainGUI() {
		ProductGUI productGUI = new ProductGUI();
		productGUI.setPreferredSize(new Dimension(750, 500));
		productGUI.setMinimumSize(new Dimension(750, 500));

		SupplierGUI supplierGUI = new SupplierGUI();
		supplierGUI.setPreferredSize(new Dimension(750, 500));
		supplierGUI.setMinimumSize(new Dimension(750, 500));

		setMinimumSize(new Dimension(800, 600));
		setTitle("Tema Persistens - GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING).addComponent(tabbedPane,
						GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING).addComponent(tabbedPane,
						GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE));

		//tabbedPane.addTab("Sale", null, salesGUI, null); //Loads salesGUI from SalesGUI class

		//tabbedPane.addTab("Person", null, personGUI, null); //Loads personGUI from PersonGUI class

		tabbedPane.addTab("Supplier", null, supplierGUI, null); //Loads productGUI from ProductGUI class
		contentPane.setLayout(gl_contentPane);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
