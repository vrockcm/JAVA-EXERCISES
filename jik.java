import java.util.Scanner;
class jik
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("1.Calculate peri");
		System.out.println("2.Calculate Area");
		
		int i=in.nextInt();
		switch(i)
		{
			case 1:
			{
				System.out.println("Using case 1");
				break;
			}
			case 2:
			{
				System.out.println("Using Case 2");
				break;
			}
		}
	}
}