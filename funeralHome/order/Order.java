package funeralHome.order;

import funeralHome.coffin.Coffin;
import funeralHome.preson.Client;
import funeralHome.preson.Corpse;

public class Order
{
	private Client client;
	private Corpse corpse;
	private Coffin coffin;
	
	public void setClient(Client client)
	{
		this.client = client;
	}
	
	public void setCorpse(Corpse corpse)
	{
		this.corpse = corpse;
	}
	
	public void setCoffin(Coffin coffin)
	{
		this.coffin = coffin;
	}
	
	public Client getClient()
	{
		return this.client;
	}
	
	public Corpse getCorpse()
	{
		return this.corpse;
	}
	
	public Coffin getCoffin()
	{
		return this.coffin;
	}
}
