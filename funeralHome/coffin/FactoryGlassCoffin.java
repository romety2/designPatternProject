package funeralHome;

public class FactoryGlassCoffin extends Coffin 
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
			instance.setMaterial("Glass");
		}
		return instance;
	}
}
