package LAB8;
import java.util.*;
public class SQRT 
{
	public void sqrt(int n)
	{
		double lastGuess=1;
		do
		{
			double nextGuess=(lastGuess+(n/lastGuess))/2;
			if(nextGuess-lastGuess <0.0001)
			{
				System.out.println(nextGuess);
				break;
			}
			else
			{
				nextGuess=lastGuess;
			}
			
			lastGuess++;
		}while(true);
	}
	
	
	
	
	
	
	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		SQRT ob1=new SQRT();
		System.out.println("Enter the numebr:");
		int num=in.nextInt();
		ob1.sqrt(num);
		
	}

}
