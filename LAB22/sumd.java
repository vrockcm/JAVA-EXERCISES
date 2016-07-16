package LAB22;

public class sumd 
{
		public static long sumDigits(long n)
		{
			long total=0;
			if(n==0)
			{
				return 0;
			}
			else
			{
				total=n%10;
				return total+sumDigits(n/10);
			}
		}
		public static void main(String args[])
		{
			sumd ob1=new sumd();
			System.out.println(ob1.sumDigits(234));
		}


}
