package LAB8;
import java.util.*;
public class illi 
{
	public static String convertMillis(long millis)
	{
		int seconds = (int) (millis / 1000) % 60 ;
		int minutes = (int) ((millis / (1000*60)) % 60);
		int hours   = (int) ((millis/ (1000*60*60)));
		String sul=hours+":"+minutes+":"+seconds;
		return(sul);
		
		
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the time in millisecs:");
		long n=in.nextLong();
		illi ob1=new illi();
		String result=ob1.convertMillis(n);
		System.out.println(result);
	}
	

}
