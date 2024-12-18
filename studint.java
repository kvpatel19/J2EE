//studint.java

import java.rmi.*;
public interface studint extends Remote
{
	public double total(double m1,double m2,double m3,double m4,double m5,double m6)throws RemoteException;
	public double percentage()throws RemoteException;
	public String result()throws RemoteException;
	public String grade()throws RemoteException;
}