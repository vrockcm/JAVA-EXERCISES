package LAB17;
import java.io.*;
import java.util.*;
public class Replace 
{	
	public static void main(String args[])
	{
		
		try
		{
			File input=new File("Java.txt");
			Scanner in=new Scanner(input);
			File output=new File("HTML.txt");
			FileWriter fw = new FileWriter(output,false);
			PrintWriter echo=new PrintWriter(fw);
			String line=in.nextLine();
			while(line!=null)
			{
				line=line.replace("Java","HTML");
				echo.println(line);
				if(in.hasNextLine())
				
					line=in.nextLine();
				else
					line=null;
							
			}
			echo.flush();
			echo.close();
			in.close();
		}
		catch(IOException io)
		{
			System.out.println("SOMETHING WENT WRONG");
			System.out.println(io);
		}
		System.out.println("the program ended");
	}
}