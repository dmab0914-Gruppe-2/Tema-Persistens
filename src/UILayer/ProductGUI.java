package UILayer;

import javax.swing.JPanel;
import javax.swing.JLayeredPane;

import java.awt.Dimension;

import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Component;

import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;

public class ProductGUI extends JPanel {
	
	JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public ProductGUI() {
		setMinimumSize(new Dimension(750, 500));
		setPreferredSize(new Dimension(750, 500));
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setMinimumSize(new Dimension(750, 500));
		layeredPane.setPreferredSize(new Dimension(750, 500));
		
		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setMinimumSize(new Dimension(250, 500));
		panel.setPreferredSize(new Dimension(250, 500));
		
		JSeparator separator = new JSeparator();
		
		JPanel panel_1 = new JPanel();
		GroupLayout gl_layeredPane = new GroupLayout(layeredPane);
		gl_layeredPane.setHorizontalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 602, GroupLayout.PREFERRED_SIZE)
					.addGap(129)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_layeredPane.setVerticalGroup(
			gl_layeredPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 489, Short.MAX_VALUE)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JLabel lblName = new JLabel("Name");
		
		JLabel lblPurchaseprice = new JLabel("purchasePrice");
		
		JLabel lblSalesprice = new JLabel("salesPrice");
		
		JLabel lblCountryoforigin = new JLabel("countryOfOrigin");
		
		JLabel lblSupplierid = new JLabel("supplierID");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JButton button_2 = new JButton("Cancel");
		
		JButton button_3 = new JButton("Save");
		
		JButton button_1 = new JButton("Revert Changes");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(113)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(18)
							.addComponent(lblName)
							.addGap(58)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(15)
							.addComponent(lblPurchaseprice)
							.addGap(21)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(17)
							.addComponent(lblSalesprice)
							.addGap(40)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(13)
							.addComponent(lblCountryoforigin)
							.addGap(16)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(12)
							.addComponent(lblSupplierid)
							.addGap(44)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(125, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(34)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(38)
							.addComponent(lblName)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(31)
							.addComponent(lblPurchaseprice))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(30)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(29)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(32)
							.addComponent(lblSalesprice)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(33)
							.addComponent(lblCountryoforigin))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(27)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(24)
							.addComponent(lblSupplierid))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(21)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(button_2)
							.addComponent(button_3))
						.addComponent(button_1, Alignment.TRAILING))
					.addGap(47))
		);
		panel_1.setLayout(gl_panel_1);
		
		btnNewButton = new JButton("List all Products");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JButton btnFindProdukt = new JButton("Find Product");
		
		JButton btnNewProdukt = new JButton("New product");
		
		JButton button = new JButton("Clear Fields");
		
		JButton btnDeleteProdukt = new JButton("Delete Product");
		
		JLabel lblProduct = new JLabel("Product");
		lblProduct.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewProdukt)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(11)
							.addComponent(lblProduct))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnFindProdukt))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnDeleteProdukt, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(119, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(16)
					.addComponent(lblProduct)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnFindProdukt)
					.addGap(15)
					.addComponent(btnNewProdukt)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDeleteProdukt)
					.addGap(18)
					.addComponent(btnNewButton)
					.addContainerGap(241, Short.MAX_VALUE))
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductsListGUI.main(null); //Open ProductListGUI in new window.
			}
		});
	}
}
