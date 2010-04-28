package bd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class DBManager 
{
	private Connection con;
	private boolean p;
		
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
			p = rs.next();
			rs.close();
		}
		catch(SQLException se)
		{
			System.out.println("Problem in the data base with the user");			
		}
		
		return p;		
	}
	
	public boolean checkPass(String user,String password)
	{
		try
		{
			Statement stmt = con.createStatement();
			String query = ("SELECT * FROM Users WHERE user = '" + user +"' and Password = '" + password +"'");
			ResultSet rs = stmt.executeQuery(query);
			boolean p = rs.next();
			rs.close();
		}
		catch(SQLException se)
		{
			System.out.println("Problem in the data base with the password");
		}
		return p;
	}
	
	public boolean checkIP (String ip)
	{
		try 
		{
			Statement stmt= con.createStatement();
			String query = ("SELECT * FROM Vehicle WHERE ip = '" + ip + "'");
			ResultSet rs= stmt.executeQuery(query);
			p=rs.next();
			rs.close();			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
		
	
	public List listsensor (String ip)
	{
		try 
		{
			Statement stmt=con.createStatement();
			String query= ("");
			ResultSet rs=stmt.executeQuery(query);
			while (rs.next())
			{
				
			}	
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;		
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
