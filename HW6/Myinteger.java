//DHURV SHETH 110738127

class MyInteger 
{

    int value;

    MyInteger(int newValue) 
    {
        value = newValue;
    }

    public int get() 
    {
        return value;
    }

    public static boolean isEven(int n) 
    {
        if(n % 2 == 0)
        return true;
        else
        return false;
    }

    public static boolean isOdd(int n)
    {
    	if(n % 2 == 0)
        return false;
        else
        return true;
    }

    public static boolean isPrime(int n) 
    {
    	int cnt=0;
        for (int i= 1; i<=n ; i++) 
        {
            if (n % i == 0) 
            {
                cnt++;
            }
        }
        if(cnt==2)
        return true;
        else
        return false;
    }

    public static boolean isEven(MyInteger n) 
    {
        return n.isEven();
    }

    public static boolean isOdd(MyInteger n) 
    {
        return n.isOdd();
    }

    public static boolean isPrime(MyInteger n) 
    {
        return n.isPrime();
    }

    public boolean isEven() 
    {
        return isEven(value);
    }

    public boolean isOdd() 
    {
        return isOdd(value);
    }

    public boolean isPrime() 
    {
        return isPrime(value);
    }

    public boolean equals(int n) 
    {
    	if(value==n)
        return true;
    	else
        return false;
    }

    public boolean equals(MyInteger n) 
    {
        return equals(n.get());
    }

    public static int parseInt(String s) 
    {
    	 	int i=0,flag=0;   
    	 	double num=0;
    	    if(s.charAt(0) == '-')
    	    {
    	       flag = 1;
    	       i = 1; 
    	    }
    	       
    	    for(;i<s.length();i++)
    	    {
    	      char digit = s.charAt(i);
    	      num=num+ Math.pow(10, s.length()-i-1)*(digit-48);
    	    }
    	    if(flag==1)
    	       return -(int)num;
    	    else
    	       return (int)num;
    }
}


