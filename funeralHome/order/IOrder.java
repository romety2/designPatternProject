package funeralHome.order;

import funeralHome.coffin.Coffin;
import funeralHome.preson.Client;
import funeralHome.preson.Corpse;

public interface IOrder
{
	void setClient(Client client);
	void setCorpse(Corpse corpse);
	void setCoffin(Coffin coffin);
	Client getClient();
	Client getCorpse();
	Client getCoffin();
}
