/**
 * 
 */
package DBLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ModelLayer.Product;
import ModelLayer.Supplier;

/**
 * @author Jacob
 *
 */
public class DBProduct implements IFDBProduct {

	private Connection con;
	private DBSupplier dbSupplier;

	public DBProduct() {
		con = DBConnection.getInstance().getDBcon();
		dbSupplier = new DBSupplier();
	}

	public ArrayList<Product> getAllProducts(boolean retriveAssociation) {
		return miscWhere("", retriveAssociation);
	}

	/* (non-Javadoc)
	 * @see DBLayer.IFDBProduct#addProduct(ModelLayer.Product)
	 */
	@Override
	public boolean addProduct(Product p) {
		if(findProduct(p.getName(), false) == null) {

			int rc = -1;
			String query="INSERT INTO Product(name, purchasePrice, salesPrice, countryOfOrigin, supplierID)  VALUES('"+
					p.getName()  + "','"  +
					p.getPurchasePrice()  + "','"  +
					p.getSalesPrice() + "','" +
					p.getCountryOfOrigin() + "','" +
					p.getSupplier().getId() + "')";


			System.out.println("insert : " + query);
			try{
				Statement stmt = con.createStatement();
				stmt.setQueryTimeout(5);
				rc = stmt.executeUpdate(query);
				stmt.close();
			}//end try
			catch(SQLException ex){
				System.out.println("Product haven't been created");
				//throw new Exception ("Product is not added correctly");
			}
			if(rc == 0) {
				return false;
			}
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see DBLayer.IFDBProduct#findProduct(java.lang.String)
	 */
	@Override
	public Product findProduct(String name, boolean retriveAssociation) {
		String wClause = "  name = '" + name + "'";
		return singleWhere(wClause, retriveAssociation);
	}

	/* (non-Javadoc)
	 * @see DBLayer.IFDBProduct#updateProduct(java.lang.String, java.lang.String, double, double, java.lang.String)
	 */
	@Override
	public boolean updateProduct(String oldName, String newName, Supplier supplier, double purchasePrice, double salesPrice, String countryOfOrigin) {
		int rc=-1;

		String query="UPDATE Product SET "+
				"name ='"+ newName+"', "+
				"purchasePrice ='"+ purchasePrice + "', " +
				"salesPrice ='"+ salesPrice + "', " +
				"countryOfOrigin ='"+ countryOfOrigin + "' " +
				"supplier ='"+ supplier.getId() + "' " +
				" WHERE name = '"+ oldName + "'";
		System.out.println("Update query:" + query);
		try{ // update product
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);

			stmt.close();
		}//end try
		catch(Exception ex){
			System.out.println("Update exception in employee db: "+ex);
		}
		if(rc == 0) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see DBLayer.IFDBProduct#deleteProduct(java.lang.String)
	 */
	@Override
	public boolean deleteProduct(String name) {
		int rc=-1;

		String query="DELETE FROM Product WHERE name = '" +
				name + "'";
		System.out.println(query);
		try{ // delete from product
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}//end try	
		catch(Exception ex){
			System.out.println("Delete exception in product db: "+ex);
		}
		if(rc == 0) {
			return false;
		}
		return true;
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
			if(retrieveAssociation)
			{   //The supplier is to be build as well
				for(Product productObj : list){
					int supplierID = productObj.getSupplier().getId();
					Supplier supplier = dbSupplier.findSupplier(supplierID);
					productObj.setSupplier(supplier);
					System.out.println("supplier have been added");
				}
			}//end if 
		}// end try
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
				if(retrieveAssociation)
				{   
					int supplierID = productObj.getSupplier().getId();
					Supplier supplier = dbSupplier.findSupplier(supplierID);
					productObj.setSupplier(supplier);
					System.out.println("supplier have been added");
				}

			} else { // no employee was found
				productObj = null;
			}
		}// end try
		catch (Exception e) {
			System.out.println("Query exception: " + e);
		}
		return productObj;
	}

	//TODO change to product
	private String buildQuery(String wClause) {
		String query = "SELECT productID, name, purchasePrice, salesPrice, countryOfOrigin, supplierID FROM product";

		if (wClause.length() > 0)
			query = query + " WHERE " + wClause;

		return query;
	}

	private Product buildProduct(ResultSet results) {
		Product productObj = new Product();
		try { // the columns from the table Customer are used
			productObj.setId(results.getInt("productID"));
			productObj.setName(results.getString("name"));
			productObj.setPurchasePrice(results.getDouble("purchasePrice"));
			productObj.setSalesPrice(results.getDouble("salesPrice"));
			productObj.setCountryOfOrigin(results.getString("countryOfOrigin"));
			productObj.setSupplier(new Supplier(results.getInt("supplierID")));

		} catch (Exception e) {
			System.out.println("error in building the Product object");
		}
		return productObj;
	}

}
