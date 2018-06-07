package funeralHome.coffin;

import java.util.ArrayList;

public class FactoryWoodenCoffin implements IFactoryCoffin
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
		}
		return instance;
	}
	
	public Coffin makeEmptyCoffin()
	{
		return new WoodenCoffin();
	}
	
	public Coffin makeWithOrnamentationsCoffin()
	{
		Coffin coffin = new WoodenCoffin();
		ArrayList<String> ornament = new ArrayList<String>();
		ornament.add("flowers");
		coffin.setOrnamentations(ornament);
		return coffin;
	}
	
	public Coffin makeWithWreathCoffin()
	{
		Coffin coffin = new WoodenCoffin();
		coffin.setWreath();
		return coffin;
	}
	
	public Coffin makeDeluxeCoffin()
	{
		Coffin coffin = new WoodenCoffin();
		ArrayList<String> ornament = new ArrayList<String>();
		ornament.add("flowers");
		coffin.setOrnamentations(ornament);
		coffin.setWreath();
		return coffin;
	}
}
