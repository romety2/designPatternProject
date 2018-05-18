package funeralHome;

public class CoffinStone extends Coffin
{

	FuneralHomeFactory factory;
	Observable observable;
	
	public CoffinStone(FuneralHomeFactory factory)
	{
		this.factory = factory;
		observable = new Observable(this);
	}
	
	@Override
	void create()
	{
		wreath = factory.create();
	}	
	
	@Override
	public void insertTheCorpse()
	{
		System.out.println("The coffin is ready");
		informObservers();
	}
	
	@Override
	public String toString()
	{
		return "The coffin with a wreath of color " + wreath;
	}	
	
	@Override
	public void createObserver(Observer ob)
	{
		observable.createObserver(ob);
	}
	
	@Override
	public void deleteObserver(Observer observer)
	{
		observable.deleteObserver(observer);
	}	

	@Override
	public void informObservers()
	{
		observable.informObservers();
	}	
}
