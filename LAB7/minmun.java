package LAB7;
 

import java.util.Scanner;

public class minmun {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

     int positive = 0, negative = 0, total = 0, count = 0;

    
     System.out.println("Enter the number: ");
     int number = input.nextInt();

      do{
    	    total += number;
    	    count++;
    	    if(number > 0){
    	        positive++;
    	    } else if(number < 0) {
    	        negative++;
    	    }
    	} while((number = input.nextInt()) != 0);
    	float average = total / (float) count; // <-- not integer math.
    	System.out.println("The number of positives is " + positive);
    	System.out.println("The number of negatives is " + negative);
    	System.out.println("The total is " + total);
    	System.out.println("The average is " + average);
     average = total / count;

     }
   }
