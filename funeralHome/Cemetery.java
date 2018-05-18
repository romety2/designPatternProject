package funeralHome;

import java.util.ArrayList;
import java.util.Iterator;

public class Cemetery extends Coffin
{
	ArrayList<Coffin> orders = new ArrayList<Coffin>();
	
	public void addOrder(Coffin c)
	{
		orders.add(c);
	}
	
	@Override
	public void create()
	{
		Iterator<Coffin> it = orders.iterator();
		while (it.hasNext())
		{
			Coffin c = (Coffin)it.next();;
			c.create();
		}
	}

	@Override
	public String toString()
	{
		return "Cementery";
	}

	@Override
	void insertTheCorpse()
	{
	}

	@Override
	public void createObserver(Observer ob)
	{
		Iterator<Coffin> it = orders.iterator();
		while (it.hasNext())
		{
			Coffin c = (Coffin)it.next();;
			c.createObserver(ob);
		}
	}
	
	@Override
	public void deleteObserver(Observer ob)
	{
		Iterator<Coffin> it = orders.iterator();
		while (it.hasNext())
		{
			Coffin c = (Coffin)it.next();;
			c.deleteObserver(ob);
		}
	}	

	@Override
	public void informObservers()
	{
	}	
}
