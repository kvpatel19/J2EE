//pyramidclient.java

import java.rmi.*;
import java.rmi.server.*;
public class pyramidclient
{
	public static void main(String args[])
	{
		try
		{
			pyramidintf ai=(pyramidintf)Naming.lookup("rmi://localhost:2129/welservice");
			int rows=Integer.parseInt(args[0]);
			for (int i = 1; i <= rows; i++)
			{
				for (int j = 1; j <= i; j++)
				{
					System.out.println(j + " ");
				
				}
				System.out.println("\n");
			}
		}
		catch(Exception e)
		{
			System.out.println("client exception:"+e.toString());
			e.printStackTrace();
		}
	}
}		