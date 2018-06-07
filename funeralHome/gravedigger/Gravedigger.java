package funeralHome.gravedigger;

import funeralHome.coffin.Coffin;

abstract public class Gravedigger 
{
	protected Gravedigger supervision;
	
	public void setSupervisor(Gravedigger gravedigger)
	{
		supervision = gravedigger;
	}
	
	protected abstract void digGrave(Coffin coffin);
}
