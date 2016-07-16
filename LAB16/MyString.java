package LAB16;

public class MyString 
{
	private char chars[];
	public MyString(char chars[])
	{
		this.chars = new char[chars.length]; 
		for(int i=0;i<chars.length;i++)
		{
			this.chars[i]=chars[i];
		}
	}
	public String toString()
	{ 	
		String str="";
		for(int i=0;i<chars.length;i++)
		{
			str=str+chars[i];
		}
		return str;
	}
	public char charAt(int index)
	{
		return chars[index];
	}
	public int length()
	{
		return chars.length;
	}
	public MyString substring(int begin,int end)
	{
		char res[]=new char[end-begin];
		for(int i=0;i<res.length;i++)
		{
			res[i]=chars[begin+i];
		}
		return new MyString(res);
		
	}
	public MyString toLowerCase()
	{
		char index[]=new char[length()];
		for(int i=0;i<length();i++)
		{
			index[i]=Character.toLowerCase(chars[i]);
		}
		return new MyString(index);
	}
	public boolean equals(MyString s)
	{
		if(this==s)
		{
			return true;
		}
		if(this.length() != s.length()) 
		{ 
			return false; 
		} 
		for(int i = 0; i < length(); i++)
		{ 
			if(this.charAt(i) != s.charAt(i)) 
			{ 
			return false; 
			} 
		} 
			return true; 
	} 
	public static MyString valueOf(int i)
	{ 
		return new MyString(new char[]{(char)i}); 
	} 
	public static void main(String args[])
	{
		MyString ob1=new MyString(new char[]{'V','a','P','e'});
		System.out.println(ob1.charAt(2));
		
		System.out.println(ob1.toLowerCase());
		MyString ob2=new MyString(new char[]{'B','A','D'});
		if(ob1.equals(ob2)) 
		{ 
			System.out.println("both are same"); 
		} 
		else 
		{ 
			System.out.println("not equal"); 
		} 
	}
	
	
	

}

