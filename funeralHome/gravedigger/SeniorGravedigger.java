package funeralHome.gravedigger;

import funeralHome.order.Order;

public class SeniorGravedigger extends Gravedigger
{
	Gravedigger supervsion;
	
	public SeniorGravedigger(Gravedigger supervision)
	{
		this.supervision = supervision;
	}
	
	public String digGrave(Order order)
	{
			return "Senior gravedigger dig grave";
	}
}
