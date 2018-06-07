package funeralHome.service;

public class FuneralService
{
	GravediggerService graveDriggerService = GravediggerService();
	public void makeFuneral(Order order)
	{
		//
		boolean dig = graveDriggerService.handleDigging(order.getCoffin());
		if(dig)
		{
			//
		}
		//
	}
	
}
