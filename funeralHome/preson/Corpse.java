package funeralHome.preson;

public class Corpse extends Person
{
	private int age;
	
	public Corpse(String firstName, String lastName, int age)
	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.age = age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return this.age;
	}
}
