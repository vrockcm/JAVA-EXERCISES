public class MonsterDriver 
{	
	public static void main(String args[])
	{
		Monster m1=new Monster(5,10,3);
		m1.takeDamage(3);		
		m1.takeDamage(3);
		LootMonster lm1=new LootMonster("Vonpal Spord +1",3,10,5);		
		lm1.takeDamage(3);
	}

}
