package demo.springmvc;

public class Student
{
	private int age;
	private String name;
	private int id;

	public Student()
	{
	}

	public Student(int age, String name, int id)
	{
		this.age = age;
		this.name = name;
		this.id = id;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getAge()
	{
		return age;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getId()
	{
		return id;
	}

}