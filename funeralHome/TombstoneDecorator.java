package funeralHome;

public class TombstoneDecorator extends Coffin
{
	Coffin coffin;
	String material = "default";
	static int countCoffin;
	
	public TombstoneDecorator(Coffin c)
	{
		this.coffin = c;
	}
	
	@Override
	void createCoffin()
	{
		coffin.createCoffin();
		countCoffin++;
	}
	
	@Override
	public String getMaterial()
	{
		return material;
	}

	public static int getCountCoffin()
	{
		return countCoffin;
	}

	public static void setLiczbaPaczkow(int ile)
	{
		TombstoneDecorator.countCoffin = ile;
	}
	
	@Override
	public String toString()
	{
		return coffin.toString();
	}	
	
	@Override
	void insertTheCorpse()
	{
		coffin.insertTheCorpse();
	}

	@Override
	public void createObserver(Observer observer)
	{
		coffin.createObserver(observer);
	}
	
	@Override
	public void deleteObserver(Observer observer)
	{
		coffin.deleteObserver(observer);
	}	

	@Override
	public void informObservers()
	{
		coffin.informObservers();
	}
}
