package funeralHome;

public abstract class CoffinObservable
{
	public abstract void createObserver(Observer ob);
	public abstract void deleteObserver(Observer ob);
	public abstract void informObservers();
}
