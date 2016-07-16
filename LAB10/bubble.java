package LAB10;
import java.util.*;
public class bubble 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=in.nextInt();
		double temp;
		double arr[]=new double[n];
		System.out.println("Enter the inputs:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextDouble();
		}
		boolean changed = true;
		do {
		    changed = false;
		    for (int j = 0; j < n-1 ; j++)
		        if (arr[j] > arr[j + 1]) 
		        {
		            temp= arr[j]; 
		            arr[j]=arr[j + 1];
		            arr[j+1]=temp;
		            changed = true;
		        }
		} while (changed);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}
}
