//arithmeticserver.java

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class arithmeticserver
{
	public static void main(String[] args)
	{
		try
		{
			arithmeticimpl obj=new arithmeticimpl();
			UnicastRemoteObject.exportObject(obj);
			LocateRegistry.createRegistry(1099);
			Naming.bind("rmi://localhost:1099/ArithmeticOperation",obj);
			System.out.println("arithmetic service bound in registry");
		}
		catch(Exception e)
		{
			System.err.println("server exception:"+e.toString());
			e.printStackTrace();
		}
	}
}