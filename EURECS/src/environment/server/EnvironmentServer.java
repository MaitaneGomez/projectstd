package environment.server;

import java.io.IOException;
import java.util.Random;
import java.net.Socket;
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
					//String str= sm.Leer();
					//state = Integer.parseInt(str);
					//sm.Escribir("208 OK Bye \n");
					state=5;
				}
				else 
				{
					switch (state)
					{
						case 0:
						{
						
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
										sm.Escribir("202 OK Welcome to the system \n" );
										state=2;
									}
									else 
									{
										sm.Escribir("402 ERR Authentication error \n");
										state=0;
									} 
								}
								catch(Exception e)
								{
									sm.Escribir("403 ERR Missing password parameter \n");
									state=0;
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
									String str= Integer.toString(v.size());
									sm.Escribir(str + "\n");
									
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
									v=DB.getMeasurements(idSensor);
									
									if ( v.size() !=0)
									{
										sm.Escribir("113 OK Start of measurement list \n");
										String str= Integer.toString(v.size());
										sm.Escribir(str + "\n");
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
							
							if (command.equalsIgnoreCase("ON"))
					  		{
								try
					  			{
					  				boolean p=false;
						  			idSensor = token.nextToken();
						  			if(DB.checkSensor(idSensor,ip))
						  			{
							  			p = DB.getState(idSensor);
							  			if(p==false)
							  			{
							  				DB.changeState(idSensor,p);
							  				sm.Escribir("203 OK Sensor activated" + "\n");
							  			}
							  			else
							  			{
							  				sm.Escribir("418 ERR Sensor already activated \n");
							  			}	
						  			}
						  			else sm.Escribir("417 ERR Unknown sensor");
						  		}					  			
					  			catch(Exception e)
					  			{
					  				sm.Escribir("ERR, missing sensor parameter \n");
					  			}
					  		}
							if (command.equalsIgnoreCase("OFF"))
					  		{
					  			try
					  			{
					  				boolean p=false;
						  			idSensor = token.nextToken();
						  			if(DB.checkSensor(idSensor,ip))
						  			{
							  			p = DB.getState(idSensor);
							  			if(p)
							  			{
							  				DB.changeState(idSensor,p);
							  				sm.Escribir("204 OK Sensor desactivated" + "\n");
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
							if (command.equalsIgnoreCase("GPSON"))
							{
								boolean gps = DB.getGps(ip);
						  		if(gps==true)
						  		{
						  			sm.Escribir("409 ERROR GPS already activated \n");
						  		}
						  		else if (gps==false)
						  		{
						  			DB.changeGps(ip,gps);
						  			sm.Escribir("205 OK GPS activated \n");
						  		}	
							}
							
							if (command.equalsIgnoreCase("GPSOFF"))
							{
								boolean gps = DB.getGps(ip);
						  		if(gps==true)
						  		{
						  			DB.changeGps(ip,gps);
						  			sm.Escribir("206 OK GPS desactivated \n");
						  			
						  		}
						  		else if (gps==false)
						  		{
						  			sm.Escribir("420 ERR GPS already desactivated \n");
						  		}	
							}
							if (command.equalsIgnoreCase("GET_CURVALUE"))
							{
								try
					  			{
					  				boolean p;
						  			idSensor = token.nextToken();
						  			if(DB.checkSensor(idSensor,ip))
						  			{
							  			p = DB.getState(idSensor);
							  			if(p==false)
							  			{
							  				sm.Escribir("416 ERR Sensor is not active \n");
							  			}
							  			else if (p==true)
							  			{
							  				System.out.println("llego a escribir el curvalue");
							  				sm.Escribir("114 OK " + DB.getCurvalue(idSensor));
							  			}	
						  			}
						  			else sm.Escribir("414 ERR Unknown sensor \n");
						  		}
								catch(Exception e)
								{
									sm.Escribir("415 ERR Missing  parameter id Sensor \n");
								}
							}
							if(command.equalsIgnoreCase("GET_PIC"))
							{
								boolean gps = DB.getGps(ip);
						  		if(gps)
						  		{
						  			sm.Escribir("206 OK Getting image" + DB.getPicture(ip));
						  			//Aqui habria que ir mostrando como va la carga de la imagen en bytes
						  			state = 4;
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
							if(command.equalsIgnoreCase("GET_LOC"))
							{
                                if(DB.getGps(ip) == true)
                                {
                                	String coord = DB.getCoord(ip);
                                	sm.Escribir("114 OK " + coord + "\n");
                                }
                                else
                                {
                                	Socket gridSocket = new Socket("127.0.0.1", 3005);
                                	SocketManager sockM = new SocketManager(gridSocket);
                                	
                                	sockM.Escribir("USER " + user + "\n");
                                	System.out.println(sockM.Leer());
                                	
                                	sockM.Escribir("PASS " + password + "\n");
                                	System.out.println(sockM.Leer());
                                	
                                	
                                	Random r= new Random();//Para elegir la actual al azar                               
                                	int cell= r.nextInt(4);                                	
                                	sockM.Escribir("GET_COOR " + cell + "\n");
                                	sm.Escribir(sockM.Leer() + "\n");
                                	sockM.Escribir("QUIT" + "\n");
                                	
                                	sockM.CerrarSocket();
                                	sockM.CerrarStreams();
                                }
                               
                                state = 3;

							}
						}
					}
				}
			}
		}		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			sm.CerrarSocket();
		} catch (IOException e) 
		{

			e.printStackTrace();
		}
	}
}