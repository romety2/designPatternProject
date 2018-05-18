package funeralHome;

public abstract class Coffin extends CoffinObservable
{	
	Wreath wreath;
	
	String material;
	
	abstract void createCoffin();
				
	abstract void insertTheCorpse();
	
	public abstract String getMaterial();
}
