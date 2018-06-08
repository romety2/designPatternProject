package funeralHome.coffin;

import funeralHome.container.Container;

public interface IFactoryCoffin
{
	Container makeEmptyCoffin();
	Container makeWithOrnamentationsCoffin();
	Container makeWithWreathCoffin();
	Container makeDeluxeCoffin();
}
