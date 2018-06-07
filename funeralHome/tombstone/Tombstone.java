package funeralHome.tombstone;

import funeralHome.coffin.Coffin;

public abstract class Tombstone extends Coffin
{
	private String epitaphium = "";
	
	
	public void setEpitaphium(String epitaphium)
	{
		this.epitaphium = epitaphium;
	}
	
	public String getEpitaphium()
	{
		return this.epitaphium;
	}
}
