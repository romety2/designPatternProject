package funeralHome;

public class Gravedigger implements Observer
{
	
	@Override
	public void update(CoffinObservable cob)
	{
		//System.out.println("The hole is excavated, the corpse " + cob + " can be buried.");
	}

	public String toString()
	{
		return "Gravedigger";
	}
}
