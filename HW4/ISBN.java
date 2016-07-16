//Dhruv Sheth 110738127
package HW4;
import java.util.*;
public class ISBN 
{
	public static void main(String[] args) {
		{
			Scanner s = new Scanner(System.in);
		
		  int d1, d2, d3, d4, d5, d6, d7, d8, d9;
		  int d10;
		  
		  System.out.print("Enter the first 9 digits of an ISBN as integer:");
		  d1 = s.nextInt();
		  d2 = s.nextInt();
		  d3 = s.nextInt();
		  d4 = s.nextInt();
		  d5 = s.nextInt();
		  d6 = s.nextInt();
		  d7 = s.nextInt();
		  d8 = s.nextInt();
		  d9 = s.nextInt();
		  
		  d10 = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+ d7 * 7 + d8 * 8 + d9 * 9) % 11;
		  
		  if(d10 == 10) {
		 String output = d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+"X";
		 System.out.print(output);
		  } else {
		 String output = d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+d10;
		 System.out.print(output);
		  }
		}
	}
}
