package test;

import funeralHome.coffin.FactoryGlassCoffin;

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
		
		FactoryGlassCoffin fwc1 = FactoryGlassCoffin.getInstance();
		FactoryGlassCoffin fwc2 = FactoryGlassCoffin.getInstance();
		
		Assert.assertEquals(System.identityHashCode(fgc1), System.identityHashCode(fgc2));
		Assert.assertEquals(System.identityHashCode(fwc1), System.identityHashCode(fwc2));
	}
}
