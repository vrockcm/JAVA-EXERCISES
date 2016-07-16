package LAB21;
import java.util.*;
public class Hex2Dec 
{
	

    public int hex2decimal(String s)throws HexFormatException
    {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        boolean mr=false;
        for(int i=0;i<s.length();i++)
        {
        	char ch=s.charAt(i);
        	for(int j=0;j<digits.length();j++)
        	{
        		char ch2=digits.charAt(j);
        		if(ch==ch2)
        		{
        			mr=true;
        		}
        		
        	}
        	if(mr!=true)
        	{
        		
        			throw new HexFormatException(); 
        		
        	}
        	mr=false;
        }
        int val = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
    public class HexFormatException extends Exception
    {
    	public HexFormatException()
    	{
    		super("String is not a Hex String");
    	}  	
    }
    public static void main(String args[])
    {
    	Scanner in=new Scanner(System.in);
    	Hex2Dec ob1=new Hex2Dec();
    	try{
    		System.out.println("Enter String:");
    		String str=in.nextLine();
    	System.out.println(ob1.hex2decimal(str));
    	}
    	catch(HexFormatException ie)
    	{
    		System.out.println(ie.getMessage());
    	}
    	
    }
}