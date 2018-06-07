package funeralHome.gravedigger;

import funeralHome.coffin.Coffin;

public class JuniorGravedigger extends Gravedigger
{
	Gravedigger supervsion;
	
	public JuniorGravedigger()
	{
	}
	
	public JuniorGravedigger(Gravedigger supervision)
	{
		this.supervision = supervision;
	}
	
	public void digGrave(Coffin coffin)
	{
		if(coffin.getSize() <= 1)
		{
			//coœ
		}
		else
		{
			supervision.digGrave(coffin);
		}
	}
}
