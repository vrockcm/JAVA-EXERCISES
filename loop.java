import java.util.*;
public class loop
 {
    public static void main(String args[])
    {
        int i,j,k=1;
    
        int a[][]=new int[4][4];
        int b[][]=new int[4][4];
        for(i=0;i<=3;i++)
        {
            for(j=0;j<=3;j++)
            {
                a[i][j]=k;
                k++;
            }
        }
        for(i=0;i<=3;i++)
           {
               for(j=0;j<=3;j++)
                {
                    b[j][i]=a[i][j];
                }
            }
                    
            
       for(i=0;i<=3;i++)
            {
                for(j=0;j<=3;j++)
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }
                 }
    }


