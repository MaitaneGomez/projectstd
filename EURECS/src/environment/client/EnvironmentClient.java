package environment.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import environment.util.SocketManager;


public class EnvironmentClient 
{
	public static void main (String[] args)
	{
		try 
		{
			Socket cSocket= new Socket("127.0.0.1", 2000);
			SocketManager sm= new SocketManager(cSocket);
			
			/*Aqui ponemos las cosas que pide el cliente, a mano, luego ira en la gui, esto es para saber si esta bien
			 * 
			 * 
			 */
			
			//Primer comando, USER username
			
			sm.Escribir("USER Stud1");
			String resp = sm.Leer();
			System.out.println(resp);
			
			//Segundo comando, PASS pasword
			
			sm.Escribir("PASS 1111");
			resp=sm.Leer();
			System.out.println(resp);
			
			//Tercer comando, LISTSENSOR
			
			//4 comando, HISTORYLOG sensor_id
			
			//5 comando, ON sensor_id
			
			//6 comando, OFF sensor_id
			
			//7 comando, GPSON
			
			//8 comando, GPSOFF
			
			//9 comando, GETCURVALUE sensor_id
			
			//10 comando, GET_PIC
			
			//11 comando, GET_PIC
			
			//12 comando, GET_LOC
			
			//13 comando, QUIT
		
			sm.Escribir("QUIT");
			System.out.println(sm.Leer());
			
			
			
			
			
			
			
			sm.CerrarStreams();
			sm.CerrarSocket();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
