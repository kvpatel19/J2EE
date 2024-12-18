//additionserver.java

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class additionserver
{
	public static void main(String args[])
	{
		try
		{
			additionintfimpl ai=new additionintfimpl();
			UnicastRemoteObject.exportObject(ai);
			LocateRegistry.createRegistry(2129);
			Naming.bind("rmi://localhost:2129/welservice",ai);
			System.out.println("started..");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}		