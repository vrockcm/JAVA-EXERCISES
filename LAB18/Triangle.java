package LAB18;
class IllegalTriangleException extends Exception 
{

private double side = 1.0;

public IllegalTriangleException(double side) {
    super(side + " is larger than other two combined");

} 

public double getSide() {
    return side;
}

}
public class Triangle 
{
	private double side1;
	private double side2;
	private double side3;
	public Triangle()
	{
		side1=1.0;
        side2=1.0;
        side3=1.0;
		
	}
	public Triangle(double side1,double side2,double side3)throws IllegalTriangleException 
	{
		if (side1 >= side2 + side3)
	        throw new IllegalTriangleException(side1);
	    else if (side2 >= side1 + side3)
	        throw new IllegalTriangleException(side2);
	    else if (side3 >= side2 + side1)
	        throw new IllegalTriangleException(side3);
	    else {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }

    }
}


