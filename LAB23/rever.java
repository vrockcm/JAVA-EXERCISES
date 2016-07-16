package LAB23;

public class rever 
{
	private int rev=0;

	public static void reverseDisplay(int value)
	{	
		if(value==0)
		{
			return;
		}
		else
		{
			 System.out.print(" " + value % 10);       
	         reverseDisplay(value/10);
	    
	    }
	}
	public int reverse(int value)
	{	
		
		if(value<=0)
		{
			return rev;
		}
		else
		{
			
				int rem=value%10;
				rev=rev*10+rem;
				value=value/10;
				return reverse(value);
			
		}
		
	    
	    }
	
		public static void main(String args[])
		{
				rever ob1=new rever();
				ob1.reverseDisplay(12345);
				System.out.println("\n"+ob1.reverse(12345));
		}
		
		
		
		
}

