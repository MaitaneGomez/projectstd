package bd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager 
{
	private Connection con;
		
	public DBManager()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
			//String db = “jdbc:odbc:BD”;
			String db = "jdbc:odbc:Driver={Microsoft Access Driver (BD.mdb)};DBQ=C:";
			con = DriverManager.getConnection( db, "", "");
		  
		}
			
		catch(Exception e)
		{ 
			System.out.println("Driver JDBC-ODBC fail"); 
		}
	
	}
	
	public boolean checkUser(String user) 
	{
		try
		{
			Statement stmt = con.createStatement();
			String query = ("SELECT * FROM Users WHERE user = '" +user +"'");
			ResultSet rs = stmt.executeQuery(query);
			boolean u = rs.next();
			rs.close();
			return u;	
	
			
		}
		catch(SQLException se)
		{
			
			System.out.println("Problem with the data base with the user");
			return false;
			
		}
		
		
	}
	
	public boolean checkPass(String user,String password)
	{
		try
		{
			Statement stmt = con.createStatement();
			String query = ("SELECT * FROM Users WHERE user = '" +user +"' and Password = '" +password+"'");
			ResultSet rs = stmt.executeQuery(query);
			boolean p = rs.next();
			rs.close();
			
			return p;
		}
		catch(SQLException se)
		{
			System.out.println("problem with the data base with the password");
			return false;
		}
	}
		
	
	
	
	
	
	
	
 
	
	
	
	
	

	
	public void disconnect()
	{
		try
		{
			con.close();
		}
		
		catch(SQLException se) 
		{
			System.out.println("Disconnection fail");
		}
	}
	
	
	

}
