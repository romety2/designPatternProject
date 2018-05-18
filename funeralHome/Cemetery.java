package funeralHome;

import java.util.ArrayList;

public class Cemetery extends Coffin
{
	ArrayList<Coffin> orders = new ArrayList();
	
	public void addOrder(Coffin c)
	{
		orders.add(c);
	}
	
	@Override
	public void create()
	{
		for(Coffin or : orders)
		{
			Coffin c = or;
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
		for(Coffin or : orders)
		{
			Coffin c = or;
			c.createObserver(ob);
		}
	}
	
	@Override
	public void deleteObserver(Observer ob)
	{
		for(Coffin or : orders)
		{
			Coffin c = or;
			c.deleteObserver(ob);
		}
	}	

	@Override
	public void informObservers()
	{
	}	
}
