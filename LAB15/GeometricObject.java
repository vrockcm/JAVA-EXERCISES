package LAB15;

public class GeometricObject 
{
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject()
	{
		dateCreated=new java.util.Date();
	}
	public GeometricObject(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setFilled(boolean filled)
	{
		this.filled=filled;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
	public String toString()
	{ 
		return "created on "+dateCreated+"\n color: "+color+" and filled:"+filled;
	}

}

