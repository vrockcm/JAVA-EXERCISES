package HW7;

// Dhruv Sheth    110738127 
public class CheckingAccount extends Account 
{
	private double overdraft;
	public CheckingAccount(int id,double bal,double air,double Over)
	{
		super(id,bal+Over,air);
		overdraft=Over;
	}
	String ToString()
	{
		if(super.getbalance()==0)
		{
			System.out.println("0 BALANCE");
			System.out.println("You have withdrawn your overdraft amount:"+overdraft);
		}
		return super.ToString()+" Balance : "+super.getbalance();  
	}
}
