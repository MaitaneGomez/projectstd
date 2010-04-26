package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDManager 
{
	private Connection con;
		
	public BDManager()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
			String db = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=C:";
			con = DriverManager.getConnection( db, "", "");
		  
		}
			
		catch(Exception e)
		{ 
			System.out.println("Driver JDBC-ODBC fail"); 
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
