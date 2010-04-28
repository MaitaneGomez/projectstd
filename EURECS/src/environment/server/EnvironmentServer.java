package environment.server;

import java.io.IOException;
import java.util.StringTokenizer;

import bd.DBManager;

import environment.util.SocketManager;



public class EnvironmentServer 
{
	
	private SocketManager sm;
	private int state;
	private String user;
	private String password;
	private DBManager DB;
	private String ip;
	
	public EnvironmentServer(SocketManager sManager) throws Exception 
	{
		    sm = sManager;
	}
	
	
	public void run()  //Lo de los estados
	{
		
		try 
		{
			String clientSentence = sm.Leer();
			System.out.println("The client says: " + clientSentence);
			
			StringTokenizer token = new StringTokenizer(clientSentence);
			String command = token.nextToken();
			//Cuidado con los tokens, si no hay nada da error, excepcion
			
			while(state!=5)
			{
				if (command.equalsIgnoreCase("QUIT"))
				{
					state=5;
					sm.Escribir("208 OK Bye");
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
										sm.Escribir("201 OK Welcome " + user);
										state=1;
									}
									else sm.Escribir("400 Username does not exist");
								}
								catch(Exception e)
								{	
									sm.Escribir("401 ERR Missing username parameter ");
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
										sm.Escribir("201 OK Welcome to the system" );
										state=2;
									}
									else 
									{
										sm.Escribir("402 ERR Authentication error");
										state=0;
									}
									//Ahora miramos en la BD si existe el user 
								}
								catch(Exception e)
								{
									sm.Escribir("403 ERR Missing password parameter");
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
										sm.Escribir("OK, you have choose the following server '" + ip + "'" );
										state=3;
									}
									else 
									{
										sm.Escribir("ERR, IP not found");
										state=2; //No se si mejor pasamos al 0 o al 2
									}
								}
								catch(Exception e)
								{
									sm.Escribir("ERR Missing ip parameter");
								}
							}
							break;
						}
						
						case 3:
						{
							if (command.equalsIgnoreCase("LISTSENSOR"))
							{
								
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