//welcomeintfimpl.java

import java.rmi.*;
public class welcomeintfimpl implements welcomeintf
{
	public String msg(String nm)throws RemoteException
	{
		return"Welcome..."+nm;
	}
}