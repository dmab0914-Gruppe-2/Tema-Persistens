/**
 * 
 */
package CtrLayer;

import ModelLayer.Supplier;

/**
 * @author Andreas
 *
 */
public class SupplierController implements IFSupplierController {
	
	public SupplierController()
	{
		
	}

	/* (non-Javadoc)
	 * @see CtrLayer.IFSupplierController#addSupplier(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public int addSupplier(String name, String address, String country, String phoneNo, String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see CtrLayer.IFSupplierController#findSupplier(int)
	 */
	@Override
	public Supplier findSupplier(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see CtrLayer.IFSupplierController#updateSupplier(int)
	 */
	@Override
	public int updateSupplier(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see CtrLayer.IFSupplierController#deleteSupplier(int)
	 */
	@Override
	public int deleteSupplier(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
