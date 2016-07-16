package CLASSWORKINCLASS;

public class MammalDriver
{
	public static void main(String args[])
	{
		process(new Cat());
	}
	public static void process(Mammal m)
	{
		m.behave();
		m.makeSound();
	}

}
