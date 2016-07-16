package HW7;

// Dhruv Sheth    110738127 
public class Complex 
{
	private double a;
	private double b;
	public Complex(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public Complex(double a)
	{
		this.a=0;
		b=0;
	}
	public Complex()
	{
		a=0;
		b=0;
	}
	public double getRealPart()
	{
		return a;
	}
	public double getImaginaryPart()
	{
		return b;
	}
	 public Complex add(Complex b) 
	 {
	        Complex a = this;             // invoking object
	        double real = a.a + b.a;
	        double imag = a.b + b.b;
	        return new Complex(real, imag);
	 }
	 public Complex sub(Complex b) 
	 {
	        Complex a = this;
	        double real = a.a - b.a;
	        double imag = a.b - b.b;
	        return new Complex(real, imag);
	    }
	 public Complex multi(Complex b) 
	 {
	        Complex a = this;
	        double real = a.a * b.a - a.b * b.b;
	        double imag = a.a * b.b + a.b * b.a;
	        return new Complex(real, imag);
	    }
	 public Complex divide(Complex b) 
	 {
	        Complex a = this;
	        double temp=(b.a*b.a)+(b.b*b.b);
	        Complex q=new Complex(b.a/temp,(-b.b)/temp);
	        return a.multi(q);
	    }

	
	public static String ToString(Complex print)
	{
		if(print.b==0)
			return print.a+"";
		if(print.a==0)
			return print.b+"i";
		if(print.b<0)
			return print.a+" - "+(-print.b)+"i";
		return print.a+" + "+print.b+"i";
	}
	
	}

