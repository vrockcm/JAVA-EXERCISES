//DHURV SHETH 110738127

import java.util.*;
public class MyIntegerDriver
{
	
    public static void main(String[] args) 
    {
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter a value:");
    	int n=in.nextInt();
        MyInteger ob1= new MyInteger(n);
        System.out.println("TESTING VIA OBJECT");
        System.out.println("Is value even:" + MyInteger.isEven(ob1));
        System.out.println("Is value odd:" + MyInteger.isOdd(ob1));
        System.out.println("Is value prime:" + MyInteger.isPrime(ob1));
        System.out.println("TESTING DIRECTLY VIA OBJECT");
        System.out.println("Is value even:" + ob1.isEven());
        System.out.println("Is value odd:" + ob1.isOdd());
        System.out.println("Is value prime:" + ob1.isPrime());
        System.out.println("COMPARING THE NEW VALUE WITH OLD ONE");
        System.out.println("Enter a value:");
    	int n2=in.nextInt();
        MyInteger ob2= new MyInteger(n2);
        System.out.println("is n2 equal to n2:"+ob1.equals(ob2));
        System.out.println("CONVERTING THE STRING TO INTEGERS");
        System.out.println("Enter a String:");
    	String str=in.next();
    	System.out.println("CONVERTED STRING TO INTEGERS:"+MyInteger.parseInt(str));
        
    }

}
