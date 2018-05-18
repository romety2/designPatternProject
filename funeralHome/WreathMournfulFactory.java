package funeralHome;

public class WreathMournfulFactory implements WreathFactory
{
	
	private static WreathMournfulFactory instance;
	
	private WreathMournfulFactory()
	{
	}
	
	public static WreathMournfulFactory getInstance()
	{
		if(instance == null)
		{
			instance = new WreathMournfulFactory();
		}
		return instance;
	}
	
	@Override
	public Wreath create()
	{
		return new WreathColorful();
	}
}