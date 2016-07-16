package CLASSWORKINCLASS;


class Person
{
	String name; int age;
	public Person(String str,int n)
	{
		name=str;
		age=n;
	}
	public String toString()
	{
		return name+", age "+age;
		
	}
}
class Student extends Person
{
 	String major;
 	public Student(String n,int a,String m)
 	{
 		super(n,a);
 		major=m;
 	}
 	public String toString()
	{
		return super.toString()+", majoring in "+major;
	}
}
class Employee extends Person
{
	double salary;
	
	public Employee(String n,int a,double s)
	{
		super(n,a);
		salary=s;
	}
	
	public String toString()
	{
		return super.toString()+" and salary: $"+salary;
		
	}
}
class Boss extends Employee
{
	public Boss(String n,int a, double s)
	{
		super(n,a,s);
	}
	public String toString()
	{
		return super.toString()+", calling the shots";
		
	}
}
	
public class PolymorphicPeople 
{
	public static void main(String args[])
	{
		Person[] people=new Person[5];
		people[0]=new Person("John Smith",35);
		people[1]=new Employee("Mary Jones",22,16.00);
		people[2]=new Student("Robert Diggle",18,"Computer Science");
		people[3]=new Boss("DIGGS JOHNSON",27,100.00);
		people[4]=new Person("PETER MAHUN",19);
		
		for(Person p:people)
		{
			System.out.println(p);
		}
	}
}
		
	
