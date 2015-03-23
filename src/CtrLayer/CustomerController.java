package CtrLayer;

import DBLayer.DBCustomer;
import DBLayer.IFDBCustomer;
import ModelLayer.Customer;

public class CustomerController implements IFCustomerController {

	public void addCustomer(String name, String address, int zipCode,
			String city, String phoneNumber, String email) throws Exception {
		
		Customer cus = new Customer();
		cus.setName(name);
		cus.setAddress(address);
		cus.setZipCode(zipCode);
		cus.setCity(city);
		cus.setPhoneNumber(phoneNumber);
		cus.setEmail(email);

		try {
			IFDBCustomer dbCus = new DBCustomer();
			dbCus.insertCustomer(cus);
		} catch (Exception e) {
			throw new Exception("Customer not inserted");
		}
	}

	@Override
	public Customer findCustomer(String phoneNumber) {
		IFDBCustomer dbCus = new DBCustomer();
		return dbCus.findCustomer(phoneNumber, false);
	}

	@Override
	public int updateCustomer(int customerID, String name, String address,
			int zipCode, String city, String phoneNumber, String email) {

		IFDBCustomer dbCus = new DBCustomer();
		Customer cus = new Customer();
		cus.setCustomerID(customerID);
		cus.setName(name);
		cus.setAddress(address);
		cus.setZipCode(zipCode);
		cus.setCity(city);
		cus.setPhoneNumber(phoneNumber);
		cus.setEmail(email);

		try {
			return dbCus.updateCustomer(cus);
		} catch (Exception e) {
			System.out.println("Update exception in Customer db: " + e);
			return -1;
		}
	}

	@Override
	public int deleteCustomer(int id) {
	 IFDBCustomer dbCus = new DBCustomer();
	 return dbCus.delete(id);
	}

}
