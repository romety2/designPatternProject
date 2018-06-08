package funeralHome.order;

import funeralHome.container.Container;
import funeralHome.preson.Client;
import funeralHome.preson.Corpse;
import funeralHome.urn.Urn;

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
		if (order.getContainer() != null && order.getContainer() instanceof Urn)
		{
			corpse.Burn();
		}
		this.order.setCorpse(corpse);
		return this;
	}
	
	public BuilderOrder container(Container container)
	{
		if (container instanceof Urn && order.getCorpse() != null)
		{
			order.getCorpse().Burn();
		}
		this.order.setContainer(container);
		return this;
	}
	
	public BuilderOrder client(String firstName, String lastName, String contact)
	{
		this.order.setClient(new Client(firstName, lastName, contact));
		return this;
	}
	
	public BuilderOrder corpse(String firstName, String lastName, int age, int growth)
	{
		this.order.setCorpse(new Corpse(firstName, lastName, age, growth));
		return this;
	}
	
	public Order Build()
	{
		return order;
	}
}
