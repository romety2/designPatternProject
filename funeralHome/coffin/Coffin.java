package funeralHome.coffin;

import java.util.ArrayList;

abstract public class Coffin implements ICoffin
{
	private String material = null;
	private ArrayList<String> ornamentations = new ArrayList<String>();
	private Boolean wreath = false;
	
	protected void setMaterial(String material)
	{
		this.material = material;
	}
	
	public void setOrnamentations(ArrayList<String> ornamentations)
	{
		this.ornamentations = ornamentations;
	}
	
	public void addOrnamentation(String ornamentation)
	{
		this.ornamentations.add(ornamentation);
	}
	
	public void setWreath()
	{
		this.wreath = true;
	}
	
	public void delWreath()
	{
		this.wreath = false;
	}
	
	public String getMaterial()
	{
		return this.material;
	}
	
	public ArrayList<String> getOrnamentations()
	{
		return this.ornamentations;
	}
	
	public Boolean getWreath()
	{
		return this.wreath;
	}

}
