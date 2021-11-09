package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productimages")
public class Image
{
	@Id
	private int pid;
	private String path, name, des;

	public Image()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Image(int pid, String path, String name, String des)
	{
		super();
		this.pid = pid;
		this.path = path;
		this.name = name;
		this.des = des;
	}

	public int getPid()
	{
		return pid;
	}

	public void setPid(int pid)
	{
		this.pid = pid;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDes()
	{
		return des;
	}

	public void setDes(String des)
	{
		this.des = des;
	}

}
