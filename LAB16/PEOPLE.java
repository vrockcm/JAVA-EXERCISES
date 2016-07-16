package LAB16;

public class PEOPLE 
{
	public static void main(String args[])
	{
		Person[] people=new Person[3];
		people[0]=new Student("Dhruv Sheth","A11B Whitman College","5165122859","vrockcm@gmail.com",19,"Freshman");
		people[1]=new Faculty("John Doe","HighLine Apts","5165128989","johndoe@gmail.com",27,"BANK OF AMERICA BRANCH #2",200,"03/21/04","2100 hrs Monday","BANK MANAGER");
		people[2]=new Staff("Orlando Diggle","LOWKEY Apts","516512356","mrorlando@gmail.com",24,"Computer Science ROOM 319",19,"01/20/14","Tech Maintenance");
		for(Person p:people)
		{
			System.out.println(p);
		}
	}
}
class Person
{
	String name; 
	String add;
	String phone;
	String email;
	int age;
	public Person(String n,String a,String ph,String e,int ag)
	{
		name=n;
		add=a;
		phone=ph;
		email=e;
		age=ag;
	}
	public String toString()
	{
		return name+"\naddress:"+add+"\nphone:"+phone +"\nemail:"+email+"\nage:"+age;	
	}
}
class Employee extends Person
{
	String office; 
	long salary;
	String date;
	public Employee(String n,String a,String ph,String e,int ag,String off,long money,String d)
	{
		super(n,a,ph,e,ag);
		office=off; 
		salary=money;
		date=d;
	}
	public String toString()
	{
		return super.toString()+"\noffice:"+office+"\nsalary $"+salary+"\ndate hired:"+date;
	}
}
class Student extends Person
{
 	String classs;
 	public Student(String n,String a,String ph,String e,int ag,String status)
 	{
 		super(n,a,ph,e,ag);
 		classs=status;
 	}
 	public String toString()
	{
		return super.toString()+"     he/she is a "+classs+"\n";
	}
}
class Faculty extends Employee
{
	String hours;
	String rank;
	public Faculty(String n,String a,String ph,String e,int ag,String off,long money,String d,String h,String ran)
	{
		super(n,a,ph,e,ag,off,money,d);
		hours=h;
		rank=ran;	
	}
	public String toString()
	{
		return super.toString()+",\nHis/her Office Hours:"+hours+"\nhis rank is "+rank+"\n";
	}
}
class Staff extends Employee
{
	String title;
	public Staff(String n,String a,String ph,String e,int ag,String off,long money,String d,String h)
	{
		super(n,a,ph,e,ag,off,money,d);
		title=h;	
	}
	public String toString()
	{
		return super.toString()+",\nHis/her title:"+title;
	}
}

