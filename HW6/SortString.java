// DHRUV SHETH 110738127

import java.util.*;
public class SortString 
{
	public static String sort(String s)
	{
		s.toLowerCase();
		char arr[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			arr[i]=s.charAt(i);
		}
		char t;
		for(int o=0;o<s.length()-1;o++)
		{
			for(int j=0;j<s.length()-1-o;j++)
			{
				if(arr[j]>arr[j+1])
				   {
				    t=arr[j];
				    arr[j]=arr[j+1];
				    arr[j+1]=t;
				   }
				
				
			}
		}
		String result="";
		for(int i=0;i<s.length();i++)
		{
			result=result+arr[i];
		}
		return result;
	}
	public static void main(String args[])
	{	
		Scanner in=new Scanner(System.in);
		SortString ob1=new SortString();
		System.out.println("Enter the String:");
		String str=in.next();
		System.out.println(ob1.sort(str));
	}
}
		
		
		
	