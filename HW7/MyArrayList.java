// Dhruv Sheth    110738127 
import java.util.*;
import java.lang.Object;
public class MyArrayList 
{
	private Object arr[];
	private Object arr1[];
	private int cnt=0;
	public MyArrayList()
	{
		arr=new Object[5];
	}
	public void add(Object x)
	{
		if(cnt==arr.length)
		{
			arr1=new Object[arr.length*2];
			for(int i=0;i<arr.length;i++)
			{
				arr1[i]=arr[i];
			}
			arr=arr1;
		}
		arr[cnt]=x;
		cnt++;
		}

	public void add(int in,Object x)
		{
			Object temp1[]=new Object[arr.length];
			
			for(int i=0;i<arr.length;i++)
			{
				temp1[i]=arr[i];
			}
			arr1[in]=x;
			for(int j=in+1;j<arr.length;j++)
			{
				arr[j]=temp1[j-1];
			}
		}
		 
	public void clear()
	{
		Arrays.fill(arr, null);
	}
	public boolean contains(Object x)
	{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==x)
				{
					return true;
				}
			}
			return false;
		}
	public Object get(int index)
	{
		return arr[index];
	}
	public int indexOf(Object y)
	{
		int j=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==y)
				{
					j=i;
				}
			}
			return j;
		}

	public boolean isEmpty()
	{
		if (arr == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int lastIndexOf(Object x)
	{
		int j=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==x)
				{
					j=i;
				}
			}
			return j;
		}
	public boolean remove(Object x)
	{
		int i;
		for(i=0;i<arr.length;)
		{
			
				if(arr[i]==x)
				{
					arr[i]=null;
					return (true);
				}
				
		}
		
			return (false);
	}
	
	public int size()
	{
		return arr.length;
	}
	public Object remove(int in)
	{
			
			{
				Object temp=arr[in];
				arr[in]=null;
				return temp;
			}
	}
	public Object set(int i,Object x)
	{
		{
			Object temp=arr[i];
			arr[i]=x;
			return temp;
		}
	}
	public void stringto()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("index:"+i+"  "+arr[i]);
		}
	}
	public static void main(String args[])
	{
		MyArrayList ob1=new MyArrayList();
		MyArrayList ob2=new MyArrayList();
		MyArrayList ob3=new MyArrayList();
		MyArrayList ob4=new MyArrayList();
		MyArrayList ob5=new MyArrayList();
		MyArrayList ob6=new MyArrayList();
		MyArrayList ob7=new MyArrayList();
		MyArrayList ob8=new MyArrayList();
		ob1.add(ob2);
		ob1.add(ob3);
		ob1.add(ob4);
		ob1.add(ob5);
		ob1.add(ob6);
		ob1.add(ob7);
		ob1.add(2,ob8);
		ob1.stringto();
		System.out.println(ob1.contains(ob4));
	}
	
}

