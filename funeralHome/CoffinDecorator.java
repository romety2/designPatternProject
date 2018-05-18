package funeralHome;

public class CoffinDecorator extends Coffin {

	Coffin coffin;
	static int countCoffin;
	
	public CoffinDecorator(Coffin c)
	{
		this.coffin = c;
	}
	
	@Override
	void create()
	{
		coffin.create();
		countCoffin++;
	}

	public static int getCountCoffin()
	{
		return countCoffin;
	}

	public static void setCountCoffin(int quant)
	{
		CoffinDecorator.countCoffin = quant;
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
	public void createObserver(Observer ob)
	{
		coffin.createObserver(ob);
	}
	
	@Override
	public void deleteObserver(Observer ob)
	{
		coffin.deleteObserver(ob);
	}	

	@Override
	public void informObservers()
	{
		coffin.informObservers();
	}
}
