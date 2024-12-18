//welcomeintf.java

import java.rmi.*;
public interface welcomeintf extends Remote
{
	public String msg(String nm)throws RemoteException;
}