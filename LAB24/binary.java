package LAB24;

import java.util.*;
public class binary
{
	static String strBinary;
	private static String toBinary(int num)
	{ 
		if(num < 2) 
		{
			strBinary = "" + num; 
			return strBinary; 
			}
		else 
		{ 
			if(num != 0) 
			{ 
				toBinary(num/2); 
				strBinary += ""+num%2; 
				}
			} 
		return strBinary; 
		}   
	public static void main(String[] args)
	{  
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=in.nextInt();
		System.out.println(toBinary(n));  
		} 
	}
