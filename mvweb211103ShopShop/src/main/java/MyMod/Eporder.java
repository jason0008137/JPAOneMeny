package MyMod;
// Generated 2021�~11��18�� �U��2:07:16 by Hibernate Tools 5.5.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Eporder generated by hbm2java
 */
public class Eporder implements java.io.Serializable
{

	private int id;
	private Epacount epacount;
	private Set eporderdts = new HashSet(0);

	public Eporder()
	{
	}

	public Eporder(int id, Epacount epacount)
	{
		this.id = id;
		this.epacount = epacount;
	}

	public Eporder(int id, Epacount epacount, Set eporderdts)
	{
		this.id = id;
		this.epacount = epacount;
		this.eporderdts = eporderdts;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Epacount getEpacount()
	{
		return this.epacount;
	}

	public void setEpacount(Epacount epacount)
	{
		this.epacount = epacount;
	}

	public Set getEporderdts()
	{
		return this.eporderdts;
	}

	public void setEporderdts(Set eporderdts)
	{
		this.eporderdts = eporderdts;
	}

}
