package LAB21;
import java.util.*;
public class Square extends GeometricObject 
{

	private double a;
	public Square(String color, boolean filled,double side)
	{
		super(color,filled);
	    a=side;
		
	}
	@Override
	public double getArea()
	{
		
		return Math.pow(a,2);
	}

	@Override
	public double getPerimeter() 
	{
		return a+a+a+a;
	}
	public static void main(String args[])
	{
		ArrayList<GeometricObject> arr=new ArrayList<GeometricObject>(5) ;
		arr.add(new Square("white",true,5));
		arr.add(new Square("blue",true,5));
		arr.add(new Square("orange",true,5));
		arr.add(new Square("purple",true,5));
		arr.add(new Square("",false,5));
		
		for(int i=0;i<5;i++)
		{
			arr.get(i).howToColor();
		}
		
		
	}

}
