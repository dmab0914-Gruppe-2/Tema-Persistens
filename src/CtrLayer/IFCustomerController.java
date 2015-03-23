package CtrLayer;

import ModelLayer.Customer;


/**
 * @author Ronnie
 *
 */
public interface IFCustomerController {

	public void addCustomer(String name, String address, int zipCode,
			String city, String phoneNumber, String email) throws Exception;

	public Customer findCustomer(String phoneNumber);

	public int updateCustomer(int customerID, String name, String address, int zipCode, String city, String phoneNumber, String email);

	public int deleteCustomer(String phoneNumber);
}
