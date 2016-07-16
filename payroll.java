import java.util.*;
public class payroll 
{
 
 public static void main(String args[]) 
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter Employee's name: ");
  String name = input.nextLine();
  System.out.print("Enter Number of hours worked in a week: ");
  double hours = input.nextDouble();
  System.out.print("Enter Hourly pay rate: ");
  double payrate = input.nextDouble();
  System.out.print("Enter federal tax withholding rate: ");
  float ftax= input.nextFloat();
  System.out.print("Enter state tax withholding rate: ");
  float stax= input.nextFloat();
  System.out.println("Employee's name: "+name);
  System.out.println("Hours worked: "+hours);
  System.out.println("Pay Rate: $"+payrate);
  double pay=hours*payrate;
  System.out.println("Gross Pay: $"+pay);
  System.out.println("Deductions:");
  float ftx=(float)pay*ftax;
  float stx=(float)pay*stax;
  System.out.println("federal withholding("+ftax*100+"%): $"+ ftx);
  System.out.println("state withholding("+stax*100+"%): $"+ stx);
  System.out.println("Total Deduction: $"+ftx+stx);
  pay=pay-ftx-stx;
  System.out.println("Net Pay: $"+pay);
 }
}
  
  
  

  
  
 