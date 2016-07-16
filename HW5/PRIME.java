// DHRUV SHETH 110738127
package HW5;
import java.util.*;
public class PRIME 
{
	public static void main(String args[])
	{
		int cnt=0;
		Scanner in=new Scanner(System.in);
		for(int i=1;i<=1000;i++)
		{
		boolean result=isPrime(i);
		if(result==true)
		{
		System.out.print(i+" ");
		cnt++;
		}
		
		if(cnt==10)
		{
			System.out.println();
			cnt=0;
		}
		
	    }
	}
	public static boolean isPrime(int num)
	{
		int cnt=0,i;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				cnt++;
			}
		}
		if(cnt==2)
		{
			return true;
		}
		else
		return false;
	}
}
