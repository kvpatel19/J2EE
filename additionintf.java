//additionintf.java

import java.rmi.*;
public interface additionintf extends Remote
{
	public int msg(int a,int b)throws RemoteException;
}