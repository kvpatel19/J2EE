//additionclient.java

import java.rmi.*;
import java.rmi.server.*;
public class additionclient
{
	public static void main(String args[])
	{
		try
		{
			additionintf ai=(additionintf)Naming.lookup("rmi://localhost:2129/welservice");
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a+b;
			System.out.println(" "+c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}		