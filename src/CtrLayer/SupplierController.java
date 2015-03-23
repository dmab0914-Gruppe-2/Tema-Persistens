/**
 *
 */
package CtrLayer;

import java.util.ArrayList;

import ModelLayer.Supplier;
import DBLayer.DBSupplier;

/**
 * @author Andreas
 *
 */
public class SupplierController implements IFSupplierController {

	DBSupplier dbSupplier;

	public SupplierController() {
		dbSupplier = new DBSupplier();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CtrLayer.IFSupplierController#addSupplier(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public int addSupplier(String name, String address, String country,
			String phoneNo, String email) {
		Supplier s = new Supplier(name, address, country, phoneNo, email);
		int i = -1;

		try {
			i = dbSupplier.addSupplier(s);
			if (i != -1) {
				System.out.println("Inserted Successfully\n " + "Rowcount: "
						+ i);
			} else {
				System.out.println("ERROR While inserting Supplier\n"
						+ "Rowcount: " + i);
			}// endIf
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}// endAddSupplier

	/*
	 * (non-Javadoc)
	 * 
	 * @see CtrLayer.IFSupplierController#findSupplier(int)
	 */
	@Override
	public Supplier findSupplierID(int id) {
		return (dbSupplier.findSupplier(id));
	}

	public Supplier findSupplierName(String name) {
		return dbSupplier.searchSupplier(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CtrLayer.IFSupplierController#updateSupplier(int)
	 */
	@Override
	public int updateSupplier(int id, String name, String address,
			String country, String phoneNo, String email) {
		Supplier s = dbSupplier.findSupplier(id);
		s.setAddress(address);
		s.setCountry(country);
		s.setEmail(email);
		s.setName(name);
		s.setPhoneno(phoneNo);

		return dbSupplier.update(s);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see CtrLayer.IFSupplierController#deleteSupplier(int)
	 */
	@Override
	public int deleteSupplier(int id) {
		return dbSupplier.delete(id);
	}

	public ArrayList<Supplier> getAllProducts() {
		return dbSupplier.getAllSuppliers();
	}

}
