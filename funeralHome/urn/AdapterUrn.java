package funeralHome.urn;

import funeralHome.coffin.Coffin;
import funeralHome.container.Container;

public class AdapterUrn extends Urn
{
	private Container request = null; 
	
	private Coffin createCoffin(Coffin coffin)
	{
		 return coffin;
	}
	
	private Urn createUrn(Urn urn)
	{
		 return urn;
	}
	
	public AdapterUrn(Coffin coffin)
	{
		request = createCoffin(coffin);
	}
	
	public AdapterUrn(Urn urn)
	{
		request = createUrn(urn);
	}
	
	public Container Request()
	{
	  return this.request;
	}
}
