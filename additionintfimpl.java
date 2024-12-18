//additionintfimpl.java

import java.rmi.*;
public class additionintfimpl implements additionintf
{
	public int msg(int a,int b)throws RemoteException
	{
		return a+b;
	}
}