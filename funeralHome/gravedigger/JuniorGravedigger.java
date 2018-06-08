package funeralHome.gravedigger;

import funeralHome.order.Order;

public class JuniorGravedigger extends Gravedigger
{
	Gravedigger supervsion;
	
	public JuniorGravedigger(Gravedigger supervision)
	{
		this.supervision = supervision;
	}
	
	public String digGrave(Order order)
	{
		if(order.getCorpse().getAge() <= 4)
		{
			return "Junior gravedigger dig grave";
		}
		else
		{
			return supervision.digGrave(order);
		}
	}
}
