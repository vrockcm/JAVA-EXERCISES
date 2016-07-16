package LAB4;

import java.util.*;
import java.text.DecimalFormat;
class kilopound
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Kilograms  Pounds  Pounds  Kilograms");
        DecimalFormat df2 = new DecimalFormat("###.##");
        double p=20.0;
        for(double i=1.0;i<200.0;i=i+2)
        {
            System.out.println((int)i+"    "+df2.format(i*2.2)+"    "+(int)p+"     "+df2.format(p/2.2));
            if(p<=515)
            {
            p=p+5;
        }
    }
}
}