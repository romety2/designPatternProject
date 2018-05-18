package funeralHome;

public class CoffinGlass extends Coffin
{

	FuneralHomeFactory factory;
	Observable observable;
	 
	public CoffinGlass(FuneralHomeFactory f)
	{
		this.factory = f;
		observable = new Observable(this);
	}
	
	@Override
	void create()
	{
		// System.out.println("The glass coffin is ready");
		wreath = factory.create();
	}	
	
	@Override
	public void insertTheCorpse()
	{
		// System.out.println("The glass  coffin ready for the funeral");
		informObservers();
	}
	
	@Override
	public String toString()
	{
		return "The glass coffin with a wreath of color " + wreath;
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
