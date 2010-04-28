package bd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;


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
			String db = "jdbc:odbc:Driver={Microsoft Access Driver (DB.mdb)};DBQ=C:";
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
			String query = ("SELECT * FROM Users WHERE user = '" + user +"' and password = '" + password +"'");
			ResultSet rs = stmt.executeQuery(query);
			p = rs.next();
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
			String query = ("SELECT * FROM Vehicle WHERE IP = '" + ip + "'");
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
	
	public Vector<String> getListSensor(String ip)
	{
		Vector<String> sensors=null;
		
		try 
		{
			sensors= new Vector<String>();
			Statement stmt=con.createStatement();
			String query= ("SELECT * FROM Sensors WHERE ID_V= (SELECT ID FROM Vehicle WHERE IP = '" + ip + "')");
			ResultSet rs=stmt.executeQuery(query);
			String sens="";
			while (rs.next())
			{
				sens= rs.getString("ID_V") + ";" + rs.getString("NAME") + ";" + rs.getString("STATE");
				sensors.add(sens);
			}		
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sensors;		
	}
	
	public Vector<String> getMeasurements(String idSensor)
	{
		Vector<String> measurements=null;
		
		try 
		{
			measurements= new Vector<String>();
			Statement stmt=con.createStatement();
			String query= ("SELECT * FROM Measurements WHERE ID_S ='" + idSensor + "'"); 
			ResultSet rs=stmt.executeQuery(query);
			String mens="";
			while (rs.next())
			{
				mens= rs.getString("Date") + ";" + rs.getString("Time") + ";" + rs.getString("Coord") + ":" + rs.getString("Value");
				measurements.add(mens);
			}		
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return measurements;		
	}
	
	public boolean getState(String idSensor) 
	{
		return false;
	}
	
	
	public boolean changeState(String idSensor) 
	{
		boolean state=true;
		
		return state;
		
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
