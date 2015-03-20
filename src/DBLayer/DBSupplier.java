package DBLayer;

import java.sql.*;
import java.util.ArrayList;
import java.util.*;

import ModelLayer.*;

public class DBSupplier {

	private Connection con;
	
	public DBSupplier(){
		con = DBConnection.getInstance().getDBcon();
	}
	
	public ArrayList<Supplier> getAllSuppliers()
	{
		//TODO generer kode til at returnere alle suppliers
		return null;
	}
	
	public Supplier findSupplier()
	{
		// TODO generer kode til at returnere en supplier fra DB
		//return null;
		return null;
	}
	
	public Supplier searchSupplier(String sname, boolean ra)
	{
		//TODO 
		return null;
	}
	
	public int insert (Supplier s)
	{
		//TODO add supplier to DB
		return 0;
	}
	
	public int update(Supplier s)
	{
		//TODO update function
		return 0;
	}
	
	public int delete(Supplier s)
	{
		//TODO delete function from DB
		return 0;
	}
	
	private Supplier singleWhere(String wClause, boolean retrieveAssociation)
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
				if(retrieveAssociation)
				{
					
				}
				else
				{
					s = null;
				}
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

