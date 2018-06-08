package funeralHome.service;

import funeralHome.order.Order;

public class FuneralService
{
	GravediggerService graveDriggerService = GravediggerService();
	public void makeFuneral(Order order)
	{
		//
		boolean dig = graveDriggerService.handleDigging(order.getCorpse());
		if(dig)
		{
			//
		}
		//
	}
	
}
