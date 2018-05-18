package funeralHome;

public class FuneralHomeJoyfulFactory implements FuneralHomeFactory {

	@Override
	public Wreath create()
	{
		return new WreathBlackWhite();
	}
}