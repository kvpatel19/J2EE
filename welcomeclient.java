//welcomeclient.java

import java.rmi.*;
import java.rmi.server.*;
public class welcomeclient
{
	public static void main(String args[])
	{
		try
		{
			welcomeintf wi=(welcomeintf)Naming.lookup("rmi://localhost:2129/welservice");
			String s=wi.msg(args[0]);
			System.out.println(" "+s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}		