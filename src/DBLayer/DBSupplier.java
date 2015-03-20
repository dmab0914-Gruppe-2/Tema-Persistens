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
	
	public ArrayList<Supplier> getAllSuppliers(boolean retrieveAssociation)
	{
		return miscWhere("", retrieveAssociation);
	}
	
	public Supplier findSupplier(int id, boolean retrieveAssociation)
	{
		String wClause = " supplierID" + id + "'";
		return singleWhere(wClause, retrieveAssociation);
	}//endFindSupplier
	
	public Supplier searchSupplier(String sname, boolean ra)
	{
		//
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
	
	public ArrayList<Supplier> miscWhere(String wClause, boolean retrieveAssociation)
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
			if(retrieveAssociation)
			{
				for(Supplier su : list)
				{
					int id = su.getId();
					String n = su.getName();
				}//endFor
			}//endIf
		}//endTry
		catch(Exception e)
		{
			System.out.println("Query exception - select: "+e);
			e.printStackTrace();
		}//endCatch
		return list;
	}//endMiscWhere
	
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

