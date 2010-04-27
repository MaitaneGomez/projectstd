package environment.server;

import java.io.IOException;
import java.util.StringTokenizer;

import environment.util.SocketManager;



public class EnvironmentServer 
{
	
	private SocketManager sm;
	private int state;
	private String user;
	
	public EnvironmentServer(SocketManager sManager) throws Exception 
	{
		    sm = sManager;
	}
	
	
	public void run()  //Lo de los estados
	{
		
		try 
		{
			String clientSentence = sm.Leer();
			//System.out.println("The client says: " + clientSentence);
			
			StringTokenizer token = new StringTokenizer(clientSentence);
			String command = token.nextToken();
			//Cuidado con los tokens, si no hay nada da error, excepcion
			
			
			if (command.equalsIgnoreCase("QUIT"))
			{
				state=4;
				sm.Escribir("208 OK Bye");
			}
			else 
			{
				switch (state)
				{
					case 0:
					{
						if(command.equalsIgnoreCase("USER"))
						{
							user = token.nextToken();
							//Ahora miramos en la BD si existe el user 
							//si es que si pues sacamos "201 OK Welcome Mikel"
							// si no existe en la bd "401 ERR Missing username parameter"							
						}
						break;
					}
					
					case 1:
					{
					
						break;
					}
					
					
					case 2:
					{
					
						break;
					}
					
					case 3:
					{
						
						break;
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