package funeralHome;

public class WreathJoyfulFactory implements WreathFactory {

	@Override
	public Wreath create()
	{
		return new WreathBlackWhite();
	}
}