package LAB13;

public class Stock 
{
		String symbol;
		String name;
		double previousClosingPrice;
		double currentPrice;

		
		Stock(String symb,String nam,double close,double current)
		{
				symbol=symb;
				name=nam;
				previousClosingPrice=close;
				currentPrice=current;
		}
		
		public String getsymbol()
		{
			return symbol;
		}

		public String getname()
		{
			return name;
		}
		public double getpreviousClosingPrice()
		{
			return previousClosingPrice;
		}
		public double getcurrentPrice()
		{
			return currentPrice;
		}
		public void setpreviousClosingPrice(double newPCP)
		{
			previousClosingPrice=newPCP;
		}
		public void setcurrentPrice(double newCurrent)
		{
			currentPrice=newCurrent;
		}
		public double changePercent()
		{
			return ((currentPrice - previousClosingPrice) / previousClosingPrice)*100;
		}
}