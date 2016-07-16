
// DHRUV SHETH 110738127
import java.util.Scanner;

public class Binary2Hex 
{
	public static String binaryToHex(String binaryValue)
	{
		long num=Long.parseLong(binaryValue);
		
		  while(num > 0)
		  {
			 long rem = num % 10;
			  num = num / 10;
			  if(rem != 0 && rem != 1)
			  {
				  	return "This is not a binary number.";
			  }
		  }
		 int digitNumber=1;
		 int sum=0;
		 String result="";
		for(int i = 0; i < binaryValue.length(); i++)
		{
		        if(digitNumber == 1)
		            sum+=Integer.parseInt(binaryValue.charAt(i) + "")*8;
		        else if(digitNumber == 2)
		            sum+=Integer.parseInt(binaryValue.charAt(i) + "")*4;
		        else if(digitNumber == 3)
		            sum+=Integer.parseInt(binaryValue.charAt(i) + "")*2;
		        else if(digitNumber == 4 || i < binaryValue.length()+1)
		        {
		            sum+=Integer.parseInt(binaryValue.charAt(i) + "")*1;
		            digitNumber = 0;
		        
		        if(sum<10)
		        {
		        	result=result+sum;
		        }
		        else if(sum == 10)
		        	result=result+"A";
	            else if(sum == 11)
	            	result=result+"B";
	            else if(sum == 12)
	            	result=result+"C";
	            else if(sum == 13)
	            	result=result+"D";
	            else if(sum == 14)
	            	result=result+"E";
	            else if(sum == 15)
	            	result=result+"F";
		        sum=0;
		        }
		        digitNumber++;
		}
		return result;
	
	}
	public static String pad(String s) 
	{
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			cnt++;
		}
		while (cnt%4!=0)
			{
				s="0"+s;
				cnt++;
			}
		return s;
    }
		public static void main(String args[])
		{
			
			Scanner in=new Scanner(System.in);
			Binary2Hex ob1=new Binary2Hex();
			System.out.println("Enter the binary String ");
			String a=in.next();
			String str=ob1.binaryToHex(ob1.pad(a));
			System.out.println(str);
			
		}
		
		
		
	}

