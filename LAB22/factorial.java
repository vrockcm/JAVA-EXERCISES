package LAB22;
import java.util.*;
public class factorial 
{
	public long fact(int n)
	{
		long total=1;
		for(int i=1;i<=n;i++)
		{
			total=total*i;
		}
		return total;
	}
	public static void main(String args[])
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		factorial ob1=new factorial();
		System.out.println(ob1.fact(n));
	}
 
 
}
