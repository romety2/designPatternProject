package funeralHome.order;

import funeralHome.coffin.Coffin;
import funeralHome.preson.Client;
import funeralHome.preson.Corpse;

public class BuilderOrder
{
	private Order order = null;
	
	public BuilderOrder()
	{
		this.order = new Order();
	}
	
	public BuilderOrder client(Client client)
	{
		this.order.setClient(client);
		return this;
	}
	
	public BuilderOrder corpse(Corpse corpse)
	{
		this.order.setCorpse(corpse);
		return this;
	}
	
	public BuilderOrder coffin(Coffin coffin)
	{
		this.order.setCoffin(coffin);
		return this;
	}
	
	public BuilderOrder client(String firstName, String lastName, String contact)
	{
		this.order.setClient(new Client(firstName, lastName, contact));
		return this;
	}
	
	public BuilderOrder corpse(String firstName, String lastName, int age)
	{
		this.order.setCorpse(new Corpse(firstName, lastName, age));
		return this;
	}
	
	public Order Build()
	{
		return order;
	}
}
