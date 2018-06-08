package funeralHome.container;

import java.util.ArrayList;

abstract public class Container implements IContainer
{
	private String material = null;
	private ArrayList<String> ornamentations = new ArrayList<String>();
	
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
	
	public String getMaterial()
	{
		return this.material;
	}
	
	public ArrayList<String> getOrnamentations()
	{
		return this.ornamentations;
	}
}