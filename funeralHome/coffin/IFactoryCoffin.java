package funeralHome.coffin;

public interface IFactoryCoffin
{
	Coffin makeEmptyCoffin();
	Coffin makeWithOrnamentationsCoffin();
	Coffin makeWithWreathCoffin();
	Coffin makeDeluxeCoffin();
}
