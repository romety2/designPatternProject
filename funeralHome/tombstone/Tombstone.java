package funeralHome.tombstone;

import funeralHome.coffin.Coffin;
import funeralHome.coffin.GlassCoffin;
import funeralHome.coffin.WoodenCoffin;

public class Tombstone
{
	private String material = null;
	private Coffin coffin = null;
	private String epitaphium = "";
	
	public Tombstone(Coffin coffin)
	{
		this.material = "Stone";
		this.coffin = coffin;
	}

	public void setCoffin(Coffin coffin)
	{
		this.coffin = coffin;
	}
	
	public void setEpitaphium(String epitaphium)
	{
		this.epitaphium = epitaphium;
	}
	
	public String getMaterial()
	{
		return this.material;
	}
	
	public Coffin getCoffin()
	{
		return this.coffin;
	}
	
	public String getEpitaphium()
	{
		return this.epitaphium;
	}
}
