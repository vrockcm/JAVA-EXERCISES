package HW7;

// Dhruv Sheth    110738127 
import java.util.Scanner;
public class ComplexDriver 
{	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 1st Complex Number");
		double a=in.nextDouble();
		double b=in.nextDouble();
		Complex ob1=new Complex(a,b);
		System.out.println("Enter 2nd Complex Number");
		double o=in.nextDouble();
		double p=in.nextDouble();
		Complex ob2=new Complex(o,p);
		System.out.println("a + b        = " + Complex.ToString(ob1.add(ob2)));
        System.out.println("a - b        = " + Complex.ToString(ob1.sub(ob2)));
        System.out.println("a * b        = " + Complex.ToString(ob1.multi(ob2)));
		System.out.println("a / b        = " + Complex.ToString(ob1.divide(ob2)));
	}

}
