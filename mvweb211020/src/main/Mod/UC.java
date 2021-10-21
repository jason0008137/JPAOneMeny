package Mod;

public class UC
{
	private String user, city;

	public UC()
	{
	}

	public UC(String user, String city)
	{
		this.user = user;
		this.city = city;
	}

	public String getUser()
	{
		return user;
	}

	public void setUser(String user)
	{
		this.user = user;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String toString()
	{
		return user + ":" + city;
	}
}
