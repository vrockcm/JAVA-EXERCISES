package LAB2;

//DHRUV SHETH 110738127
import java.util.*;
class ftoc
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        double celsius=0;
        System.out.println("Enter Fahrenheit degree:");
        double f=in.nextDouble();
        celsius=(f-32)*5.0/9.0;
        System.out.println("Converted to Celsius:"+celsius);
    }
}
        