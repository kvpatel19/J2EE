//arithmeticclient.java

import java.rmi.*;
public class arithmeticclient
{
	public static void main(String[] args)
	{
		try
		{
			arithmeticint service=(arithmeticint)Naming.lookup("rmi://localhost:1099/ArithmeticOperation");
			int a=10,b=5;
			System.out.println("add:"+service.add(a,b));
			System.out.println("substract:"+service.substract(a,b));
			System.out.println("multiply:"+service.multiply(a,b));
			System.out.println("divide:"+service.divide(a,b));
		}
		catch(Exception e)
		{
			System.out.println("client exception:"+e.toString());
			e.printStackTrace();
		}
	}
}