package funeralHome;

abstract class Coffin 
{
	private String material = null;
	//private ornamentation = null;
	//private wreath = null;
	
	void setMaterial(String material)
	{
		this.material = material;
	}
	
	String getMaterial()
	{
		return this.material;
	}

}
