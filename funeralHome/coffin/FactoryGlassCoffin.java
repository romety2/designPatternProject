package funeralHome.coffin;

import java.util.ArrayList;

public class FactoryGlassCoffin implements IFactoryCoffin
{
	private static FactoryGlassCoffin instance;
	
	private FactoryGlassCoffin()
	{
	}
	
	public static FactoryGlassCoffin getInstance()
	{
		if(instance == null)
		{
			instance = new FactoryGlassCoffin();
		}
		return instance;
	}
	
	public Coffin makeEmptyCoffin()
	{
		return new GlassCoffin();
	}
	
	public Coffin makeWithOrnamentationsCoffin()
	{
		Coffin coffin = new GlassCoffin();
		ArrayList<String> ornament = new ArrayList<String>();
		ornament.add("ribbons");
		coffin.setOrnamentations(ornament);
		return coffin;
	}
	
	public Coffin makeWithWreathCoffin()
	{
		Coffin coffin = new GlassCoffin();
		coffin.setWreath();
		return coffin;
	}
	
	public Coffin makeDeluxeCoffin()
	{
		Coffin coffin = new GlassCoffin();
		ArrayList<String> ornament = new ArrayList<String>();
		ornament.add("ribbons");
		coffin.setOrnamentations(ornament);
		coffin.setWreath();
		return coffin;
	}
}
