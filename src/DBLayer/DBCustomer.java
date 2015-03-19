package DBLayer;
import ModelLayer.*;
import java.util.ArrayList;

import ModelLayer.Customer;

public class DBCustomer implements IFDBCustomer {

	@Override
	public ArrayList<Customer> getAllCustomers(boolean retriveAssociation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomer(String phoneno, boolean retriveAssociation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer searchCustomerName(String name, boolean retriveAssociation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertCustomer(Customer cus) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCustomer(Customer cus) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer searchCustomerPhone(String phone, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

}
