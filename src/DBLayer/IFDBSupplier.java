package DBLayer;
import ModelLayer.*;
import java.util.ArrayList;

public interface IFDBSupplier {
	//get all departments
	public ArrayList<Supplier> getAllSuppliers();
	
	//get one Supplier having ID
	public Supplier findSupplier(int sno);
	
	//find one supplier having the supplier name
	public Supplier searchSupplierByName(String sname);
	
	//insert new supplier
	public int insert(Supplier s);
	
	//update Supplier
	public int update (Supplier s);
	
	//delete supplier
	public int delete(Supplier s);

}
