package funeralHome;

public class FuneralHomeMournfulFactory implements FuneralHomeFactory
{
	@Override
	public Wreath create()
	{
		return new WreathColorful();
	}
}