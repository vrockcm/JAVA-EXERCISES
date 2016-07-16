package LAB4;

import java.util.*;
class sort
{
    public static void main(int num1,int num2,int num3)
    {
        int temp;
        
        if ((num1 > num2 && num1 > num3))
        {
            if(num2 > num3)
            {
                System.out.print(num3 + " " + num2 + " " + num1);
            }
            else
                System.out.print(num2 + " " + num3 + " " + num1);
        }
        else if ((num2 > num1 && num2 > num3))
        {
            if(num1 > num3)
            {
                System.out.print(num3 + " " + num1 + " " + num1);
            }
            else
                {
                System.out.print(num1 + " " + num3 + " " + num2);
                }
        }
        else if ((num3 > num1 && num3 > num2))
        {
            if(num1 > num2)
            {
                System.out.print(num2 + " " + num1 + " " + num3);
            }
            else
                System.out.print(num1 + " " + num2 + " " + num3);
        }
    }
}