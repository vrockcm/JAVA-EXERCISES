package LAB15;

public class Triangle extends GeometricObject
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
			return " area: "+getArea()+"\n perimeter:"+getPerimeter()+
					"\n color: "+getColor()+"\n filled: "+isFilled();
		}
		

}
