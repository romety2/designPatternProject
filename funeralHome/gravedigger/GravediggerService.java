package funeralHome.gravedigger;

import funeralHome.order.Order;

public class GravediggerService
{
	JuniorGravedigger junior = null;
	RegularGravedigger regular = null;
	SeniorGravedigger senior = null;
	
	public GravediggerService()
	{
		senior = new SeniorGravedigger(null);
		regular = new RegularGravedigger(senior);
		junior = new JuniorGravedigger(regular);
	}
	
	public String handleDigging(Order order)
	{
		return junior.digGrave(order);
	}
}
