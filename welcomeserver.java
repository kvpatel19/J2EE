//welcomeserver.java

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class welcomeserver
{
	public static void main(String args[])
	{
		try
		{
			welcomeintfimpl wi=new welcomeintfimpl();
			UnicastRemoteObject.exportObject(wi);
			LocateRegistry.createRegistry(2129);
			Naming.bind("rmi://localhost:2129/welservice",wi);
			System.out.println("started..");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}		