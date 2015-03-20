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

	/**
	 * Create and add a new product
	 * @param supplierName
	 * @param name
	 * @param purchasePrice
	 * @param salesPrice
	 * @param countryOfOrigin
	 * @return
	 */
	public boolean addProduct(String supplierName, String name, double purchasePrice, double salesPrice,  String countryOfOrigin);
	
	public Product findProduct(String name);
	
	public boolean updateProduct(String oldName, String newName, double purchasePrice, double salesPrice, String countryOfOrigin);
	
	public boolean addItem(String productName, String warehouse, int amount);
	
	public boolean deleteProduct(String name);
}
