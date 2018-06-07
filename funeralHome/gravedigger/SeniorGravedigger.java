package funeralHome.gravedigger;

import funeralHome.coffin.Coffin;

public class SeniorGravedigger extends Gravedigger
{
	Gravedigger supervsion;
	
	public SeniorGravedigger()
	{
	}
	
	public SeniorGravedigger(Gravedigger supervision)
	{
		this.supervision = supervision;
	}
	
	public void digGrave(Coffin coffin)
	{
		if(coffin.getSize() <= 50)
		{
			//coœ
		}
		else
		{
			supervision.digGrave(coffin);
		}
	}
}
