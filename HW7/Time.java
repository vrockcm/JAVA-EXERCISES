// Dhruv Sheth    110738127 
import java.util.Calendar;

public class Time 
{
	private int hour;
	private int minute;
	private int second;
	

public Time()
{


  Calendar cal = Calendar.getInstance();


  hour = cal.get(Calendar.HOUR_OF_DAY);


  minute = cal.get(Calendar.MINUTE);


  second = cal.get(Calendar.SECOND);


}
public Time(long elapsedTime)
{
	second= (int)elapsedTime / 1000;



	minute=second / 60;



	hour=minute / 60;

}
public Time(int hour,int minute,int second)
{
	this.hour=hour;
	this.minute=minute;
	this.second=second;
	
}
public int getHour()
{
	return hour;
}
public int getMinute()
{
	return minute;	
}
public int getSec()
{
	return second;
}
public void setTime(long elapseTime)
{
    Calendar c=Calendar.getInstance();
    c.setTimeInMillis(elapseTime);
    hour=c.get(Calendar.HOUR_OF_DAY);
    minute=c.get(Calendar.MINUTE);
    second=c.get(Calendar.SECOND);
 }
public static void main(String args[])
{
	Time ob1=new Time();
	Time ob2=new Time(555550000);
	int h1=ob1.getHour();
	int h2=ob2.getHour();
	int m1=ob1.getMinute();
	int m2=ob2.getMinute();
	int s1=ob1.getSec();
	int s2=ob2.getSec();
	System.out.println("Hour in Object 1:  "+h1);
	System.out.println("Minute in Object 1:  "+m1);
	System.out.println("Second in Object 1:  "+s1);
	System.out.println("Hour in Object 2:  "+h2);
	System.out.println("Minute in Object 2:  "+m2);
	System.out.println("Second in Object 2:  "+s2);
	
	
}


}
