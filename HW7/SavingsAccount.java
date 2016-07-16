package HW7;

// Dhruv Sheth    110738127 
public class SavingsAccount extends Account 
{
	public SavingsAccount(int id,double bal,double air)
	{
		super(id,bal,air);
	}
	String ToString()
	{
		return super.ToString()+" Balance : "+super.getbalance();  
	}
}
