package funeralHome.gravedigger;

abstract public class Gravedigger 
{
	protected Gravedigger supervision;
	
	public void setSupervisor(Gravedigger gravedigger)
	{
		supervision = gravedigger;
	}
}
