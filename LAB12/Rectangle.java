package LAB12;

public class Rectangle 
{
	private double width;
	private double height;
	private String color;
	
	Rectangle()
	{
		width=1.0;
		height=1.0;
		color="white";
	}
	Rectangle(double w,double h,String c)
	{
		width=w;
		height=h;
		color=c;
	}
	public double width()
	{
		return width;
	}
	public double height()
	{
		return height;
	}
	public String color()
	{
		return color;
	}
	public void setWidth(double w)
	{
		width=w;
	}
	public void setHeight(double h)
	{
		height=h;
	}
	public void setcolor(String s)
	{
		color=s;
	}
	public static double getArea(double wi,double he)
	{
		double area=wi*he;
		return area;
	}
	public static double getPerimeter(double wi,double he)
	{
		double peri=wi+wi+he+he;
		return peri;
	}
	public static void main(String args[])
	{
		Rectangle ob1=new Rectangle(4,40,"Red");
		Rectangle ob2=new Rectangle(3.5,39.5,"Red");
		System.out.println("Width of 1st rectangle:"+ob1.width);
		System.out.println("Height of 1st rectangle:"+ob1.height);
		System.out.println("Width of 2nd rectangle:"+ob2.width);
		System.out.println("Height of 2nd rectangle:"+ob2.height);
		System.out.println("AREA OF 1st rectangle:"+ob1.getArea(ob1.width,ob1.height));
		System.out.println("Perimeter of 1st rectangle:"+ob1.getPerimeter(ob1.width,ob1.height));
		System.out.println("AREA OF 2nd rectangle:"+ob2.getArea(ob2.width,ob2.height));
		System.out.println("Perimeter of 1st rectangle:"+ob2.getPerimeter(ob2.width,ob2.height));
	}
	
	
	
	
	
}
