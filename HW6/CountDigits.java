// DHRUV SHETH 110738127

import java.util.*;
public class CountDigits
{
	public static int[] count(String s)
	{
		int cnt=0;
		int arr[]=new int[10];
		for(int i=0;i<s.length();i++)
		{
			int digit=0;
			char ch=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))
				{
					cnt++;
					digit=(int)ch-(int)'0';
				}
				
			}
			
			arr[digit]=cnt;
			cnt=0;
		}
		return arr;
	}
	public static void main(String args[])
	{
		
		Scanner in=new Scanner(System.in);
		CountDigits ob1=new CountDigits();
		System.out.println("Enter the String with numbers");
		String a=in.next();
		int ar[]=ob1.count(a);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(i+" occurs "+ar[i]);
		}
		}
	}
