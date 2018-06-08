package test;

import funeralHome.coffin.Coffin;
import funeralHome.coffin.FactoryGlassCoffin;
import funeralHome.coffin.FactoryWoodenCoffin;
import funeralHome.gravedigger.GravediggerService;
import funeralHome.order.BuilderOrder;
import funeralHome.order.Order;
import funeralHome.tombstone.Tombstone;
import funeralHome.urn.AdapterUrn;
import funeralHome.urn.Urn;
import funeralHome.tombstone.StoneTombstone;

import org.junit.Assert;
import org.junit.Test;

public class TestFuneralHome
{
	@Test
	public void testFactoryCoffinSingleton()
	{
		FactoryGlassCoffin fgc1 = FactoryGlassCoffin.getInstance();
		FactoryGlassCoffin fgc2 = FactoryGlassCoffin.getInstance();
		
		FactoryWoodenCoffin fwc1 = FactoryWoodenCoffin.getInstance();
		FactoryWoodenCoffin fwc2 = FactoryWoodenCoffin.getInstance();
		
		Assert.assertEquals(System.identityHashCode(fgc1), System.identityHashCode(fgc2));
		Assert.assertEquals(System.identityHashCode(fwc1), System.identityHashCode(fwc2));
	}
	
	@Test
	public void testFactoryEmptyCoffin()
	{
		FactoryGlassCoffin fgc = FactoryGlassCoffin.getInstance();
		FactoryWoodenCoffin fwc = FactoryWoodenCoffin.getInstance();
		
		Coffin coffinGlass = fgc.makeEmptyCoffin();
		Coffin coffinWooden = fwc.makeEmptyCoffin();
		
		Assert.assertTrue(coffinGlass.getMaterial().equals("Glass"));
		Assert.assertTrue(coffinWooden.getMaterial().equals("Wood"));
		
		Assert.assertTrue(coffinGlass.getOrnamentations().isEmpty());
		Assert.assertTrue(coffinWooden.getOrnamentations().isEmpty());
		
		Assert.assertFalse(coffinGlass.getWreath());
		Assert.assertFalse(coffinWooden.getWreath());
	}
	
	@Test
	public void testFactorymakeWithOrnamentationCoffin()
	{
		FactoryGlassCoffin fgc = FactoryGlassCoffin.getInstance();
		FactoryWoodenCoffin fwc = FactoryWoodenCoffin.getInstance();
		
		Coffin coffinGlass = fgc.makeWithOrnamentationsCoffin();
		Coffin coffinWooden = fwc.makeWithOrnamentationsCoffin();
		
		Assert.assertTrue(coffinGlass.getMaterial().equals("Glass"));
		Assert.assertTrue(coffinWooden.getMaterial().equals("Wood"));
		
		Assert.assertEquals(coffinGlass.getOrnamentations().size(), 1);
		Assert.assertEquals(coffinWooden.getOrnamentations().size(), 1);
		
		Assert.assertTrue(coffinGlass.getOrnamentations().get(0).equals("ribbons"));
		Assert.assertTrue(coffinWooden.getOrnamentations().get(0).equals("flowers"));
		
		Assert.assertFalse(coffinGlass.getWreath());
		Assert.assertFalse(coffinWooden.getWreath());
	}
	
	@Test
	public void testFactorymakeWithWreathCoffin()
	{
		FactoryGlassCoffin fgc = FactoryGlassCoffin.getInstance();
		FactoryWoodenCoffin fwc = FactoryWoodenCoffin.getInstance();
		
		Coffin coffinGlass = fgc.makeWithWreathCoffin();
		Coffin coffinWooden = fwc.makeWithWreathCoffin();
		
		Assert.assertTrue(coffinGlass.getMaterial().equals("Glass"));
		Assert.assertTrue(coffinWooden.getMaterial().equals("Wood"));
		
		Assert.assertTrue(coffinGlass.getOrnamentations().isEmpty());
		Assert.assertTrue(coffinWooden.getOrnamentations().isEmpty());
		
		Assert.assertTrue(coffinGlass.getWreath());
		Assert.assertTrue(coffinWooden.getWreath());
	}
	
	@Test
	public void testFactoryDeluxeCoffin()
	{
		FactoryGlassCoffin fgc = FactoryGlassCoffin.getInstance();
		FactoryWoodenCoffin fwc = FactoryWoodenCoffin.getInstance();
		
		Coffin coffinGlass = fgc.makeDeluxeCoffin();
		Coffin coffinWooden = fwc.makeDeluxeCoffin();
		
		Assert.assertTrue(coffinGlass.getMaterial().equals("Glass"));
		Assert.assertTrue(coffinWooden.getMaterial().equals("Wood"));
		
		Assert.assertEquals(coffinGlass.getOrnamentations().size(), 1);
		Assert.assertEquals(coffinWooden.getOrnamentations().size(), 1);
		
		Assert.assertTrue(coffinGlass.getOrnamentations().get(0).equals("ribbons"));
		Assert.assertTrue(coffinWooden.getOrnamentations().get(0).equals("flowers"));
		
		Assert.assertTrue(coffinGlass.getWreath());
		Assert.assertTrue(coffinWooden.getWreath());
	}
	
	@Test
	public void testTombstone()
	{
		FactoryGlassCoffin fgc = FactoryGlassCoffin.getInstance();
		FactoryWoodenCoffin fwc = FactoryWoodenCoffin.getInstance();
		
		Coffin coffinGlass = fgc.makeEmptyCoffin();
		Coffin coffinWooden = fwc.makeEmptyCoffin();
		
		Tombstone tgc = new StoneTombstone(coffinGlass);
		Tombstone twc = new StoneTombstone(coffinWooden);
		
		Assert.assertTrue(tgc.getMaterial().equals("Glass, Stone"));
		Assert.assertTrue(twc.getMaterial().equals("Wood, Stone"));
		
		tgc.setEpitaphium("Buried in glass coffin");
		twc.setEpitaphium("Buried in wooden coffin");
		
		Assert.assertTrue(tgc.getEpitaphium().equals("Buried in glass coffin"));
		Assert.assertTrue(twc.getEpitaphium().equals("Buried in wooden coffin"));
	}
	
	@Test
	public void testBuilderOrder()
	{
		BuilderOrder boc = new BuilderOrder();
		BuilderOrder bot = new BuilderOrder();
		
		Order orderC = 
		boc.client("Jan", "Kowalski", "997").corpse("Michael", "Jacson", 77, 50)
		.container(FactoryGlassCoffin.getInstance().makeEmptyCoffin()).Build();
		
		Order orderT = 
		bot.client("Jan2", "Kowalski2", "997").corpse("Michael2", "Jacson2", 77, 50)
		.container(new StoneTombstone(FactoryWoodenCoffin.getInstance().makeEmptyCoffin()))
		.Build();
		
		Assert.assertTrue(orderC.getClient().getFirstName().equals("Jan"));
		Assert.assertTrue(orderC.getClient().getLastName().equals("Kowalski"));
		
		Assert.assertTrue(orderC.getCorpse().getFirstName().equals("Michael"));
		Assert.assertTrue(orderC.getCorpse().getLastName().equals("Jacson"));
		
		Assert.assertTrue(orderC.getContainer().getMaterial().equals("Glass"));
		
		Assert.assertTrue(orderT.getClient().getFirstName().equals("Jan2"));
		Assert.assertTrue(orderT.getClient().getLastName().equals("Kowalski2"));
		
		Assert.assertTrue(orderT.getCorpse().getFirstName().equals("Michael2"));
		Assert.assertTrue(orderT.getCorpse().getLastName().equals("Jacson2"));
		
		Assert.assertTrue(orderT.getContainer().getMaterial().equals("Wood, Stone"));
	}
	
	@Test
	public void testGrabediggerService()
	{
		GravediggerService gs = new GravediggerService();
		
		BuilderOrder bo1 = new BuilderOrder();
		BuilderOrder bo2 = new BuilderOrder();
		BuilderOrder bo3 = new BuilderOrder();
		
		Order order1 = 
		bo1.client("Jan", "Kowalski", "997").corpse("Michael", "Jacson", 6, 46)
		.container(FactoryGlassCoffin.getInstance().makeEmptyCoffin()).Build();
		Order order2 = 
		bo2.client("Jan", "Kowalski", "997").corpse("Michael", "Jacson", 25, 132)
		.container(FactoryGlassCoffin.getInstance().makeEmptyCoffin()).Build();
		Order order3 = 
		bo3.client("Jan", "Kowalski", "997").corpse("Michael", "Jacson", 21, 182)
		.container(FactoryGlassCoffin.getInstance().makeEmptyCoffin()).Build();
		
		Assert.assertTrue(gs.handleDigging(order1).equals("Junior gravedigger dig grave"));
		Assert.assertTrue(gs.handleDigging(order2).equals("Regular gravedigger dig grave"));
		Assert.assertTrue(gs.handleDigging(order3).equals("Senior gravedigger dig grave"));
	}
	
	@Test
	public void testUrn()
	{	
		GravediggerService gs = new GravediggerService();
		
		BuilderOrder bo1 = new BuilderOrder();
		BuilderOrder bo2 = new BuilderOrder();
		
		Order order1 = 
		bo1.client("Jan", "Kowalski", "997").corpse("Michael", "Jacson", 6, 46)
		.container(new AdapterUrn(FactoryGlassCoffin.getInstance().makeEmptyCoffin())).Build();
		Order order2 = 
		bo2.client("Jan", "Kowalski", "997").corpse("Michael", "Jacson", 25, 132)
		.container(new AdapterUrn(new Urn())).Build();
		
		Assert.assertTrue(gs.handleDigging(order1).equals("Junior gravedigger dig grave"));
		Assert.assertTrue(gs.handleDigging(order2).equals("Junior gravedigger dig grave"));
	}
}
