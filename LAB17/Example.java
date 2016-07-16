package LAB17;
import java.io.*;
import java.util.*;
public class Example 
{

		public static void main (String [ ] args)
		{
			int total=0;
			double avg=0;
			try
			{
				
				File input=new File("test.txt");
				Scanner in = new Scanner(input);
				int cnt=0;
				while (in.hasNext())
				{
					String line=in.next();
					int foo=Integer.parseInt(line);
					total=total+foo;
					cnt++;
				}
				
				System.out.println("Total="+total);
				System.out.println("AVG:"+(total/cnt));
				
				in.close(); 
				
			}
			catch (IOException i)
			{
				System.out.println("Something went wrong!");
				System.out.println(i);
			}
			
			System.out.println("The program ends here.");
			
		}
	}

