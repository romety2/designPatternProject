package funeralHome;

public class Gravedigger implements Observer
{
	
	@Override
	public void update(CoffinObservable cob)
	{
		System.out.print("The hole is excavated, the corpse can be buried.");
	}

	public String toString()
	{
		return "Gravedigger";
	}
}
