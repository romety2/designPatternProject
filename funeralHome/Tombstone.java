package funeralHome;

public class Tombstone
{
	FuneralHomeFactory factory;
	 
	public Tombstone(FuneralHomeFactory f)
	{
		this.factory = f;
	}
	
	void przygotuj()
	{
	}	
	
	public void create()
	{
		System.out.println("A tombstone was constructed");
	}
	
	@Override
	public String toString()
	{
		return "Tombstone";
	}	
}
