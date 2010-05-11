package environment.server;

import java.util.StringTokenizer;
import bd.DBManager;
import environment.util.SocketManager;

final class EnvServerG implements Runnable
{

        private SocketManager sm;
        private String user;
        private String password;
        private int state = 0;
        private DBManager DB=new DBManager();
        
        public EnvServerG(SocketManager sManager) throws Exception
        {
        		sm = sManager;
        }

        public void run() 
        {
        	try 
        	{
        		while (state != 3) //El estado de salir
                {
        			String clientSentence = sm.Leer();
                    System.out.println("The client says: " + clientSentence);
                        
                    //Dividir en tokens
        			//Cuidado con los tokens, si no hay nada da error, excepcion
                    StringTokenizer token = new StringTokenizer(clientSentence);
        			String command = token.nextToken();
                        
                    if(command.equals("QUIT"))
                    {
                    	state = 3;
                    }
                    else
                    {
                    	switch(state)
                        {
                        	case 0:
                            {
                            	if(command.equals("USER"))
                                {
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
                                	if(command.equals("GET_COOR"))
                                	{
                                		try
                                		{
                                			String cellID = token.nextToken();
                                			if (DB.checkCell(cellID) == true)
                                			{
                                				String coord = DB.getCoordCell(cellID);
                                				sm.Escribir("114 OK "+ coord + "\n");
                                			}
                                            else if (DB.checkCell(cellID) == false)
                                            {
                                            	sm.Escribir("417 ERR Unknown cell \n");
                                            }
                                		}                                                       
                                		catch(Exception e)
                                		{
                                        	  sm.Escribir("418 ERR, missing cell_id parameter \n");
                                		}
                                    }
                                 break;
                                }
                        }
                }
          }
        sm.CerrarStreams();
        sm.CerrarSocket();
      
       }
       catch (Exception e) 
       {
            System.out.println(e);
       }   
    }
        
}

