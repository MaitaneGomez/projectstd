package environment.server;


import java.net.* ;
import environment.util.SocketManager;

public final class serverG
{
        public static void main(String argv[]) throws Exception
        {
                                
                int port = 3005;//(new Integer(argv[0])).intValue();

                ServerSocket wellcomeSocket = new ServerSocket(port);

                while (true)
                {
                        
                        SocketManager manager = new SocketManager(wellcomeSocket.accept());
        
                       
                        EnvironmentServer rs = new EnvironmentServer(manager);
        
                       
                        Thread t = new Thread(rs);
               
                        
                        t.start();
                        
                 }
        }
}