package funeralHome;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable extends CoffinObservable
{
	ArrayList observers = new ArrayList();
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
		if(i >= 0) {
			observers.remove(i);
		}
	}
	
	@Override
	public void informObservers()
	{
		Iterator iterator = observers.iterator();
		while (iterator.hasNext())
		{
			Observer observer = (Observer)iterator.next();
			observer.update(coffin);
		}
	}
	
	public Iterator getObservers()
	{
		return observers.iterator();
	}	
}
