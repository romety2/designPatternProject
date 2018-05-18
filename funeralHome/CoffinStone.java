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
		// System.out.println("The stone coffin is ready");
		wreath = factory.create();
	}	
	
	@Override
	public void insertTheCorpse()
	{
		// System.out.println("The stone coffin ready for the funeral");
		informObservers();
	}
	
	@Override
	public String toString()
	{
		return "The stone coffin with a wreath of color " + wreath;
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
