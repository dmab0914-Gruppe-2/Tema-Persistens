package CtrLayer;

import ModelLayer.Customer;


/**
 * @author Ronnie
 *
 */
public interface IFCustomerController {

	public boolean addCustomer(int CustomerID, String name, String address, int zipCode,
			String city, String phoneNumber, String email);

	public Customer findCustomer(String phoneNumber);

	public boolean updateCustomer(int oldCustomerID, int newCustomerID, String oldName, String newName,
			String oldAddress, String newAddress, int oldZipCode,
			int newZipCode, String oldCity, String newCity, String oldEmail,
			String newEmail);

	public boolean deleteCustomer(String phoneNumber);
}
