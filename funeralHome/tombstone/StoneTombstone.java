package funeralHome.tombstone;

import java.util.ArrayList;

import funeralHome.coffin.Coffin;

public class StoneTombstone extends Tombstone
{
	private Coffin coffin = null;
	
	public StoneTombstone(Coffin coffin)
	{
		this.coffin = coffin;
		this.setMaterial(coffin.getMaterial() + ", Stone");
	}
}
