package CtrLayer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ModelLayer.Customer;

public class CustomerControllerTest {
	CustomerController customerController;
	
	@Before
	public void setUp() throws Exception {
		customerController = new CustomerController();
	}


	/*@Test
	public void testGetAllCustomers() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testFindCustomer() {
		
		if(customerController.findCustomer("12345678") != null){
		
		} else
		fail("Not yet implemented");
	}
/*
	@Test
	public void testSearchCustomerName() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testInsertCustomer() {
		
		try {
			customerController.addCustomer("nicklas", "vej", 9800, "hjørring", "11223344", "test@mail.com");
		} catch (Exception e) {
			fail("cant insert");
		}
		Customer cus = customerController.findCustomer("11223344");
		if(cus.getName().equals("nicklas")){
			
		}else 
		fail("fail cant find the new customer");
	}

	@Test
	public void testUpdateCustomer() {
		Customer cus = customerController.findCustomer("12345678");
		
		int u = customerController.updateCustomer(cus.getCustomerID(), "Mogens Fisker", "ny vej 22", 9800, "Hjørring", "12345678", "mf@test.dk");
		
		if(u==1){
		
		}else
			fail("fail");
	}

	@Test
	public void testDelete() {
		
		try {
			customerController.addCustomer("jens", "gade", 9800, "hjørring", "99887744", "jens@mail.com");
		} catch (Exception e) {
			fail("cant insert customer to delete");
		}
		Customer cus = customerController.findCustomer("99887744");
		int d = customerController.deleteCustomer(cus.getCustomerID());
		if(d == 1){
		
		}else
		fail("FAIL");
	}

}
