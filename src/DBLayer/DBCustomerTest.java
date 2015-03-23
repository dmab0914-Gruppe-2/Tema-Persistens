package DBLayer;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import ModelLayer.Customer;

public class DBCustomerTest {
	private DBCustomer DBCustomer;

	/*
	 * @Test public void testDBCustomer() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetAllCustomers() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testFindCustomer() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testSearchCustomerName() { fail("Not yet implemented");
	 * }
	 * 
	 * @Test public void testInsertCustomer() { fail("Not yet implemented"); }
	 */
	@Test
	public void testUpdateCustomer() {

		// fail("failed");
	}

	@Test
	public void testSearchCustomerPhone() {
		
		/*Customer cus = DBCustomer.findCustomer("12345678", false);
		//cus = DBCustomer.findCustomer("12345678", false);
		if (cus.getName().length() >= 1) {
			System.out.println("Customer found " + cus.getName() + "");
		} else {
			fail("FAILED none found");
		}*/
		
		Customer cus = new Customer(1, "nick", "vej", 9800, "hjorring", "22403382", "welle93@gmail.com");
		
		try{
			System.out.println(cus.getName());
		DBCustomer.insertCustomer(cus);
		}
		catch (Exception e) {
			System.out.println(e);
		} 
	}
	/*
	 * @Test public void testDelete() { fail("Not yet implemented"); }
	 */
}
