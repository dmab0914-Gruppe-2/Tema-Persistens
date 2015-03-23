/**
 * 
 */
package CtrLayer;

import java.util.ArrayList;

import DBLayer.DBProduct;
import DBLayer.IFDBProduct;
import ModelLayer.Product;
import ModelLayer.Supplier;

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
	public boolean addProduct(Supplier supplier, String name, double purchasePrice, double salesPrice, String countryOfOrigin) {
		Product p = new Product(supplier, name, purchasePrice, salesPrice, countryOfOrigin);
		return dbProduct.addProduct(p);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CtrLayer.IFProductController#findProduct(java.lang.String)
	 */
	@Override
	public Product findProduct(String name, boolean retriveAssociation) {
		return dbProduct.findProduct(name, retriveAssociation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CtrLayer.IFProductController#updateProduct(java.lang.String,
	 * java.lang.String, double, double, java.lang.String)
	 */
	@Override
	public boolean updateProduct(String oldName, String newName, Supplier supplier, double purchasePrice, double salesPrice, String countryOfOrigin) {
		return dbProduct.updateProduct(oldName, newName, supplier, purchasePrice, salesPrice, countryOfOrigin);
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
	
	public ArrayList<Product> getAllProducts() {
		return dbProduct.getAllProducts(true);
	}

}
