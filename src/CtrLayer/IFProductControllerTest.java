/**
 * 
 */
package CtrLayer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ModelLayer.Supplier;

/**
 * @author Jacob
 *
 */
public class IFProductControllerTest {

	IFProductController productController;
	IFSupplierController supplierController;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		productController = new ProductController();
		supplierController = new SupplierController();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link CtrLayer.IFProductController#addProduct(ModelLayer.Supplier, java.lang.String, double, double, java.lang.String)}.
	 */
	@Test
	public final void testAddProduct() {
		Supplier supplier = supplierController.findSupplier(1);
		String name = "Grønne fine sko";
		double purchasePrice = 60;
		double salesPrice = 80;
		String countryOfOrigin = "Julemandens værksted";
		//boolean status = productController.addProduct(supplier, name, purchasePrice, salesPrice, countryOfOrigin);
		//System.out.println("addProduct Success = " + status);
	}

	/**
	 * Test method for {@link CtrLayer.IFProductController#findProduct(java.lang.String, boolean)}.
	 */
	@Test
	public final void testFindProduct() {
		if(productController.findProduct("Cowboy hats", false) != null) {
		}
		else {
			fail("findProduct ERROR");
		}
	}

	/**
	 * Test method for {@link CtrLayer.IFProductController#updateProduct(java.lang.String, java.lang.String, ModelLayer.Supplier, double, double, java.lang.String)}.
	 */
	@Test
	public final void testUpdateProduct() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link CtrLayer.IFProductController#addItem(java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public final void testAddItem() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link CtrLayer.IFProductController#deleteProduct(java.lang.String)}.
	 */
	@Test
	public final void testDeleteProduct() {
		fail("Not yet implemented"); // TODO
	}

}
