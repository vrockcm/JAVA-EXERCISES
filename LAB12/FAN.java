package LAB12;

public class FAN 
{
	private int SLOW;
	private int MEDIUM;
	private int FAST;
	private int speed;
	boolean on;
	private double radius;
	private String color;
	
	FAN()
	{
		SLOW=1;
		MEDIUM=2;
		FAST=3;
		speed=1;
		on=false;
		radius=5;
		color="blue";
	}
	public int getSpeed()
	{
		return speed;
	}
	public boolean getPower()
	{
		return on;
	}
	public String getcolor()
	{
		return color;
	}
	public double getradius()
	{
		return radius;
	}
	public void setSpeed(int s)
	{
		speed=s;
	}
	public void setRadius(double r)
	{
		radius=r;
	}
	public void setPower(boolean pow)
	{
		on=pow;
	}
	public void setcolor(String s)
	{
		color=s;
	}
	public String AString()
	{
		String str="";
		if(on==true)
		{
			str="FAN Speed="+speed+" FAN Color="+color+" radius="+radius;
		}
		else
		{
			str="FAN Color="+color+" radius="+radius+" FAN is OFF";
		}
		return str;
		
	}
	public static void main(String args[])
	{
		String result="";
		String result1="";
		FAN ob1=new FAN();
		FAN ob2=new FAN();
		ob1.setSpeed(3);
		ob1.setRadius(10.0);
		ob1.setcolor("blue");
		ob1.setPower(true);
		ob2.setSpeed(2);
		ob2.setRadius(5.0);
		ob2.setcolor("blue");
		ob2.setPower(false);
		result=ob1.AString();
		result1=ob2.AString();
		System.out.println(result);
		System.out.println(result1);
		
	}
	
	
	
	
	
	
	
}
