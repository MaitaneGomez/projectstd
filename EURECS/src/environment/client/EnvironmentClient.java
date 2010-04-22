package environment.client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Vector;

import environment.Environment;


public class EnvironmentClient 
{
	/** Socket por el que ser realiza la comunicación*/
	private Socket s;
	
	/** Filtro de recogida de datos del socket. */
	private BufferedReader br;

	/** Filtro de escritura de datos al socket. */
	private DataOutputStream dos;
	
	
	 public EnvironmentClient(String IP) 
	 {
		    try
		    {
		        s = new Socket(IP,Environment.PORT);
		        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		        dos = new DataOutputStream(s.getOutputStream());
		    }
		    catch(IOException ioe)
		    {
		      System.err.println(ioe);
		    }
	}
	 
	 /**
	  * Envía las primitivas USUARIO y CLAVE al servidor con los valores apropiados.
	  * @param u Nombre del usuario con el cual conectar.
	  * @param c Clave con la cual conectar.
	  * @return true si se ha permitido el acceso, false en caso contrario.
	  */
	 
	 public boolean entrar(String u, String p)
	 {
		    try
		    {
		      dos.writeBytes("user " + u + "\r\n");
		      System.out.println(br.readLine()); 
		      dos.writeBytes("password " + p + "\r\n");
		      String r = br.readLine();
		      System.out.println(r);
		      
		      if (r.startsWith("201"))
		        return true;
		      else
		        return false;
		      
		    }
		    catch(IOException ioe)
		    {
		      System.err.println(ioe);
		    }
		    return false;
	}
	 
	 /**
	  * Envía la primitiva SALIR al servidor y realiza la desconexión.
	  */
	 
	 public void exit()
	 {
		    try
		    {
		      dos.writeBytes("exit\r\n");
		      System.out.println(br.readLine());
		      dos.close();
		      br.close();
		      s.close();
		    }
		    catch(IOException ioe)
		    {
		      System.err.println(ioe);
		    }
		  }
	}
