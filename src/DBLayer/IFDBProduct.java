/**
 * 
 */
package DBLayer;

import java.util.ArrayList;

import ModelLayer.Product;

/**
 * @author Jacob
 *
 */
public interface IFDBProduct {
	
	public ArrayList<Product> getAllProducts();

	public boolean addProduct(Product p);
	
	public Product findProduct(String name);
	
	public boolean updateProduct(String oldName, String newName, double purchasePrice, double salesPrice, String countryOfOrigin);
	
	public boolean deleteProduct(String name);
	
}