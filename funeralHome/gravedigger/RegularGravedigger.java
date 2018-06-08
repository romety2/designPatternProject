package funeralHome.gravedigger;

import funeralHome.order.Order;

public class RegularGravedigger extends Gravedigger
{
	Gravedigger supervsion;
	
	public RegularGravedigger(Gravedigger supervision)
	{
		this.supervision = supervision;
	}
	
	public String digGrave(Order order)
	{
		if(order.getCorpse().getAge() <= 12)
		{
			return "Regular gravedigger dig grave";
		}
		else
		{
			return supervision.digGrave(order);
		}
	}
}
