package LAB7;

import java.util.*;

public class pat{
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter an integer to be a limit of the pattern:");
  int n =in.nextInt();
  System.out.println("Pattern A:");
  int i,j;
  for(i=1;i<=n;i++)
  {
      for(j=i;j>=1;j--)
      {
          System.out.print(j+" ");
        }
        System.out.println();
    }
 }
}