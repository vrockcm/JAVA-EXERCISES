package LAB14;
import java.util.*;
public class StackOfObjects 
{
	Object elements[];
	private int size;
	private int topIndex;

		public StackOfObjects()
		{
			elements=new Object[2];
			size=2;
			topIndex=-1;
		}
		public void push(Object ob1)
		{
			if(topIndex==size-1)
			{
				Object temp[]=new Object[size*2];
				for(int i=0;i<size;i++)
				{
					temp[i]=elements[i];
				}
				elements=temp;
				size=size*2;
			}
			elements[topIndex+1]=ob1;
			topIndex++;
			
		}
		public Object pop()
		{
			
			topIndex--;
			return elements[topIndex+1];
		}
		public int getsize()
		{
			return size;
		}
		
		public static void main(String args[])
		{
			StackOfObjects ob2=new StackOfObjects();

			ob2.push("Hi");
			ob2.push("Hello");
			ob2.push("bye");
			ob2.push("you");
			ob2.push("me");
			System.out.println("TopIndex Pop-ed: "+ob2.pop());
			System.out.println(ob2.getsize());
			
			
		}
	
	
	
	
	
}
