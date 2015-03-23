package CtrLayer;

import ModelLayer.Supplier;

public interface IFSupplierController {

	public int addSupplier(String name, String address, String country,
			String phoneNo, String email);

	public Supplier findSupplierID(int id);

	public Supplier findSupplierName(String name);

	public int deleteSupplier(int id);

	public int updateSupplier(int id, String name, String address,
			String country, String phoneNo, String email);

}
