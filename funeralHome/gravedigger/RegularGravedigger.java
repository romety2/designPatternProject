package funeralHome.gravedigger;

import funeralHome.coffin.Coffin;

public class RegularGravedigger extends Gravedigger
{
	Gravedigger supervsion;
	
	public RegularGravedigger()
	{
	}
	
	public RegularGravedigger(Gravedigger supervision)
	{
		this.supervision = supervision;
	}
	
	public void digGrave(Coffin coffin)
	{
		if(coffin.getSize() <= 10)
		{
			//coœ
		}
		else
		{
			supervision.digGrave(coffin);
		}
	}
}
