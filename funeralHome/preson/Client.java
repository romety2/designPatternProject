package funeralHome.preson;

public class Client extends Person
{
	private String contact = null;
	
	public Client(String firstName, String lastName, String contact)
	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.contact = contact;
	}
	
	public void setContact(String contact)
	{
		this.contact = contact;
	}
	
	public String getContact()
	{
		return this.contact;
	}
}
