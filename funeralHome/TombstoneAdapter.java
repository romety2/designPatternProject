package funeralHome;

public class TombstoneAdapter extends Coffin {

	Tombstone tombstone;
	Observable observable;
	
	public TombstoneAdapter(Tombstone t)
	{
		this.tombstone = t;
		observable = new Observable(this);
	}
	
	@Override
	void create()
	{
		tombstone.create();
		informObservers();
	}

	@Override
	public String toString()
	{
		return "A coffin was constructed but not a tombstone";
	}
	
	@Override
	void insertTheCorpse()
	{
	}

	@Override
	public void createObserver(Observer ob)
	{
		observable.createObserver(ob);
	}

	@Override
	public void deleteObserver(Observer ob)
	{
		observable.deleteObserver(ob);
	}	
	
	@Override
	public void informObservers()
	{
		observable.informObservers();
	}
}
