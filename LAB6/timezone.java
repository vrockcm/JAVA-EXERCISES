 
import java.util.*;
public class timezone
{
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in)
        System.out.println("Enter the first participant's time zone offset to GMT: ");
        int first=in.nextInt();
        System.out.println("Enter the second participant's time zone offset to GMT: ");
        int second=in.nextInt();
        int sum=0;
        DateTime dt = new DateTime(); 
        int hours = dt.getHourOfDay();
        
        
        
        
        