package funeralHome;

public class CoffinWooden extends Coffin
{

	WreathFactory wreathFactory;
	Observable observable;
	String material = null;
	 
	public CoffinWooden(WreathFactory wf)
	{
		this.wreathFactory = wf;
		this.material = "wooden";
		observable = new Observable(this);
	}
	
	@Override
	void createCoffin()
	{
		// System.out.println("The wooden coffin is ready");
		wreath = wreathFactory.create();
	}	
	
	@Override
	public String getMaterial()
	{
		return material;
	}
	
	@Override
	public void insertTheCorpse()
	{
		// System.out.println("The wooden coffin ready for the funeral");
		informObservers();
	}
	
	@Override
	public String toString()
	{
		return "The " + material + " coffin with a wreath of color " + wreath;
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
