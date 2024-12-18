//arithmeticimpl.java

import java.rmi.*;
public class arithmeticimpl implements arithmeticint
{
	public int add(int a,int b)throws RemoteException
	{
		return a+b;
	}
	public int substract(int a,int b)throws RemoteException
	{
		return a-b;
	}
	public int multiply(int a,int b)throws RemoteException
	{
		return a*b;
	}
	public int divide(int a,int b)throws RemoteException
	{
		if(b==0)
		{
			throw new ArithmeticException("cannot divide by zero");
		}
		return a/b;
	}
}