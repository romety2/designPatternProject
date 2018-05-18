package funeralHome;

public class FuneralHomeJoyful extends FuneralHome
{
	@Override
	protected Coffin createCoffin(String type)
	{
		Coffin c = null;
		FuneralHomeFactory f = new FuneralHomeJoyfulFactory();
		
		if ("wooden".equals(type))
		{			  
			c = new CoffinDecorator(new CoffinWooden(f));
			//System.out.println("A wooden coffin was created");
		}
		else if ("stone".equals(type))
		{ 
			c = new CoffinDecorator(new CoffinStone(f));
			//System.out.println("A stone coffin was created");
		}
		else if ("glass".equals(type))
		{ 
			c = new CoffinDecorator(new CoffinGlass(f));
			//System.out.println("A glass coffin was created");
		}
		else if ("tombstone".equals(type))
		{ 
			c = new TombstoneDecorator(new TombstoneAdapter(new Tombstone(f)));
			//System.out.println("A coffin was created along with a tombstone");
		}
		return c;
	}
}
