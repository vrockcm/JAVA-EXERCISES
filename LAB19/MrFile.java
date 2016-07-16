package LAB19;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class MrFile 
{	
	public static void main(String args[])
	{
		try
		{
			int cnt=0;
			File input=new File("test.txt");
			Scanner in=new Scanner(input);
			String line=in.next();
			line=" "+line;
			while(line!=null)
			{
				cnt++;
				if(in.hasNext())
					
					line=in.next();
				else
					line=null;
			}
			System.out.println("You have "+cnt+" words in this sentence");
		}
		catch(FileNotFoundException ie)
		{
			System.out.println("FILE NOT FOUND");
		}
		
		
	}

}
