package funeralHome;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable extends CoffinObservable
{
	ArrayList<Observer> observers = new ArrayList<Observer>();
	CoffinObservable coffin;
	
	public Observable(CoffinObservable cob)
	{
		this.coffin = cob;
	}
	
	@Override
	public void createObserver(Observer ob)
	{
		observers.add(ob);
	}
	
	@Override
	public void deleteObserver(Observer ob)
	{
		int i = observers.indexOf(ob);
		if(i >= 0)
			observers.remove(i);
	}
	
	@Override
	public void informObservers()
	{
		Iterator<Observer> it = observers.iterator();
		while (it.hasNext())
		{
			Observer ob = (Observer)it.next();
			ob.update(coffin);
		}
	}
	
	public Iterator<Observer> getObservers()
	{
		return observers.iterator();
	}	
}
