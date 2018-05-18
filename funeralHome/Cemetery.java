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
	public void createCoffin()
	{
		Iterator<Coffin> it = orders.iterator();
		while (it.hasNext())
		{
			Coffin c = (Coffin)it.next();;
			c.createCoffin();
		}
	}

	@Override
	public String toString()
	{
		return "Cementery";
	}
	
	@Override
	public String getMaterial()
	{
		return "cementry";
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
