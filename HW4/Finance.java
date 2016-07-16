//Dhruv Sheth 110738127
package HW4;

import java.util.*;
public class Finance 
{

    public static void main(String[] args)
    {
        double tuition = 10000;
        int count = 1;
        double increase = 1.05;
        double increasedTuition= 0;

        for(int i=1;i<=10;i++)
        {
            increasedTuition = tuition * increase;
            count++;
        } 
       

        if (count ==10);
        System.out.print("Tuition in ten years is $ \n" + increasedTuition);        
        do {
            increasedTuition = tuition * increase;
        }
        while (count==10 && count < 14);
        count ++;
        
         if (count ==14);
         System.out.print("The four-year tuitiuon in ten years is $ " + increasedTuition);
        }

    }