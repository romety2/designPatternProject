package funeralHome.service;

import funeralHome.coffin.Coffin;
import funeralHome.gravedigger.JuniorGravedigger;
import funeralHome.gravedigger.RegularGravedigger;
import funeralHome.gravedigger.SeniorGravedigger;

public class GravediggerService
{
	JuniorGravedigger junior = null;
	RegularGravedigger regular = null;
	SeniorGravedigger senior = null;
	
	public GravediggerService()
	{
		junior = new JuniorGravedigger(regular);
		regular = new RegularGravedigger(senior);
		senior = new SeniorGravedigger(null);
	}
	
	public Boolean handleDigging(Coffin coffin)
	{
		return junior.DigGrave(coffin);
	}
}
