//studclient.java

import java.rmi.*;
public class studclient
{
	public static void main(String args[])
	{
		try
		{
			studint service=(studint)Naming.lookup("rmi://localhost:1099/studserver");
			double m1=88,m2=78,m3=66,m4=89,m5=78,m6=90;
			System.out.println("total:"+service.total(m1,m2,m3,m4,m5,m6));
			System.out.println("percentage:"+service.percentage());
			System.out.println("result:"+service.result());
			System.out.println("grade:"+service.grade());
		}
		catch(Exception e)
		{
			System.out.println("client exception:"+e.toString());
			e.printStackTrace();
		}
	}
}
			