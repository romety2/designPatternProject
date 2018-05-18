package funeralHome;

public class CoffinStone extends Coffin
{

	WreathFactory wreathFactory;
	Observable observable;
	String material = null;
	
	public CoffinStone(WreathFactory wf)
	{
		this.wreathFactory = wf;
		this.material = "stone";
		observable = new Observable(this);
	}
	
	@Override
	void createCoffin()
	{
		// System.out.println("The stone coffin is ready");
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
		// System.out.println("The stone coffin ready for the funeral");
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
