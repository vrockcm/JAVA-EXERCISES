
public class arr 
{
	public static void main(String args[])
	{
		int x[][]={{1,2,3},{4,5,6}};
		md(x);
	}
	public static double arraytricks(int num[])
	{
		
		double sum=0.0;
		for(int i:num)
		{
			sum+=i;
		}
		System.out.println();
		return sum/num.length;
		
		
	}
	public static void md(int values[][])
	{
		int total=0;
		for(int row[]:values)
		{
			for(int col:row)
			{
				total=total+col;
			}
			
		}System.out.println(total);
	}
}
