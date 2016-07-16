package LAB13;

public class GroceryItem 
{
	String name;
	int quantity;
	double price;
	
	public GroceryItem(String name,int quantity,double price)
	{
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	public double getCost()
	{
		return quantity*price;
	}
	public void setQuantity(int quan)
	{
		quantity=quan;
	}
	
	
	
}
