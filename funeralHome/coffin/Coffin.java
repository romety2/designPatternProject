package funeralHome.coffin;

abstract class Coffin 
{
	private String material = null;
	
	protected void setMaterial(String material)
	{
		this.material = material;
	}
	
	String getMaterial()
	{
		return this.material;
	}

}
