package LAB11;
import java.util.*;
public class largest 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size:");
		int r=in.nextInt();
		int c=in.nextInt();
		double a[][]=new double[r][c];
		System.out.println("Enter the values:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=in.nextDouble();
			}
			
		}
		int result[]=locateLargest(a);
		System.out.println("The largest element is at ("+result[0]+","+result[1]+")");
	}
		
	public static int [ ] locateLargest(double [ ] [ ] a)
	{
		double max=0;
		int o[]=new int [2];
		
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]>max)
				{
					o[0]=i;
					o[1]=j;
					max=a[i][j];
				}
			}
		}
		return o;
	}
}
	
		
				
			
