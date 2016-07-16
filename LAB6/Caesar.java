package LAB6;
import java.util.*;
public class Caesar
{
    public static void main(String arg[])
    {
        String msg="vcxz";
       int shift=3;
        String cipher="";
        for(int i=0;i<msg.length();i++)
        {
            char c=msg.charAt(i);
            if(c==' ')
            {
               cipher=cipher+' ';    
            }
            else
            {
                c=(char) ((int)c+shift);
                if((int)c>=65 && (int)c<=90 ||  (int)c>=97 && (int)c<=122)
                {
                    cipher=cipher+c;
                }
                else
                {
                    c=(char) ((int)c-26);
                    cipher=cipher+c;
                }
                
        
            }
            System.out.println(cipher);
        }
    }
}
