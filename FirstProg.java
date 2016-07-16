import java.util.*;
public class FirstProg 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int i,j=0;
	int a[]=new int[10];
	int b[]=new int[11];
	for(i=0;i<=9;i++)
	{
		System.out.println("enter Value:");
		a[i]=sc.nextInt();
	}
	for(i=9;i>=0;i--)
	{
		
		b[j]=a[j]-a[i];
		j++;
	}
	for(i=0;i<=9;i++)
	{
		System.out.println(b[i]);
	}
	
}
}