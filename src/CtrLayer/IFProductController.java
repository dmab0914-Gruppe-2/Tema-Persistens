/**
 * 
 */
package CtrLayer;

import ModelLayer.Product;

/**
 * @author Jacob
 *
 */
public interface IFProductController {

	public boolean addProduct(String supplierName, String name, double PurchasePrice, double salesPrice);
	
	public Product findProduct(String name);
	
	public boolean updateProduct(String oldName, String newName, double purchasePrice, double SalesPrice, String countryOfOrigin);
	
	public boolean addItem(String productName, String warehouse, int amount);
	
	public boolean deleteProduct(String name);
}
