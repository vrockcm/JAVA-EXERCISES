package CLASSWORKINCLASS;
//Abstract classes cannot be directly instantiated
public abstract class Mammal 
{
	private boolean hasTail;
	private int age;
	public Mammal(boolean ht)
	{
		age=0;
		hasTail=ht;
	}
	public abstract void behave();
	public abstract void makeSound();

}
