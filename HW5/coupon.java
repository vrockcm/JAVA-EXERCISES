// DHRUV SHETH 110738127
package HW5;
import java.util.*;
public class coupon 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int cnt=1;
		int d=0,h=0,s=0,c=0,i;
		String arr[]=new String[4];
		for(;cnt<10000;)
		{
			 String car=getCard();
			 int len=car.length();
			 int diamonds=car.indexOf("Diamonds");
			 int Hearts=car.indexOf("Hearts");
			 int spades=car.indexOf("Spades");
			 int Clubs=car.indexOf("Clubs");
			 if(d==1 && h==1 && s==1 && c==1)
			 {
				 for(i=0;i<4;i++)
				 {
					 System.out.println(arr[i]);
				 }
				 System.out.println("Number of picks from card deck:"+cnt);
				 break;
			 }
			 if(diamonds>1)
			 {
				 cnt++;
				 d=1;
				 arr[0]=car;
			 }
			 else if(Hearts>1)
			 {
				 cnt++;
				 h=1;
				 arr[1]=car;
			 }
			 else if(spades>1)
			 {
				 cnt++;
				 s=1;
				 arr[2]=car;
			 }
			 else if(Clubs>1)
			 {
				 cnt++;
				 c=1;
				 arr[3]=car;
			 }
			
			}
	   
	  }
	public static String getCard()
	{
		String suit[] = {"Diamonds", "Hearts", "Spades", "Clubs"};
		String faceValue[] = {"2", "3", "4", "5", "6", "7", "8", "9", "Ace",
		                        "King", "Queen", "Jack"};

		Scanner in=new Scanner(System.in);
	    String card="";   

	    	int cardValue = (int) ((Math.random()*12) % 12);  

	    int cardSuite = (int)((Math.random()*4) % 4);  

	    card += faceValue[cardValue]; 

	    card += " of "; 

	    card += suit[cardSuite]; 

	    return card;  
	}
	
}
