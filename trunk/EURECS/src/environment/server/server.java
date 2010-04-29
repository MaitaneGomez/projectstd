package environment.server;

import java.net.* ;
import environment.util.SocketManager;
import environment.server.server;


public final class server
{
	public static void main(String argv[]) throws Exception
	{
		// Set the port number.
		int port = 3000; //(new Integer(argv[0])).intValue();

		ServerSocket wellcomeSocket = new ServerSocket(port);

		while (true)
		{
			//Socket conn = sock.accept();

			SocketManager sockManager = new SocketManager(wellcomeSocket.accept());

			EnvironmentServer request = new EnvironmentServer(sockManager);

			Thread thre = new Thread(request);

			thre.start();
		}
	}
}

