package MyMod;
// Generated 2021�~11��18�� �U��2:07:16 by Hibernate Tools 5.5.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Epacount generated by hbm2java
 */
public class Epacount implements java.io.Serializable
{

	private int id;
	private String username;
	private String pw;
	private Set eporders = new HashSet(0);

	public Epacount()
	{
	}

	public Epacount(int id, String username, String pw)
	{
		this.id = id;
		this.username = username;
		this.pw = pw;
	}

	public Epacount(int id, String username, String pw, Set eporders)
	{
		this.id = id;
		this.username = username;
		this.pw = pw;
		this.eporders = eporders;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getUsername()
	{
		return this.username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPw()
	{
		return this.pw;
	}

	public void setPw(String pw)
	{
		this.pw = pw;
	}

	public Set getEporders()
	{
		return this.eporders;
	}

	public void setEporders(Set eporders)
	{
		this.eporders = eporders;
	}

}