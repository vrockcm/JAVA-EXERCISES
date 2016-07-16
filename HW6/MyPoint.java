// DHRUV SHETH 110738127

public class MyPoint 
{	
	double x;
	double y;
	MyPoint()
	{
		x=0;
		y=0;
	}
	MyPoint(double a,double b)
	{
		x=a;
		y=b;
	}
	public double xget()
	{
		return x;
	}
	public double yget()
	{
		return y;
	}
	public int distance(MyPoint n)
	{
		return distance(n.xget(),n.yget());
	}
	public int distance(double i,double j)
	{
		double dis=Math.sqrt(Math.pow(y-j, 2)+Math.pow(x-i,2));
		return (int)dis;
	}
	
	

}
