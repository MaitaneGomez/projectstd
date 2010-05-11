package environment.server;

import java.util.StringTokenizer;
import bd.DBManager;
import environment.util.SocketManager;

final class EnvServerG implements Runnable
{

        private SocketManager sm;
        private String user;
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
                                                              boolean validation = DB.checkUser(user);
                                                              if(validation == true)
                                                              {
                                                            	  	sm.Escribir("201 OK Welcome " + user + "\n");
                                                            	  	state = 1;
                                                              }
                                                              else
                                                              {
                                                            	  sm.Escribir("401 ERR, user does not exist" + "\n");
                                                              }
                                                      }
                                                      catch(Exception e)
                                                      {
                                                    	  sm.Escribir("404 ERR, missing username parameter" + "\n");
                                                      }
                                              }
                                              else
                                            	  sm.Escribir("Unknown command" + "\n");
                                              break;
                                }
                                
                                case 1:
                                {
                                        if(command.equals("PASS"))
                                              {
                                                      try
                                                      {
                                                              String pass = token.nextToken();
                                                              boolean validation = DB.checkPass(user,pass);
                                                              if(validation == true)
                                                              {
                                                            	  	sm.Escribir("202 OK Welcome to the system" + "\n");
                                                                    state = 2;
                                                              }
                                                              else
                                                              {
                                                            	  	sm.Escribir("402 ERROR autentification error" + "\n" );
                                                                    state = 0;
                                                              }
                                                      }
                                                      
                                                      catch(Exception e)
                                                      {
                                                    	  sm.Escribir("408 ERR, missing password parameter" + "\n");
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
                                                              boolean resp = DB.checkCell(cellID);
                                                              if (resp == true)
                                                              {
                                                                      
                                                                      String coord = DB.getCoordCell(cellID);
                                                                      sm.Escribir("114 OK "+ coord + "\n");
                                                              }
                                                              else
                                                              {
                                                            	  sm.Escribir("417 ERR Unknown cell" + "\n");
                                                              }
                                                      }                                                       
                                                      catch(Exception e)
                                                      {
                                                    	  sm.Escribir("418 ERR, missing cell_id parameter" + "\n");
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

