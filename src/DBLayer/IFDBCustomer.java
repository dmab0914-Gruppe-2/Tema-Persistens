/**
 * 
 */
package DBLayer;

import ModelLayer.*;

import java.util.ArrayList;

/**
 * @author nicklas
 *
 */
public interface IFDBCustomer {
	// get all Customers
	public ArrayList<Customer> getAllCustomers(boolean retriveAssociation);

	// get one customer by phone number
	public Customer findCustomer(String phoneno, boolean retriveAssociation);

	// find one employee having the name
	public Customer searchCustomerName(String name, boolean retriveAssociation);

	// insert a new Customer
	public int insertCustomer(Customer cus) throws Exception;

	// update Customer information
	public int updateCustomer(Customer cus) throws Exception;

	public Customer searchCustomerPhone(String phone, boolean b);
}
