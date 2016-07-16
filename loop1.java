import java.util.*;
public class loop1 
{
	public static void main(String args[])
	{
		int k=2,o,p,i,s;
		int x=45;
		for(i=1;i<=9;i++)
		{
			for(s=1;s<k;s++)
			{
				System.out.print(" ");
			}
			for(o=i;o<=9;o++)
			{
				System.out.print(o);
			}
			for(p=8;p>=i;p--)
			{
				System.out.print(p);
			}
			k++;
			
			System.out.println();
			
		}
	}

}
