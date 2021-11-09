package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account
{
	@Id
	private int aid;
	private String name, pw;

	public Account()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int aid, String name, String pw)
	{
		super();
		this.aid = aid;
		this.name = name;
		this.pw = pw;
	}

	public int getAid()
	{
		return aid;
	}

	public void setAid(int aid)
	{
		this.aid = aid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPw()
	{
		return pw;
	}

	public void setPw(String pw)
	{
		this.pw = pw;
	}

}
