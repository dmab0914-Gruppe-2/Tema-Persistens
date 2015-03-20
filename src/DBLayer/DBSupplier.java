package DBLayer;

import java.sql.*;
import java.util.*;

import ModelLayer.*;


/**
 * @author Andreas
 *
 */
public class DBSupplier {

	private Connection con;
	
	public DBSupplier(){
		con = DBConnection.getInstance().getDBcon();
	}
	
	public ArrayList<Supplier> getAllSuppliers( )
	{
		return miscWhere("");
	}
	
	public Supplier findSupplier(int id  )
	{
		String wClause = " supplierID" + id + "'";
		return singleWhere(wClause );
	}//endFindSupplier
	
	public Supplier searchSupplier(String sname, boolean ra)
	{
		String wClause = "name like %" + sname + "%'";
		System.out.println("Search Supplier: "+ wClause);
		return singleWhere(wClause);
	}
	
	public int insert (Supplier s) throws Exception
	{
		int rc = -1;
		String query="INSERT INTO Supplier(name, address, country, phoneNo, email)	VALUES('"+
		s.getName() 	+ "','" +
		s.getAddress()	+ "','" +
		s.getCountry()	+ "','" +
		s.getPhoneno()	+ "','" +
		s.getEmail()	+ "')";
		
		System.out.println("insert: "+query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}//endTry
		catch(SQLException e)
		{
			System.out.println("Supplier not created!");
			throw new Exception("Supplier is not inserted correctly!");
		}//endCatch
		return rc;
	}//endInsert
	
	public int update(Supplier s)
	{
		int rc=-1;
		
		String query="UPDATE Supplier SET "+
		"name ='" + s.getName() +"', "+
		"address ='" + s.getAddress()+"', "+
		"country ='" + s.getCountry()+"', "+
		"phoneNo ='" + s.getCountry()+"', "+
		"email ='"   + s.getEmail()+"'";
		System.out.println("Update query: " + query);
		
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}//endTry
		catch(SQLException e)
		{
			System.out.println("Update Exception in Supplier: " +e);
		}//endCatch
		return rc;
	}//endUpdate
	
	public int delete(int id)
	{
		int rc = -1;
		
		String query="DELETE FROM Supplier WHERE supplierID = '"+
		id + "'";
		System.out.println(query);
		try
		{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}//endTry
		catch(SQLException e)
		{
			System.out.println("Update exception in Supplier database: "+e);
		}
		return rc;
	}
	
	public ArrayList<Supplier> miscWhere(String wClause )
	{
		ResultSet results;
		ArrayList<Supplier> list = new ArrayList<Supplier>();
		String query = buildQuery(wClause);
		
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);
			
			while(results.next())
			{
				Supplier s = new Supplier();
				s = buildSupplier(results);
				list.add(s);
			}//endWhile
			stmt.close();
		}//endTry
		catch(Exception e)
		{
			System.out.println("Query exception - select: "+e);
			e.printStackTrace();
		}//endCatch
		return list;
	}//endMiscWhere
	
	private Supplier singleWhere(String wClause)
	{
		ResultSet results;
		Supplier s = new Supplier();
		String query = buildQuery(wClause);
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);
			
			if(results.next()){
				s = buildSupplier(results);
				stmt.close();
			}
		}
			
			catch(Exception e)
			{
				System.out.println("Query exception: "+e);
			}
		
		return s;
	}
	
	private String buildQuery(String s)
	{
		String query = "SELECT name, supplierID FROM Supplier";
		System.out.println(query);
		if(s.length()>0)
		{
			query = query+" WHERE "+s;
		}
		return query;
	}
	
	private Supplier buildSupplier(ResultSet results)
	{
		Supplier s = new Supplier();
		try{
			s.setName(results.getString("name"));
			s.setId(results.getInt("supplierID"));
		}
		catch(Exception e){
			System.out.println("Error in building the Supplier Object!" + e);
			
		}
		return s;
	}
}

