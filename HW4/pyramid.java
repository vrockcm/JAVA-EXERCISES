//Dhruv Sheth 110738127
package HW4;
import java.util.*;
public class pyramid 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the numbers of line");
		int n=in.nextInt();
		int k=n;
		for(int i=0;i<=n;i++)
		{
			
			for(int j=k;j>=1;j--)
			{
				System.out.print("  ");
			}
			k--;
			for(int p=0;p<i;p++)
			{
				System.out.print((int)Math.pow(2, p));
				System.out.print(" ");
			}
			for(int l=i-2;l>=0;l--)
			{
				System.out.print((int)Math.pow(2, l));
				System.out.print(" ");
			}
			System.out.println();
			
		
	}
}}
		


