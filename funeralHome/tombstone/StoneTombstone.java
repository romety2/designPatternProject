package funeralHome.tombstone;

import funeralHome.coffin.Coffin;

public class StoneTombstone extends Tombstone
{
	public StoneTombstone(Coffin coffin)
	{
		this.setMaterial(coffin.getMaterial() + ", Stone");
	}
}
