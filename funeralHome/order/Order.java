package funeralHome.order;

import funeralHome.container.Container;
import funeralHome.preson.Client;
import funeralHome.preson.Corpse;

public class Order
{
	private Client client = null;
	private Corpse corpse = null;
	private Container container = null;
	
	public void setClient(Client client)
	{
		this.client = client;
	}
	
	public void setCorpse(Corpse corpse)
	{
		this.corpse = corpse;
	}
	
	public void setContainer(Container container)
	{
		this.container = container;
	}
	
	public Client getClient()
	{
		return this.client;
	}
	
	public Corpse getCorpse()
	{
		return this.corpse;
	}
	
	public Container getContainer()
	{
		return this.container;
	}
}
