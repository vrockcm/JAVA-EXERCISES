
public class LootMonster extends Monster 
{	
	String TypeOfLoot;
	
	public LootMonster(String loot,int h,int x,int m)
	{
		
		super(h,x,m);
		TypeOfLoot=loot;
	}
	
	//Override inherited method by redefining
	public void takeDamage(int dmg)
	{
		//Let the superclass version of the method execute
		super.takeDamage(dmg);
		//Add subclass-specific behavior
		if(hitpoints<1)
		{
			System.out.println("Here, have a "+TypeOfLoot);
		}
	}
	
}
