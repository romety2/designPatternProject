package funeralHome.preson;

public class Corpse extends Person
{
	private int age;
	private int growth;
	
	public Corpse(String firstName, String lastName, int age, int growth)
	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.age = age;
		this.growth = growth;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setGrowth(int growth)
	{
		this.growth = growth;
	}
	
	public int getGrowth()
	{
		return this.growth;
	}
	
	public void Burn()
	{
		this.growth = 0;
	}
}
