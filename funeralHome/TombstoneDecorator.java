package funeralHome;

public class TombstoneDecorator extends Coffin
{
	Coffin coffin;
	static int countCoffin;
	
	public TombstoneDecorator(Coffin c) {
		this.coffin = c;
	}
	
	@Override
	void create()
	{
		coffin.create();
		countCoffin++;
	}

	public static int getLiczbaPaczkow()
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
