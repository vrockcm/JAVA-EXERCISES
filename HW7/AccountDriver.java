package HW7;

// Dhruv Sheth    110738127 

public class AccountDriver 
{
	public static void main(String args[])
	{
		Account p1=new CheckingAccount(1107333,1000,4.5,150);
		Account p2=new SavingsAccount(1107337,1000,4.5);
		p1.withdraw(500);
		p1.withdraw(500);
		p1.deposit(150);
		p1.withdraw(300);
		System.out.println(p1.ToString());
		p2.deposit(200);
		p2.withdraw(1000);
		p2.withdraw(200);
		System.out.println(p2.ToString());
		
		
	}

}
