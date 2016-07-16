package LAB4;

import java.util.*;
import java.text.DecimalFormat;
class miles
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Miles and Kilometers");
        DecimalFormat df2 = new DecimalFormat("###.##");
        for(double i=1.0;i<=10.0;i++)
        {
            System.out.println((int)i+"    "+df2.format(i*1.609));
        }
    }
}