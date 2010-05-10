package bd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
             con = DriverManager.getConnection("jdbc:odbc:DB","", "");
         }
         catch(Exception e)
         { 
                 System.out.println("Cannot load the JDBC-ODBC Driver"); 
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
			stmt.close();
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
			stmt.close();
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
			String query = ("SELECT * FROM Vehicles WHERE IP = '" + ip + "'");
			ResultSet rs= stmt.executeQuery(query);
			p=rs.next();
			stmt.close();			
		} 
		catch (SQLException e) 
		{
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
			String query= ("SELECT * FROM Sensors WHERE ID_V= (SELECT ID_V FROM Vehicles WHERE IP = '" + ip + "')");
			ResultSet rs=stmt.executeQuery(query);
			String sens="";
			while (rs.next())
			{
				sens= rs.getString("ID_S") + ";" + rs.getString("Name") + ";" + rs.getString("State");
				sensors.add(sens);
			}	
			stmt.close();
		} 
		catch (SQLException e) 
		{
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
			String query= ("SELECT * FROM Measurements WHERE ID_S= '" + idSensor + "'");
			ResultSet rs=stmt.executeQuery(query);
			String mens="";
			while (rs.next())
			{
				mens= "Date: " + rs.getString("Date") + "; Time: " + rs.getString("Time") + "; Coords: " + rs.getString("Coord") + ": Value: " + rs.getString("Value");
				measurements.add(mens);
			}
			stmt.close();
		} 
		catch (SQLException e) 
		{

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
			String query = ("SELECT * FROM Sensors WHERE ID_S = '" + idSensor + "'");
			ResultSet rs= stmt.executeQuery(query);
			String state="";
			if (rs.next())
				state = rs.getString("State");
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
			
			System.out.println(idSensor + " " + p);
			
			if (p == true)
			{
				stmt.executeUpdate("UPDATE Sensors SET State = '" + "OFF" + "' WHERE ID_S = '" + idSensor + "'");
			}
			else
			{
				stmt.executeUpdate("UPDATE Sensors SET State = '" + "ON" + "' WHERE ID_S = '" + idSensor + "'");
			}
			
			stmt.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Problem in the data base with the change of the State");
		}
	}
	
	public boolean checkSensor (String idSensor, String ip)
	{
		try 
		{
			Statement stmt= con.createStatement();
			String query = ("SELECT * FROM Sensors WHERE ID_S = '"+ idSensor + "' AND ID_V = (SELECT ID_V FROM Vehicles WHERE IP = '"+ ip + "')");
			ResultSet rs= stmt.executeQuery(query);
			p=rs.next();
			rs.close();	
			stmt.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return p;
	}
	
	public boolean getGps(String ip) 
	{
		try
		{
			Statement stmt= con.createStatement();
			String query = ("SELECT * FROM GPS WHERE ID_V = ( SELECT ID_V FROM Vehicles WHERE IP = '"+ ip + "')");
			ResultSet rs= stmt.executeQuery(query);
			String state="";
			if (rs.next())
				state = rs.getString("State");
			if (state.equalsIgnoreCase("ON"))
				p = true;
			else p = false;
			stmt.close();	
		}
		
		catch (SQLException e) 
		{
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
			
			if (p == true)
			{
				stmt.executeUpdate("UPDATE GPS SET State = '" + "OFF" + "' WHERE ID_V = (SELECT ID_V FROM Vehicles WHERE IP = '" + ip +"')");
			}
			else
			{
				stmt.executeUpdate("UPDATE GPS SET State = '" + "ON" + "' WHERE ID_V = (SELECT ID_V FROM Vehicles WHERE IP = '" + ip + "')");
			}
			stmt.close();
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
		String value,coord;
		String dia,mes,annio;
		int hora, minutos, segundos;
		try 
		{
			//Calendar c1 = Calendar.getInstance();
			Calendar c = new GregorianCalendar();
			
			dia = Integer.toString(c.get(Calendar.DATE));
			mes = Integer.toString(c.get(Calendar.MONTH));
			annio = Integer.toString(c.get(Calendar.YEAR));
			
			hora =c.get(Calendar.HOUR_OF_DAY);
			minutos = c.get(Calendar.MINUTE);
			segundos = c.get(Calendar.SECOND);
						
			Statement stmt= con.createStatement();
			String query1 = ("SELECT CurValue FROM Sensors WHERE ID_S = '" + idSensor + "'");
			ResultSet rs1= stmt.executeQuery(query1);
			rs1.next();
			value = rs1.getString(1);
			
			String query2 = ("SELECT COORD FROM GPS WHERE ID_V = (SELECT ID_V FROM Sensors WHERE ID_S = '" + idSensor + "')");
			ResultSet rs2= stmt.executeQuery(query2);
			rs2.next();
			coord = rs2.getString(1);
			
			curvalue= dia + "/" + mes + "/" + annio + ";" + hora + ":" + minutos + ":" + segundos + ";" + coord + ";" + value;
			stmt.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			System.out.println("ERROR en el current value");
		}
		
		return curvalue;
	}
	
	public String getPicture(String ip) 
	{
		String picture = null;
		try 
		{
			Statement stmt= con.createStatement();
			String query = ("SELECT PICTURE FROM Pic WHERE COORD = ( SELECT COORD FROM GPS WHERE ID_V = (SELECT ID_V FROM Vehicles WHERE IP = '" + ip + "'))");
			ResultSet rs= stmt.executeQuery(query);
			rs.next();
			picture = rs.getString("Picture");
			stmt.close();			
		} 
		catch (SQLException e) 
		{			
			e.printStackTrace();
			//System.out.println("Problem in the data base with the State");
		}
		return picture;	
	}
	
	public String getCoord(String ip)
	{
		String coord = null;
		try
		{
			Statement stmt = con.createStatement();
			String query = ("SELECT Coord FROM GPS WHERE ID_V = (SELECT ID_V FROM Vehicles WHERE IP = '" + ip + "')");
			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			coord = rs.getString("Coord");
			stmt.close();
		}
		catch (SQLException e) 
		{			
			e.printStackTrace();
			//System.out.println("Problem in the data base with the State");
		}
		return coord;
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

	