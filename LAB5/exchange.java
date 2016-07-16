package LAB5;

import java.util.*;
class exchange
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,dol;
        double RMD,y;
        System.out.println("Enter the exchange rate from dollars to RMD: ");
        RMD=in.nextDouble();
        System.out.println("Enter 0 to covert dollars to RMB and 1 vice versa: ");
        n=in.nextInt();
        switch(n)
        {
            case 0:
                    System.out.println("Enter Dollar Amount:");
                    dol=in.nextInt();
                    y=dol*RMD;
                    System.out.println("$"+dol+" is "+y+" yuan");
                    break;
            case 1:
                    System.out.println("Enter Yuan Amount:");
                    dol=in.nextInt();
                    y=dol/RMD;
                    System.out.println(dol+" yuan is $"+y);
                    break;
        }
    }
}
        