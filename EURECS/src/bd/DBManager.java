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
			//String db = �jdbc:odbc:BD�;
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
	
	
	//Nombres de las BD a revisar!!!!!
	public boolean getState(String idSensor)
	{
		try 
		{
			Statement stmt= con.createStatement();
			String query = ("SELECT * FROM Sensor WHERE idSensor = '" + idSensor + "'");
			ResultSet rs= stmt.executeQuery(query);
			String state="";
			if (rs.next())
				state = rs.getString("state");
			if (state.equalsIgnoreCase("ON"))
				p = true;
			else p = false;

			rs.close();			
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("Problem in the data base with the State");
		}
		
		
		return p;
	}
	
	//Habias puesto que devolvia boolean y lo he cambiado a void, miralo!Que nose porque habias
	//puesto lo otro. 
	
	//Lo puse por si queriamos validar que esta bien o mal
	public  void changeState(String idSensor,boolean p) 
	{
		
		try
		{
			Statement stmt= con.createStatement();
			
			if (p = true)
			{
				stmt.executeUpdate("UPDATE Sensors SET State = 'OFF' WHERE idSensor = '" + idSensor);
			}
			else
			{
				stmt.executeUpdate("UPDATE Sensors SET State = 'ON' WHERE idSensor = '" + idSensor);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Problem in the data base with the change of the State");
		}
	}
	
	public boolean checkSensor (String idSensor)
	{
		try 
		{
			Statement stmt= con.createStatement();
			String query = ("SELECT * FROM Sensor WHERE id_s = '" + idSensor + "'");
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
	
	public boolean getGps(String ip) 
	{
		try
		{
			Statement stmt= con.createStatement();
			String query = ("SELECT * FROM Gps WHERE GPS_ID = ( SELECT GPS_ID FROM Vehicle WHERE IP= '"+ ip + "'");
			ResultSet rs= stmt.executeQuery(query);
			String state="";
			if (rs.next())
				state = rs.getString("state");
			if (state.equalsIgnoreCase("ON"))
				p = true;
			else p = false;
			rs.close();	
		}
		
		catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("Problem in the data base with the State");
		}
		return p;
	}
	
	public void changeGps(String ip,boolean p) 
	{
		try
		{
			Statement stmt= con.createStatement();
			
			if (p = true)
			{
				stmt.executeUpdate("UPDATE Gps SET State = 'OFF' WHERE gps_id = (SELECT gps_id FROM Vehicle WHERE ip = '" + ip);
			}
			else
			{
				stmt.executeUpdate("UPDATE Gps SET State = 'ON' WHERE gps_id = (SELECT gps_id FROM Vehicle WHERE ip = '" + ip);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Problem in the data base with the change of the State");
		}
	}
	
	public String getCurvalue(String idSensor)
	{ 
		String curvalue="";
		try 
		{
			Statement stmt= con.createStatement();
			String query = ("SELECT * FROM Sensor WHERE id_s = '" + idSensor + "'");
			ResultSet rs= stmt.executeQuery(query);
			while (rs.next())
			{
			
				//curvalue= rs.getString("Date") + ";" + rs.getString("Time") + ";" + rs.getString("Coord") + ":" + rs.getString("Value");
				curvalue= rs.getString(1) + rs.getString(2) + rs.getString(3) + rs.getString(4);
			}		
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return curvalue;
		//Es demasiado tarde ya para que me entere de que es lo que he hecho mal aqui.........
		

	}
	
	public String getCoordinates()
	{
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

	