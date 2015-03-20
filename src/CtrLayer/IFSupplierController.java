package CtrLayer;

import ModelLayer.Supplier;

public interface IFSupplierController {
	
	public int addSupplier(String name, String address, String country, String phoneNo, String email);
	
	public Supplier findSupplier(int id);
	
	public int updateSupplier(int id);
	
	public int deleteSupplier(int id);

}
