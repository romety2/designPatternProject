package funeralHome;

public abstract class Coffin extends CoffinObservable
{	
	Wreath wreath;
	
	abstract void create();
				
	abstract void insertTheCorpse();
}
