package model;

public class Image
{
	private String path, name, des;

	public Image()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Image(String path, String name, String des)
	{
		super();
		this.path = path;
		this.name = name;
		this.des = des;
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
