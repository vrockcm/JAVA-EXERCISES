package LAB13;

public class StockDriver 
{
	public static void main(String args[])
	{
		Stock ob1=new Stock("GOOG","Google Inc",90,100);
		System.out.println("the  percentage of change:"+ob1.changePercent());

	}
}
