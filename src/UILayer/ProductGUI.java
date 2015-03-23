package UILayer;

import javax.swing.JPanel;
import javax.swing.JLayeredPane;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Component;

import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import CtrLayer.ProductController;
import ModelLayer.Product;

@SuppressWarnings("serial")
public class ProductGUI extends JPanel {

	ProductController productController;

	JButton btnListAllProducts;
	JButton btnFindProdukt;
	JButton btnClearFields;
	private JTextField textField_Name;
	private JTextField textField_PurchasePrice;
	private JTextField textField_SalesPrice;
	private JTextField textField_CountryOfOrigin;
	private JTextField textField_SupplierName;
	private JTextField textField_search;

	/**
	 * Create the panel.
	 */
	public ProductGUI() {
		productController = new ProductController();
		setMinimumSize(new Dimension(750, 500));
		setPreferredSize(new Dimension(750, 500));

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setMinimumSize(new Dimension(750, 500));
		layeredPane.setPreferredSize(new Dimension(750, 500));

		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setMinimumSize(new Dimension(250, 500));
		panel.setPreferredSize(new Dimension(250, 500));

		JPanel panel_1 = new JPanel();

		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		GroupLayout gl_layeredPane = new GroupLayout(layeredPane);
		gl_layeredPane.setHorizontalGroup(
				gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 602, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		gl_layeredPane.setVerticalGroup(
				gl_layeredPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_layeredPane.createSequentialGroup()
						.addGroup(gl_layeredPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 489, Short.MAX_VALUE)
								.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
								.addContainerGap())
								.addComponent(separator_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
				);

		JLabel lblName = new JLabel("Name");

		JLabel lblPurchaseprice = new JLabel("purchasePrice");

		JLabel lblSalesprice = new JLabel("salesPrice");

		JLabel lblCountryoforigin = new JLabel("countryOfOrigin");

		JLabel lblSupplierName = new JLabel("supplier name");

		textField_Name = new JTextField();
		textField_Name.setColumns(10);

		textField_PurchasePrice = new JTextField();
		textField_PurchasePrice.setColumns(10);

		textField_SalesPrice = new JTextField();
		textField_SalesPrice.setColumns(10);

		textField_CountryOfOrigin = new JTextField();
		textField_CountryOfOrigin.setColumns(10);

		textField_SupplierName = new JTextField();
		textField_SupplierName.setColumns(10);

		JButton btnSave = new JButton("Save");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
										.addGap(18)
										.addComponent(lblName, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(textField_Name, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
										.addGap(3))
										.addGroup(gl_panel_1.createSequentialGroup()
												.addGap(15)
												.addComponent(lblPurchaseprice, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(textField_PurchasePrice, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
												.addGap(3))
												.addGroup(gl_panel_1.createSequentialGroup()
														.addGap(17)
														.addComponent(lblSalesprice, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(textField_SalesPrice, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
														.addGap(2))
														.addGroup(gl_panel_1.createSequentialGroup()
																.addGap(13)
																.addComponent(lblCountryoforigin, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(textField_CountryOfOrigin, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
																.addGroup(gl_panel_1.createSequentialGroup()
																		.addGap(12)
																		.addComponent(lblSupplierName, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
																		.addPreferredGap(ComponentPlacement.UNRELATED)
																		.addComponent(textField_SupplierName, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
																		.addGap(2))
																		.addGroup(gl_panel_1.createSequentialGroup()
																				.addGap(178)
																				.addComponent(btnSave, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
																				.addGap(103)))
																				.addGap(264))
				);
		gl_panel_1.setVerticalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
										.addGap(34)
										.addComponent(textField_Name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_1.createSequentialGroup()
												.addGap(38)
												.addComponent(lblName)))
												.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_panel_1.createSequentialGroup()
																.addGap(30)
																.addComponent(textField_PurchasePrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																.addGroup(gl_panel_1.createSequentialGroup()
																		.addGap(31)
																		.addComponent(lblPurchaseprice)))
																		.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																				.addGroup(gl_panel_1.createSequentialGroup()
																						.addGap(29)
																						.addComponent(textField_SalesPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																						.addGroup(gl_panel_1.createSequentialGroup()
																								.addGap(32)
																								.addComponent(lblSalesprice)))
																								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																										.addGroup(gl_panel_1.createSequentialGroup()
																												.addGap(27)
																												.addComponent(textField_CountryOfOrigin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																												.addGroup(gl_panel_1.createSequentialGroup()
																														.addGap(33)
																														.addComponent(lblCountryoforigin)))
																														.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																																.addGroup(gl_panel_1.createSequentialGroup()
																																		.addGap(138)
																																		.addComponent(btnSave))
																																		.addGroup(gl_panel_1.createSequentialGroup()
																																				.addGap(24)
																																				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
																																						.addComponent(lblSupplierName)
																																						.addComponent(textField_SupplierName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
																																						.addContainerGap(128, Short.MAX_VALUE))
				);
		panel_1.setLayout(gl_panel_1);

		btnListAllProducts = new JButton("List all Products");

		textField_search = new JTextField();
		textField_search.setColumns(10);

		btnFindProdukt = new JButton("Find Product");

		JButton btnNewProdukt = new JButton("New product");

		btnClearFields = new JButton("Clear Fields");

		JButton btnDeleteProdukt = new JButton("Delete Product");

		JLabel lblProduct = new JLabel("Product");
		lblProduct.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JSeparator separator = new JSeparator();

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
										.addGap(11)
										.addComponent(lblProduct))
										.addGroup(gl_panel.createSequentialGroup()
												.addContainerGap()
												.addComponent(btnFindProdukt, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
												.addGroup(gl_panel.createSequentialGroup()
														.addContainerGap()
														.addComponent(textField_search, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
														.addGroup(gl_panel.createSequentialGroup()
																.addContainerGap()
																.addComponent(btnDeleteProdukt, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
																.addGroup(gl_panel.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(btnListAllProducts, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
																		.addContainerGap())
																		.addGroup(gl_panel.createSequentialGroup()
																				.addContainerGap(144, Short.MAX_VALUE)
																				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
																				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
																						.addContainerGap()
																						.addComponent(btnClearFields, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
																						.addContainerGap())
																						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
																								.addContainerGap()
																								.addComponent(btnNewProdukt, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
																								.addContainerGap())
				);
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGap(16)
						.addComponent(lblProduct)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(textField_search, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnFindProdukt)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnClearFields)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnNewProdukt)
						.addGap(10)
						.addComponent(btnDeleteProdukt)
						.addGap(18)
						.addComponent(btnListAllProducts)
						.addGap(116)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(123, Short.MAX_VALUE))
				);
		panel.setLayout(gl_panel);
		layeredPane.setLayout(gl_layeredPane);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(5)
						.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				);
		setLayout(groupLayout);

		actionListeners();
	}

	private void actionListeners() {
		btnListAllProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductsListGUI.main(null); //Open ProductListGUI in new window.
			}
		});
		btnFindProdukt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search = textField_search.getText();
				Product product = productController.findProduct(search, true);
				textField_Name.setText(product.getName());
				textField_PurchasePrice.setText(Double.toString(product.getPurchasePrice()));
				textField_SalesPrice.setText(Double.toString(product.getSalesPrice()));
				textField_CountryOfOrigin.setText(product.getCountryOfOrigin());
				textField_SupplierName.setText(product.getSupplier().getName());
			}
		});
		btnClearFields.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_search.setText("");
				textField_Name.setText("");
				textField_PurchasePrice.setText("");
				textField_SalesPrice.setText("");
				textField_CountryOfOrigin.setText("");
				textField_SupplierName.setText("");
			}
		});
	}
}
