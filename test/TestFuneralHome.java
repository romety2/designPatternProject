package test;

import funeralHome.coffin.Coffin;
import funeralHome.coffin.FactoryGlassCoffin;
import funeralHome.coffin.FactoryWoodenCoffin;
import funeralHome.tombstone.Tombstone;
import funeralHome.tombstone.StoneTombstone;

import static org.junit.Assert.*;

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
}
