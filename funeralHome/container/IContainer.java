package funeralHome.container;

import java.util.ArrayList;

public interface IContainer
{
	String getMaterial();
	void setOrnamentations(ArrayList<String> ornamentations);
	void addOrnamentation(String ornamentation);
	ArrayList<String> getOrnamentations();
}
