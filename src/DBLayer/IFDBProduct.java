/**
 * 
 */
package DBLayer;

import java.util.ArrayList;

import ModelLayer.Product;
import ModelLayer.Supplier;

/**
 * @author Jacob
 *
 */
public interface IFDBProduct {
	
	public ArrayList<Product> getAllProducts(boolean retriveAssociation);

	public boolean addProduct(Product p);
	
	public Product findProduct(String name, boolean retriveAssociation);
	
	public boolean updateProduct(String oldName, String newName, Supplier supplier, double purchasePrice, double salesPrice, String countryOfOrigin);
	
	public boolean deleteProduct(String name);
	
}