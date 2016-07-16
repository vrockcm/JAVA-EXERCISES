package LAB11;
import java.util.*;
public class coin
{
  public static int[] decimalToBinary(int decimal)
  {
	  int[] nums = new int[9];
	  for (int i = nums.length-1;i>=0 && decimal >0;i--)
	  {
		  if ( decimal% 2 == 0)
			  nums[i] = 0;
		  else 
			  nums[i] = 1;
		  decimal /= 2;
	  }
	  return nums;
  }

  public static void printHeadsAndTails(int nums[])
  {
    for (int i =0; i<9;i++)
    {
      if (nums[i] == 0) 
		  System.out.print("H");
		
      else  
		  System.out.print("T");
		if(i==2 || i==5 || i==8)
	{	
		System.out.print("");
	}
		else
			System.out.print(" ");
		
      if ((i+1) % 3 == 0)
		  System.out.println();
      
    }
  }
  public static void main (String[] args)
  {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter an integer representing the state of the coins:");
    int number = in.nextInt();
    int nums[] = decimalToBinary(number);
    printHeadsAndTails(nums);
  }
}