package funeralHome;

public abstract class FuneralHome
{	
	protected abstract Coffin createCoffin(String i);
 
	public Coffin orderCoffin(String type)
	{
		Coffin c = createCoffin(type);

		c.createCoffin();
		c.insertTheCorpse();
		
		return c;
	}
}
