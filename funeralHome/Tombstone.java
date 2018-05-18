package funeralHome;

public class Tombstone
{
	WreathFactory factory;
	 
	public Tombstone(WreathFactory f)
	{
		this.factory = f;
	}
	
	void insertTheCorpse()
	{
	}
	
	public void createTombstone()
	{
		//System.out.println("A tombstone was constructed");
		createWreath();
	}
	
	void createWreath()
	{
		//System.out.println("A wreath was constructed");
	}
	
	@Override
	public String toString()
	{
		return "Tombstone";
	}	
}
