package LAB20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class FLES 
{	
	public static void occurence(String str)
	{
		int cnt=0;
		String str1=str.toLowerCase();
    	char ch;
    	for(int i=97;i<=122;i++)
    	{
    		ch=(char)i;
    		for(int j=0;j<str1.length();j++)
    		{
    			System.out.println(ch+" "+cnt);
    			
    			if(ch==str1.charAt(j))
    			{
    				cnt++;
    				    			}
    			
    		}
    		if(cnt>0)
    		{
    			System.out.println(ch+" occurs "+cnt+" times");
    		    
    		 }
    		cnt=0;
    	}	
		
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter file Name: ");
		String str=in.nextLine();
		File file =new File(str);
		try {
			    if (file.createNewFile())
			    {
			    	System.out.println("File is created!");
			    	FileWriter fw = new FileWriter(file,false);
					PrintWriter echo=new PrintWriter(fw);
			    	System.out.println("Enter something in file: ");
			    	String str1=in.nextLine();
			    	echo.println(str1);
			    	occurence(str1);
			    	echo.close();
			    	fw.close();
			    	
			    	
			    	
		        }
			    else
			    {
		        System.out.println("File already exists.");
		        Scanner sc=new Scanner(file);
		        String temp=sc.nextLine();
		        while(sc.hasNextLine())
		        {
		        	temp=temp+" "+sc.nextLine();
		        }
		        System.out.println(temp);
		        	occurence(temp);
			    }
		     
		      
	    	} catch (Exception e) {
		      e.printStackTrace();
		}
	

	}
}
