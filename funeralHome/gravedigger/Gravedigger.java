package funeralHome.gravedigger;

import funeralHome.order.Order;

abstract public class Gravedigger 
{
	protected Gravedigger supervision;
	
	public void setSupervisor(Gravedigger gravedigger)
	{
		supervision = gravedigger;
	}
	
	protected abstract String digGrave(Order order);
}
