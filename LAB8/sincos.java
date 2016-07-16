package LAB8;
import java.util.*;
public class sincos 
{
	public static void main(String arg[])
	{
		
		System.out.print("Degree      Sin     Cos");
		for(int i=0;i<=360;i=i+10)
		{
			double sin=Math.sin( Math.toRadians(i));
			double cos=Math.cos( Math.toRadians(i));
			System.out.println();
			System.out.printf(i+"\t %3.4f \t %3.4f",sin,cos);
			
		}
	}

}
