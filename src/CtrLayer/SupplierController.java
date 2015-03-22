/**
 *
 */
package CtrLayer;

import ModelLayer.Supplier;
import DBLayer.DBSupplier;

/**
 * @author Andreas
 *
 */
public class SupplierController implements IFSupplierController {

	DBSupplier dbSupplier;
	
	
	public SupplierController()
	{
		DBSupplier dbSupplier = new DBSupplier();
	}

	/* (non-Javadoc)
	 * @see CtrLayer.IFSupplierController#addSupplier(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public int addSupplier(String name, String address, String country, String phoneNo, String email) {
		Supplier s = new Supplier(name, address, country, phoneNo, email);
		int i = -1;
		try {
			i = dbSupplier.addSupplier(s);
			if(i != -1)
			{
				System.out.println("Inserted Successfully\n "
						+ "Rowcount: "+i);
			}
			else
			{
				System.out.println("ERROR While inserting Supplier\n"
						+ "Rowcount: "+i);
			}//endIf
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}//endAddSupplier

	/* (non-Javadoc)
	 * @see CtrLayer.IFSupplierController#findSupplier(int)
	 */
	@Override
	public Supplier findSupplier(int id) {
		return (dbSupplier.findSupplier(id));
	}

	/* (non-Javadoc)
	 * @see CtrLayer.IFSupplierController#updateSupplier(int)
	 */
	@Override
	public int updateSupplier(int id, String name, String address, String country, String phoneNo, String email) {
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see CtrLayer.IFSupplierController#deleteSupplier(int)
	 */
	@Override
	public int deleteSupplier(int id) {
		return dbSupplier.delete(id);
	}

	@Override
	public int updateSupplier(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
