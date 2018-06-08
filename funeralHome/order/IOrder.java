package funeralHome.order;

import funeralHome.container.Container;
import funeralHome.preson.Client;
import funeralHome.preson.Corpse;

public interface IOrder
{
	void setClient(Client client);
	void setCorpse(Corpse corpse);
	void setCoffin(Container coffin);
	Client getClient();
	Client getCorpse();
	Client getCoffin();
}
