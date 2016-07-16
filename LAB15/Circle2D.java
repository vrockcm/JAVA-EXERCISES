package LAB15;

public class Circle2D 
{	
	double X;
	double Y;
	double radius;
	
	public double getx()
	{
		return X;
	}
	public double gety()
	{
		return Y;
	}
	public double getRadius()
	{
		return radius;
	}
	public Circle2D()
	{
		X=0;
		Y=0;
		radius=1;
	}
	public Circle2D(double x,double y,double radius)
	{
		this.X=x;
		this.Y=y;
		this.radius=radius;
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}
	public boolean insideCircle(double x,double y)
	{
		double dist = Math.sqrt((x-X)*(x-X)-(y-Y)*(y-Y));
		if (dist<radius)
		{
			return true;
		}
		else
			return false;
	}
	public boolean CircleinsideCircle(Circle2D circle)
	{
		double dist = Math.sqrt((X-circle.X)*(X-circle.X)-(Y-circle.Y)*(Y-circle.Y));
		if (dist+circle.radius<=radius)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean CircleOverlap(Circle2D circle)
	{
		double dist =  Math.sqrt((Math.pow(circle.X - X, 2) + Math.pow(circle.Y - Y, 2)));
		if (dist<(radius+circle.radius))
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String args[])
	{
		Circle2D circ=new Circle2D(0,0,10.0);
		Circle2D circ2=new Circle2D(0,0,4.0);
		Circle2D circ3=new Circle2D(0,2,10.0);
		System.out.println("AREA: "+circ.getArea());
		System.out.println("PERIMETER: "+circ.getPerimeter());
		System.out.println("are the 2 co-or in circle: "+circ.insideCircle(0.5,0));
		System.out.println("is the new circle inside the first circle: "+circ.CircleinsideCircle(circ2));
		System.out.println("does the new circle overlap: "+circ.CircleOverlap(circ3));
		
		
	}
	
	
	
	

}
