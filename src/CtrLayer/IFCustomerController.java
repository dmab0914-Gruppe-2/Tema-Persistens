package CtrLayer;

import ModelLayer.Customer;


/**
 * @author Ronnie
 *
 */
public interface IFCustomerController {

	public boolean addCustomer(String name, String address, String zipCode,
			String city, String phoneNumber, String email);

	public Customer findCustomer(String phoneNumber);

	public boolean updateCustomer(String oldName, String newName,
			String oldAddress, String newAddress, String oldZipCode,
			String newZipCode, String oldCity, String newCity, String oldEmail,
			String newEmail);

	public boolean deleteCustomer(String phoneNumber);
}
