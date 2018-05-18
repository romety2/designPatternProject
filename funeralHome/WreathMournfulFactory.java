package funeralHome;

public class WreathMournfulFactory implements WreathFactory
{
	@Override
	public Wreath create()
	{
		return new WreathColorful();
	}
}