/**
 * 
 */
package DBLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import ModelLayer.Product;

/**
 * @author Jacob
 *
 */
public class DBProduct implements IFDBProduct {

	private Connection con;
	
	public DBProduct() {
		con = DBConnection.getInstance().getDBcon();
	}
	
	public ArrayList<Product> getAllProducts() {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see DBLayer.IFDBProduct#addProduct(ModelLayer.Product)
	 */
	@Override
	public boolean addProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see DBLayer.IFDBProduct#findProduct(java.lang.String)
	 */
	@Override
	public Product findProduct(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see DBLayer.IFDBProduct#updateProduct(java.lang.String, java.lang.String, double, double, java.lang.String)
	 */
	@Override
	public boolean updateProduct(String oldName, String newName,
			double purchasePrice, double salesPrice, String countryOfOrigin) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see DBLayer.IFDBProduct#deleteProduct(java.lang.String)
	 */
	@Override
	public boolean deleteProduct(String name) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private ArrayList<Product> miscWhere(String wClause, boolean retrieveAssociation) {
		ResultSet results;
		ArrayList<Product> list = new ArrayList<Product>();

		String query = buildQuery(wClause);

		try { // read the Customer from the database
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);

			while (results.next()) {
				Product productObj = new Product(); 
				productObj = buildProduct(results);
				list.add(productObj);
			}// end while
			stmt.close();
		}// slut try
		catch (Exception e) {
			System.out.println("Query exception - select: " + e);
			e.printStackTrace();
		}
		return list;
	}
	
	private Product singleWhere(String wClause, boolean retrieveAssociation) {
		ResultSet results;
		Product productObj = new Product();

		String query = buildQuery(wClause);
		System.out.println(query);
		try { // read the employee from the database
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);

			if (results.next()) {
				productObj = buildProduct(results);
				// Association is to be build
				stmt.close();

			} else { // no employee was found
				productObj = null;
			}
		}// end try
		catch (Exception e) {
			System.out.println("Query exception: " + e);
		}
		return productObj;
	}

	
	private Product buildProduct(ResultSet results) {
		Product productObj = new Product();
		try { // the columns from the table Customer are used
			productObj.setId(results.getInt("productID"));
			productObj.setName(results.getString("name"));
			productObj.setPurchasePrice(results.getDouble("purchasePrice"));
			productObj.setSalesPrice(results.getDouble("salesPrice"));
			productObj.setCountryOfOrigin(results.getString("countryOfOrigin"));
			//productObj.setSupplier(supplier);

		} catch (Exception e) {
			System.out.println("error in building the Customer object");
		}
		return productObj;
	}

	//TODO change to product
	private String buildQuery(String wClause) {
		String query = "SELECT customerID, name, address, zipcode, city, phoneno, email FROM Customer";

		if (wClause.length() > 0)
			query = query + " WHERE " + wClause;

		return query;
	}

}
