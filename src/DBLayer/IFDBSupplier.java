package DBLayer;
import ModelLayer.*;
import java.util.ArrayList;

public interface IFDBSupplier {
	//get all departments
	public ArrayList<Supplier> getAllSuppliers(boolean retrieveAssociation);
	
	//get one Supplier having ID
	public Supplier findSupplier(int sno, boolean retrieveAssociation);
	
	//find one supplier having the supplier name
	public Supplier searchSupplierByName(String sname, boolean retrieveAssociation);
	
	//insert new supplier
	public int insert(Supplier s);
	
	//update Supplier
	public int update (Supplier s);
	
	//delete supplier
	public int delete(Supplier s);

}
