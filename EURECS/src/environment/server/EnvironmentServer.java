package environment.server;

	import java.net.*;
	import java.io.*;
	import java.util.*;

public class EnvironmentServer
{
	  /** Socket por el que se realiza la comunicación. */
	  private Socket s;

	  /** Filtro de recogida de datos del socket. */
	  private BufferedReader br;

	  /** Filtro de escritura de datos al socket. */
	  private DataOutputStream dos;
	
	  /**
	  * Constructor de EnvironmentServer, para atender a un cliente.
	  */
	  public EnvironmentServer(Socket sc) {
	    try{
	      s = sc;
	      br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	      dos = new DataOutputStream(s.getOutputStream());
	    }catch(IOException ioe){
	      System.err.println(ioe);
	    }
	  }
	  /**
	  * Implementación del proceso de comunicación con el cliente.
	  */
	  
	  /* LO DE LOS ESTADOS*/
	  public void run(){
	    
	  }
}
