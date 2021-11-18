package MyMod;
// Generated 2021�~11��18�� �U��2:07:16 by Hibernate Tools 5.5.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Epproduct generated by hbm2java
 */
public class Epproduct implements java.io.Serializable
{

	private int id;
	private String name;
	private String des;
	private String imagepath;
	private double price;
	private Set eporderdts = new HashSet(0);

	public Epproduct()
	{
	}

	public Epproduct(int id, String name, String des, String imagepath, double price)
	{
		this.id = id;
		this.name = name;
		this.des = des;
		this.imagepath = imagepath;
		this.price = price;
	}

	public Epproduct(int id, String name, String des, String imagepath, double price, Set eporderdts)
	{
		this.id = id;
		this.name = name;
		this.des = des;
		this.imagepath = imagepath;
		this.price = price;
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

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDes()
	{
		return this.des;
	}

	public void setDes(String des)
	{
		this.des = des;
	}

	public String getImagepath()
	{
		return this.imagepath;
	}

	public void setImagepath(String imagepath)
	{
		this.imagepath = imagepath;
	}

	public double getPrice()
	{
		return this.price;
	}

	public void setPrice(double price)
	{
		this.price = price;
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
