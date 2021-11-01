package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student
{
	private int age;
	@Column(name="sname")
	private String name;
	@Id
	@Column(name="sid")
	private int id;

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
