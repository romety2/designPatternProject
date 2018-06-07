package funeralHome.coffin;

import java.util.ArrayList;

public interface ICoffin
{
	String getMaterial();
	void setOrnamentations(ArrayList<String> ornamentations);
	void addOrnamentation(String ornamentation);
	ArrayList<String> getOrnamentations();
	void setWreath();
	void delWreath();
	Boolean getWreath();
}
