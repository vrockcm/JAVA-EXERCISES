// DHRUV SHETH 110738127
package HW5;

import java.util.Scanner;

public class chinese 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a year: ");
		 int year = in.nextInt();
		String arr[]={"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};
		int rem=year%12;
		if(rem==0)
		{
			System.out.println(year+" is the year of the "+arr[0]);
		}
		if(rem==1)
		{
			System.out.println(year+" is the year of the "+arr[1]);
		}
		if(rem==2)
		{
			System.out.println(year+" is the year of the "+arr[2]);
		}
		if(rem==3)
		{
			System.out.println(year+" is the year of the "+arr[3]);
		}
		if(rem==4)
		{
			System.out.println(year+" is the year of the "+arr[4]);
		}
		if(rem==5)
		{
			System.out.println(year+" is the year of the "+arr[5]);
		}
		if(rem==6)
		{
			System.out.println(year+" is the year of the "+arr[6]);
		}
		if(rem==7)
		{
			System.out.println(year+" is the year of the "+arr[7]);
		}
		if(rem==8)
		{
			System.out.println(year+" is the year of the "+arr[8]);
		}
		if(rem==9)
		{
			System.out.println(year+" is the year of the "+arr[9]);
		}
		if(rem==10)
		{
			System.out.println(year+" is the year of the "+arr[10]);
		}
		
	    }
	}


