package funeralHome.coffin;

public class FactoryWoodenCoffin extends Coffin
{
	private static FactoryWoodenCoffin instance;
	
	private FactoryWoodenCoffin()
	{
	}
	
	public static FactoryWoodenCoffin getInstance()
	{
		if(instance == null)
		{
			instance = new FactoryWoodenCoffin();
			instance.setMaterial("Wooden");
		}
		return instance;
	}
}
