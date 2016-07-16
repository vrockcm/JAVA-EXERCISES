package LAB19;
import java.util.*;
public class except 
{
	 public static void main(String[] args)
	 {
		 Scanner in=new Scanner(System.in);
	        int i;
	        int[] ar1 = new int[100];
	        for(i = 0; i <  ar1.length; i++) 
	        {
	            ar1[i] = (int)(Math.random() * 100);
	        }
	        try
	        {
	        	System.out.println("Enter Index");
	        	int ind=in.nextInt();
	        	System.out.println(ar1[ind]);
	        }
	        catch(ArrayIndexOutOfBoundsException ie)
	        {
	        	System.out.println("Out of Bounds");
	        }
	        

	 }
}
