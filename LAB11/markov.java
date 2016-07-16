package LAB11;
import java.util.*;
public class markov 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=in.nextInt();
		double a[][]=new double[n][n];
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=in.nextDouble();
			}
			
		}
		boolean result=isMarkovMatrix(a); 
		if(result==true)
		{
			System.out.println("This is a positive MARKOV MATRIX");
		}
		else
		{
			System.out.println("This is not a positive markov matrix");
		}
	}
	public static boolean isMarkovMatrix (double m[][])
	{
		int cnt=0;
		double sum1=0;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				if(m[i][j]<0)
				{
					return false;
				}
				else
				{
						sum1=sum1+m[j][i];
				}
				
			}
			if(sum1==1.0)
			{
				cnt++;
				sum1=0.0;
			}
		}
		if(cnt==m.length)
		{
			return true;
		}
		else
		return false;
	}

}
