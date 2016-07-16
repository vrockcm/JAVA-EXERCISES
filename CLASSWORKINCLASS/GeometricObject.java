package CLASSWORKINCLASS;

import java.util.Scanner;

abstract class  GeometricObject 
{
		private  String  color = "white";
		private  boolean  filled;
		private  java.util.Date dateCreated;


		protected GeometricObject() 
		{
		}

/** Construct  a geometric object  with color and filled value  */
		protected GeometricObject(String  color, boolean  filled) 
		{
			dateCreated = new java.util.Date();
			this.color = color;
			this.filled = filled;
			
		}

/** Return color */
public String  getColor() 
{
return color;
}

/** Set a new color */
public void setColor(String  color) 
{
this.color = color;
}

/** Return filled. Since filled is boolean ,
* the get method  is named  isFilled */
public boolean  isFilled()
{
return filled;
}

/** Set a new filled */
public void setFilled(boolean  filled) 
{
this.filled = filled;
}

/** Get dateCreated */
public java.util.Date getDateCreated() 
{
return dateCreated;
}


public String  toString() 
{
return "created on " + dateCreated + "\ncolor: " + color +
" and filled: " + filled;
}

/** Abstract method  getArea */
public abstract double  getArea();

/** Abstract method  getPerimeter */
public abstract double  getPerimeter();
}



class Triangle extends GeometricObject
{
		public double side1;
		public double side2;
		public double side3;
		
		public Triangle()
		{
			side1=1.0;
			side2=1.0;
			side3=1.0;
			
		}
		public Triangle(double s1,double s2,double s3)
		{
			side1=s1;
			side2=s2;
			side3=s3;
			
		}
		public double getside1()
		{
			return side1;
		}
		public double getside2()
		{
			return side2;
		}
		public double getside3()
		{
			return side3;
		}
		public double getArea()
		{
			double s = 0.5 * (side1 + side2 + side3);
	        return (Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
		}
		public double getPerimeter()
		{
			return side1+side2+side3;
		}
		public String toString()
		{
			return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
		}
		

}

class Driver
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		double side1,side2,side3;
		String fill="";
		String colo="";
		System.out.print("Enter side 1 of triangle:");
		side1=in.nextDouble();
		System.out.print("Enter side 2 of triangle:");
		side2=in.nextDouble();
		System.out.print("Enter side 3 of triangle:");
		side3=in.nextDouble();
		System.out.print("Enter color of triangle:");
		colo=in.next();
		System.out.print("Enter whether triangle is filled (yes/no):");
		fill=in.next();
		GeometricObject ob1=new Triangle(side1,side2,side3);
		ob1.setColor(colo);
		if(fill=="no")
		{
			ob1.setFilled(false);
		}
		else
			ob1.setFilled(true);
		
		System.out.println("Area: "+ob1.getArea());
		System.out.println("Perimeter: "+ob1.getPerimeter());
		System.out.println("Color: "+ob1.getColor());
		System.out.println("Filled?: "+ob1.isFilled());
	}
}
		
