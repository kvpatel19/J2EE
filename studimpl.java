//studimpl.java

import java.rmi.*;
public class studimpl implements studint
{
	double total;
	double percentage;
	String grade;
	String result;
	public double total(double m1,double m2,double m3,double m4,double m5,double m6)
	{
		total=(m1+m2+m3+m4+m5+m6);
		return total;
	}
	public double percentage()throws RemoteException
	{
		percentage=((total*100)/600);
		return percentage;
	}
	public String grade()throws RemoteException
	{
		if(percentage>=80)
		{
			return("A");
		}
		else if(percentage>=60 && percentage<80)
		{
			return("B");
		}
		else if(percentage>=40 && percentage<60)
		{
			return("C");
		}
		else
		{
			return("D");
		}
	}
	public String result()throws RemoteException
	{
		if(percentage>=50)
			return"Pass";
		else
			return"Fail";
		
	}
}
	
		
		