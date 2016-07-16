package LAB14;

public class RegularPolygram
{	
	private int n;
	private double side;
	private double x;
	private double y;
	
	public RegularPolygram()
	{
		n=3;
		side=1;
		x=0;
		y=0;
	}
	public RegularPolygram(int n,double side)
	{
		this.n=n;
		this.side=side;
		x=0;
		y=0;
	}
	public RegularPolygram(int n,double side,int x,int y)
	{
		this.n=n;
		this.side=side;
		this.x=x;
		this.y=y;
	}
	public int getn()
	{
		return n;
	}
	public double getside()
	{
		return side;
	}
	public double getx()
	{
		return x;
	}
	public double gety()
	{
		return y;
	}
	public void setn(int num)
	{
		n=num;
	}
	public void setside(double length)
	{
		side=length;
	}
	public void setx(double xcor)
	{
		x=xcor;
	}
	public void sety(double ycor)
	{
		y=ycor;
	}
	public double getPerimeter()
	{
		return n*side;
	}
	
	
	

}
