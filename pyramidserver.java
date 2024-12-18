//pyramidserver.java

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class pyramidserver
{
	public static void main(String args[])
	{
		try
		{
			pyramidimpl ai=new pyramidimpl();
			UnicastRemoteObject.exportObject(ai);
			LocateRegistry.createRegistry(2129);
			Naming.bind("rmi://localhost:2129/welservice",ai);
			System.out.println("started..");
		}
		catch(Exception e)
		{
			System.err.println("server exception :"+e.toString());
			e.printStackTrace();
		}
	}
}		