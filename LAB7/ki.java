package LAB7;
import java.util.*;
public class ki 
{	
	
	public double poundsToKilos(double pounds)
	{
		double kilo=pounds/2.2;
		return(kilo);
	}
	public double kilosToPounds (double pounds)
	{
		double kilo=pounds*2.2;
		return(kilo);
	}
	public double kmToM(double pounds)
	{
		double m=pounds/0.62;
		return(m);
	}
	
	public double MToKm(double pounds)
	{
		double km=pounds*0.62;
		return(km);
	}
	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		double pounds;
		System.out.println("A – convert pounds to kilos");
		System.out.println("B – convert kilos to pounds");
		System.out.println("C – convert kilometers to miles");
		System.out.println("D – convert miles to kilometers");
		System.out.println("E - Exit");
		System.out.println("Enter yout option: ");
		char ch=in.next().charAt(0);
		ki ob1=new ki();
		switch(ch)
		{
			case 'A':
				System.out.println("Enter the quantity in pounds: ");
				pounds=in.nextDouble();
				double kg=ob1.poundsToKilos(pounds);
				System.out.println("quantity in kg: "+kg);
				ki.main(args);
				break;
			case 'B':
				System.out.println("Enter the quantity in kilo: ");
				pounds=in.nextDouble();
				double k=ob1.kilosToPounds(pounds);
				System.out.println("quantity in pounds: "+k);
				ki.main(args);
				break;
			case 'C':
				System.out.println("Enter the Kilometer: ");
				pounds=in.nextDouble();
				double m=ob1.kmToM(pounds);
				System.out.println("converted unit: "+m);
				ki.main(args);
				break;
			case 'D':
				System.out.println("Enter the Kilometer: ");
				pounds=in.nextDouble();
				double m1=ob1.MToKm(pounds);
				System.out.println("converted unit: "+m1);
				ki.main(args);
				break;
			case 'E':
				break;
			default:
					System.out.println("Invalid Option");
					break;
		}
				
				
				
		}
	}


