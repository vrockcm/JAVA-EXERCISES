package LAB15;
import java.util.*;
public class Test 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		Triangle tri1=new Triangle(1,1.5,1);
		tri1.setColor("yellow");
		tri1.setFilled(true);
		in.nextDouble();
		System.out.println(tri1.toString());
	}

}
