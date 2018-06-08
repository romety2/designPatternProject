package funeralHome.coffin;

import funeralHome.container.Container;

public class Coffin extends Container
{
	private Boolean wreath = false;
	
	public void setWreath()
	{
		this.wreath = true;
	}
	
	public void delWreath()
	{
		this.wreath = false;
	}
	
	public Boolean getWreath()
	{
		return this.wreath;
	}
}
