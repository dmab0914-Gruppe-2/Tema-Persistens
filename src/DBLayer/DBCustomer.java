package DBLayer;

import ModelLayer.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ModelLayer.Customer;

public class DBCustomer implements IFDBCustomer {
	private Connection con;

	/** Creates a new instance of DBCustomer */
	public DBCustomer() {
		con = DBConnection.getInstance().getDBcon();
	}

	// Implements the methods from the interface
	// get all Customers
	public ArrayList<Customer> getAllCustomers(boolean retriveAssociation) {
		return miscWhere("", retriveAssociation);
	}

	// Find one Customer by phone number
	public Customer findCustomer(String phoneno, boolean retriveAssociation) {
		String wClause = " phoneno = '" + phoneno + "'";
		return singleWhere(wClause, retriveAssociation);
	}

	// find one Customer by name
	public Customer searchCustomerName(String name, boolean retriveAssociation) {
		String wClause = " name like '%" + name + "%'";
		return singleWhere(wClause, retriveAssociation);
	}

	// insert a new Customer
	public int insertCustomer(Customer cus) throws Exception {
		int rc = -1;
		String query = "INSERT INTO Customer(name, address, zipCode, city, phoneno, email) VALUES('"
				+ cus.getName()
				+ "','"
				+ cus.getAddress()
				+ "',"
				+ cus.getZipCode()
				+ ",'"
				+ cus.getCity()
				+ "','"
				+ cus.getPhoneNumber() + "','" + cus.getEmail() + "')";

		System.out.println("insert : " + query);
		try { // insert new Customer
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}// end try
		catch (SQLException ex) {
			System.out.println("Customer ikke oprettet");
			throw new Exception("Customer is not inserted correct");
		}
		return (rc);
	}

	@Override
	public int updateCustomer(Customer cus) throws Exception {
		Customer cusObj = cus;
		int rc = -1;

		String query = "UPDATE Customer SET " + "name ='" + cusObj.getName()
				+ "', " + "address ='" + cusObj.getAddress() + "', "
				+ "zipCode = " + cusObj.getZipCode() + ", " + "city = "
				+ cusObj.getCity() + ", " + "phoneno = "
				+ cusObj.getPhoneNumber() + ", " + "email = "
				+ cusObj.getEmail() + " WHERE CustomerID = '"
				+ cusObj.getCustomerID() + "'";
		System.out.println("Update query:" + query);

		try { // update Customer
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);

			stmt.close();
		}// slut try
		catch (Exception ex) {
			System.out.println("Update exception in Customer db: " + ex);
		}

		return rc;
	}

	@Override
	public Customer searchCustomerPhone(String phone, boolean b) {
		String wClause = " phoneno = '" + phone + "'";
		return singleWhere(wClause, b);
	}

	public int delete(String phone) {
		int rc = -1;

		String query = "DELETE FROM Customer WHERE phoneno = '" + phone + "'";
		System.out.println("DELETE query:" + query);
		try { // delete from Customer
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}// slut try
		catch (Exception ex) {
			System.out.println("Delete exception in Customer db: " + ex);
		}
		return (rc);
	}

	// private methods
	// michWere is used whenever we want to select more than one Customer

	private ArrayList<Customer> miscWhere(String wClause,
			boolean retrieveAssociation) {
		ResultSet results;
		ArrayList<Customer> list = new ArrayList<Customer>();

		String query = buildQuery(wClause);

		try { // read the Customer from the database
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);

			while (results.next()) {
				Customer cusObj = new Customer(); // TODO
				cusObj = buildCustomer(results);
				list.add(cusObj);
			}// end while
			stmt.close();
		}// slut try
		catch (Exception e) {
			System.out.println("Query exception - select: " + e);
			e.printStackTrace();
		}
		return list;
	}

	// Singelwhere is used when we only select one Customer
	private Customer singleWhere(String wClause, boolean retrieveAssociation) {
		ResultSet results;
		Customer cusObj = new Customer();

		String query = buildQuery(wClause);
		System.out.println(query);
		try { // read the employee from the database
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);

			if (results.next()) {
				cusObj = buildCustomer(results);
				// assocaition is to be build
				stmt.close();

			} else { // no employee was found
				cusObj = null;
			}
		}// end try
		catch (Exception e) {
			System.out.println("Query exception: " + e);
		}
		return cusObj;
	}

	// method to build an Customer object
	private Customer buildCustomer(ResultSet results) {
		Employee empObj = new Employee();
        try{ // the columns from the table emplayee  are used
              empObj.setFname(results.getString("fname"));
              empObj.setMinit(results.getString("minit"));
              empObj.setLname(results.getString("lname"));
              empObj.setSsn(results.getString("ssn"));
              empObj.setBdate(results.getString("bdate"));
              empObj.setAddress(results.getString("address"));
              empObj.setSex(results.getString("sex"));
              empObj.setSalary(results.getDouble("salary"));
              empObj.setSupervisor(new Employee(results.getString("superssn")));
              empObj.setDepartment(new Department(results.getInt("dno")));
        }
       catch(Exception e)
       {
           System.out.println("error in building the employee object");
       }
       return empObj;
	}

	// method to build the query
	private String buildQuery(String wClause) {
		// String
		// query="SELECT fname, minit,lname,ssn, address, bdate,sex, salary, superssn,dno  FROM employee";
		String query = "";
		if (wClause.length() > 0)
			query = query + " WHERE " + wClause;

		return query;
	}
}
