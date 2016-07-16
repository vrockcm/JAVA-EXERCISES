package HW7;

// Dhruv Sheth    110738127 
import java.util.*;
public class Account 
{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;


	public Account()
	{
		id=0;
		balance=1000;
		annualInterestRate=4.50;
		
	}
	public Account(int id,double b,double air)
	{
		this.id=id;
		balance=b;
		annualInterestRate=air;
		
	}
	public void setID(int Id)
	{
		this.id=id;
	}
	public void setbalance(double b)
	{
		balance=b;
	}
	public void setAIR(double air)
	{
		annualInterestRate=air;
	}
	public int getID()
	{
		return id;
	}
	public double getbalance()
	{
		return balance;
	}
	public double getAIR()
	{
		return annualInterestRate;
	}
	public void setDateCreated(Date newDateCreated) 
	{
	
		dateCreated = newDateCreated;
	}
	double getMonthlyInterestRate() 
	{
	    return annualInterestRate/12;
	}
	
	void withdraw(double amount) 
	{
		if(balance<=0)
		{
			System.out.println("Cannot Overdraw LIMIT REACHED");
			
		}
		if(balance>0)
		{
			System.out.println("Amount Withdrawn: "+amount);
			balance -= amount;	
		}
	    
	}   
	
	void deposit(double amount)
	{
	    balance += amount;
	}
	String ToString()
	{
		return "ID: "+id+"  Monthly Interest: "+getMonthlyInterestRate();
	}
}
	
	
	
	
	
	
	
	


