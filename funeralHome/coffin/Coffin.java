package funeralHome.coffin;

import java.util.ArrayList;

abstract public class Coffin 
{
	private String material = null;
	private ArrayList<String> ornamentation = new ArrayList<String>();
	private Boolean wreath = false;
	
	public void setMaterial(String material)
	{
		this.material = material;
	}
	
	public void setOrnamentation(ArrayList<String> ornamentation)
	{
		this.ornamentation = ornamentation;
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
	
	public ArrayList<String> getOrnamentation()
	{
		return this.ornamentation;
	}
	
	public Boolean getWreath()
	{
		return this.wreath;
	}

}
