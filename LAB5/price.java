package LAB5;

import java.util.*;
class price
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("how many packages you want to compare:");
        int n=in.nextInt();
        int w=0,bi=0,i;
        double avg=0.0,p=0.0;
        double best=99999.0;
        for(i=1;i<=n;i++)
        {
            System.out.println("Enter weight and price for package "+i);
            w=in.nextInt();
            p=in.nextDouble();
            avg=p/w;
            if(avg<best)
               {best=avg;
                bi=i;}
            }
    
        System.out.println("Package "+bi+" has a better price per pound");
    }
}
        
                
                
    
    