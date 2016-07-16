package LAB22;

public class series
{
	public double series(double count)
	{
		double i=count;
		if(i==0)
		{
			return 0;
		}
		else
		{	
				
			
			
			
			return ((1/i)+series(i-1));
		
		}
		
	}
	public static void main(String args[])
	{
		series ob1=new series();
		System.out.println(ob1.series(10));
	}

}
