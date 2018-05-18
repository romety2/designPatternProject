package funeralHome;

public class CoffinWooden extends Coffin
{

	FuneralHomeFactory factory;
	Observable observable;
	 
	public CoffinWooden(FuneralHomeFactory f)
	{
		this.factory = f;
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
	public void deleteObserver(Observer ob)
	{
		observable.deleteObserver(ob);
	}	

	@Override
	public void informObservers()
	{
		observable.informObservers();
	}
}
