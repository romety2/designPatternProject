package funeralHome;

public class WreathJoyfulFactory implements WreathFactory
{
	private static WreathJoyfulFactory instance;
	
	private WreathJoyfulFactory()
	{
	}
	
	public static WreathJoyfulFactory getInstance()
	{
		if(instance == null)
		{
			instance = new WreathJoyfulFactory();
		}
		return instance;
	}
	
	@Override
	public Wreath create()
	{
		return new WreathBlackWhite();
	}
}