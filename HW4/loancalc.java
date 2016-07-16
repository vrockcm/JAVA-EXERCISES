//Dhruv Sheth 110738127
package HW4;
import java.util.*;
public class loancalc
{	
	public static void main(String args[])
	{
		  Scanner in = new Scanner(System.in);
		 
		  System.out.print("Enter loan amount:");
		  double loan = in.nextDouble();
		 
		  System.out.print("Enter number of years: ");
		  int years = in.nextInt();
		 
		  double ir = 5.0;
		 
		  System.out.println("Interest Rate   Monthly Payment   Total Payment");
		 
		  while (ir <= 8.0) 
		{
		      double mir = ir / 1200;
		 
		   double monpayment = loan* mir/ (1 - 1 / Math.pow(1 + mir,years * 12));
		   double totalPayment = monpayment * years * 12;
		 
		   System.out.printf("%-18.3f%-18.2f%-18.2f\n", ir,
		     monpayment, totalPayment);
		 
		   ir = ir + 1.0 / 8;
		 
		}
	}
}

