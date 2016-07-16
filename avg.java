
public class avg 
{
	public static void main(String args[])
	{
		int numbers[]={2,5,8,8};
	
	int	total=0;
	for(int i=0;i<numbers.length;i++)
	{	
		total=total+numbers[i];
	
	}
	double avg=(double)total/numbers.length;
	System.out.println(avg);
   }
}
