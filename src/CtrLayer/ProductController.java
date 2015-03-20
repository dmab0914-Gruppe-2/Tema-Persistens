/**
 * 
 */
package CtrLayer;

import DBLayer.DBProduct;
import DBLayer.IFDBProduct;
import ModelLayer.Product;

/**
 * @author Jacob
 *
 */
public class ProductController implements IFProductController {

	IFDBProduct dbProduct;
	
	public ProductController() {
		 dbProduct = new DBProduct();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see CtrLayer.IFProductController#addProduct(java.lang.String,
	 * java.lang.String, double, double)
	 */
	@Override
	public boolean addProduct(String supplierName, String name, double purchasePrice, double salesPrice, String countryOfOrigin) {
		Product p = new Product(supplierName, name, purchasePrice, salesPrice, countryOfOrigin);
		return dbProduct.addProduct(p);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CtrLayer.IFProductController#findProduct(java.lang.String)
	 */
	@Override
	public Product findProduct(String name) {
		return dbProduct.findProduct(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CtrLayer.IFProductController#updateProduct(java.lang.String,
	 * java.lang.String, double, double, java.lang.String)
	 */
	@Override
	public boolean updateProduct(String oldName, String newName, double purchasePrice, double salesPrice, String countryOfOrigin) {
		return dbProduct.updateProduct(oldName, newName, purchasePrice, salesPrice, countryOfOrigin);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CtrLayer.IFProductController#addItem(java.lang.String,
	 * java.lang.String, int)
	 */
	@Override
	public boolean addItem(String productName, String warehouse, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CtrLayer.IFProductController#deleteProduct(java.lang.String)
	 */
	@Override
	public boolean deleteProduct(String name) {
		return dbProduct.deleteProduct(name);
	}

}
