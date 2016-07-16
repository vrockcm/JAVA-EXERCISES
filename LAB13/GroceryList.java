package LAB13;
import java.util.*;
public class GroceryList
{
	ArrayList<GroceryItem> List;
	int count;
	double total;
	
	GroceryList()
	{
		List=new ArrayList<GroceryItem>(10);
	}
	public void add(GroceryItem ob1)
	{ 
		if(count<=10)
		List.add(ob1);
		count++;
	}
	public double getTotalCost()
	{
		for (int  i= 0; i < List.size(); i++)
		{
			GroceryItem ob = List.get(i); // retrieve next element
			total=total+ob.getCost();
			
		}
		return total;
	}
	public static void main(String args[])
	{
		GroceryList checklist=new GroceryList();
		checklist.add(new GroceryItem("Eggs",12,1.25));
		checklist.add(new GroceryItem("Milk",1,4.0));
		checklist.add(new GroceryItem("Beef Meat",2,10.50));
		System.out.println("Total cost to pay:"+checklist.getTotalCost());
		
		
		
	}
	
	
}
