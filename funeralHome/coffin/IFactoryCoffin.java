package funeralHome.coffin;

public interface IFactoryCoffin
{
	Coffin makeEmptyCoffin();
	Coffin makeWithOrnamentationCoffin();
	Coffin makeWithWreathCoffin();
	Coffin makeDeluxeCoffin();
}
