//pyramidintf.java

import java.rmi.*;
public interface pyramidintf extends Remote
{
	public int msg(int a)throws RemoteException;
}