package environment.server;

import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;

import bd.DBManager;

import environment.util.SocketManager;



public class EnvironmentServer implements Runnable
{
	
	private SocketManager sm;
	private int state;
	private String user;
	private String password;
	private DBManager DB=new DBManager();
	private String ip;
	private String idSensor;
	
	public EnvironmentServer(SocketManager sManager) throws Exception 
	{
		    sm = sManager;
	}
	
	
	public void run()  //Lo de los estados
	{
		
		try 
		{
						
			while(state!=5)
			{
				String clientSentence = sm.Leer();
				System.out.println("The client says: " + clientSentence);
				
				//Dividir en tokens
				//Cuidado con los tokens, si no hay nada da error, excepcion
				StringTokenizer token = new StringTokenizer(clientSentence);
				String command = token.nextToken();
				
				
				if (command.equalsIgnoreCase("QUIT"))
				{
					sm.Escribir("208 OK Bye \n");
					state=5;
				}
				else 
				{
					switch (state)
					{
						case 0:
						{
							user = token.nextToken();
							//Ahora miramos en la BD si existe el user 
							//si es que si pues sacamos "201 OK Welcome Mikel"
							// si no exis<te en la bd "401 ERR Missing username parameter"							
							if(command.equalsIgnoreCase("USER"))
							{
								
								//Ahora miramos en la BD si existe el user 
								//si es que si pues sacamos "201 OK Welcome Mikel"
								// si no existe en la bd "401 ERR Missing username parameter"
								try
								{
									user = token.nextToken();
									if( DB.checkUser(user))
									{
										sm.Escribir("201 OK Welcome " + user + "\n");
										state=1;
									}
									else sm.Escribir("400 Username does not exist \n");
								}
								catch(Exception e)
								{	
									sm.Escribir("401 ERR Missing username parameter \n");
								}		
							} 
							break;
						}
							
						case 1:
						{
							if(command.equalsIgnoreCase("PASS"))
							{
								try
								{
									password = token.nextToken();
									if( DB.checkPass(user,password))
									{
										sm.Escribir("201 OK Welcome to the system \n" );
										state=2;
									}
									else 
									{
										sm.Escribir("402 ERR Authentication error \n");
										state=0;
									}
									//Ahora miramos en la BD si existe el user 
								}
								catch(Exception e)
								{
									sm.Escribir("403 ERR Missing password parameter \n");
								}
							}
							break;
						}
						
						
						case 2:
						{
							if(command.equalsIgnoreCase("IP"))
							{
								try
								{
									ip = token.nextToken();
									if( DB.checkIP(ip))
									{
										sm.Escribir("OK, you have choose the following server '" + ip + "'\n");
										state=3;
									}
									else 
									{
										sm.Escribir("ERR, IP not found \n");
										state=2; //No se si mejor pasamos al 0 o al 2
									}
								}
								catch(Exception e)
								{
									sm.Escribir("ERR Missing ip parameter \n");
								}
							}
							break;
						}
						
						case 3:
						{
													
							if (command.equalsIgnoreCase("LISTSENSOR"))
							{
								Vector<String> v=null;
								int i=0;
								
								if ((v=DB.getListSensor(ip)) != null)
								{
									sm.Escribir("112 OK Start of sensor list \n");
									for (i=0; i< v.size(); i++)
									{
										sm.Escribir(v.get(i)+ "\n");
									}
									sm.Escribir("212 OK End of sensor list \n");
								}
								
							}
							if (command.equalsIgnoreCase("HISTORYLOG"))
							{
								try
								{
									idSensor = token.nextToken(); //Cuidado con los tipos
									
									Vector<String> v=null;
									int i=0;
									
									if ((v=DB.getMeasurements(idSensor)) != null)
									{
										sm.Escribir("113 OK Start of measurement list \n");
										for (i=0; i< v.size(); i++)
										{
											sm.Escribir(v.get(i)+ "\n");
										}
										sm.Escribir("212 OK End of measurement list \n");
									}
									else 
									{
										sm.Escribir("414 ERR Unknown sensor \n");
									}
									
								}
								catch(Exception e)
								{
									sm.Escribir("415 ERR Missing sensor id parameter \n");
								}
							}
							
							if (command.equals("ON"))
					  		{
					  			try
					  			{
					  				boolean p=false;
						  			idSensor = token.nextToken();
						  			if(DB.checkSensor(idSensor))
						  			{
							  			p = DB.getState(idSensor);
							  			if(p)
							  			{
							  				sm.Escribir("418 ERROR Sensor already activated" + "\n");
							  			}
							  			else
							  			{
							  				DB.changeState(idSensor,p);
							  				//y si el sensor que ha escrito esta mal?
							  				
							  			}	
						  			}
						  			else sm.Escribir("417 ERR Unknown sensor");
						  		}
					  			
					  			catch(Exception e)
					  			{
					  				sm.Escribir("ERR, missing sensor parameter \n");
					  			}
					  		}
							if (command.equals("OFF"))
					  		{
					  			try
					  			{
					  				boolean p=false;
						  			idSensor = token.nextToken();
						  			if(DB.checkSensor(idSensor))
						  			{
							  			p = DB.getState(idSensor);
							  			if(p)
							  			{
							  				DB.changeState(idSensor,p);
							  				sm.Escribir("OK Sensor desactivated" + "\n");
							  			}
							  			else
							  			{
							  				sm.Escribir("419 ERR Sensor already desactivated \n");
							  			}	
						  			}
						  			else sm.Escribir("417 ERR Unknown sensor");
						  		}
					  			
					  			catch(Exception e)
					  			{
					  				sm.Escribir("ERR, missing sensor parameter \n");
					  			}
					  		}
							if (command.equals("GPSON"))
							{
								boolean p=false;
								boolean gps = DB.getGps(ip);
						  		if(gps)
						  		{
						  			sm.Escribir("409 ERROR GPS already activated \n");
						  		}
						  		else
						  		{
						  			DB.changeGps(ip,p);
						  			sm.Escribir("205 OK GPS activated \n");
						  		}	
							}
							
							if (command.equals("GPSOFF"))
							{
								boolean p=false;
								boolean gps = DB.getGps(ip);
						  		if(gps)
						  		{
						  			DB.changeGps(ip,p);
						  			sm.Escribir("206 OK GPS desactivated \n");
						  			
						  		}
						  		else
						  		{
						  			sm.Escribir("420 ERR GPS already desactivated \n");
						  		}	
							}
							if (command.equals("GET_CURVALUE"))
							{
								try
					  			{
					  				boolean p=false;
						  			idSensor = token.nextToken();
						  			if(DB.checkSensor(idSensor))
						  			{
							  			p = DB.getState(idSensor);
							  			if(!p)
							  			{
							  				
							  				sm.Escribir("Sensor is not active");
							  			}
							  			else
							  			{
							  				sm.Escribir("114 OK" + DB.getCurvalue(idSensor));
							  			}	
						  			}
						  			else sm.Escribir("414 ERR Unknown sensor");
						  		}
								catch(Exception e)
								{
									sm.Escribir("415 ERR Missing  parameter sensor_id \n");
								}
							}
							if(command.equals("GET_PIC"))
							{
								boolean gps = DB.getGps(ip);
						  		if(gps)
						  		{
						  			//sacar coordenadas
						  		}
						  		else
						  		{
						  			sm.Escribir("420 ERR GPS is not active \n");
						  		}
							}
				break;
						}
						case 4:
						{
							
						}
					}
				}
			}
		}		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}
}