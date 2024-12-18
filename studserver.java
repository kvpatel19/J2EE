//studserver.java

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class studserver
{
	public static void main(String [] args)
	{
		try
		{
			studimpl obj=new studimpl();
			UnicastRemoteObject.exportObject(obj);
			LocateRegistry.createRegistry(1099);
			Naming.bind("rmi://localhost:1099/studserver",obj);
			System.out.println("server started..");
		}
		catch(Exception e)
		{
			System.err.println("server exception"+e.toString());
			e.printStackTrace();
		}
	}
}
			