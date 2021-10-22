package Mod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class product
{
	private int pid, price;
	private String pname, place;

	public product()
	{
	}

	public product(int pid, int price, String pname, String place)
	{
		this.pid = pid;
		this.price = price;
		this.pname = pname;
		this.place = place;
	}

	public int getPid()
	{
		return pid;
	}

	public void setPid(int pid)
	{
		this.pid = pid;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public String getPname()
	{
		return pname;
	}

	public void setPname(String pname)
	{
		this.pname = pname;
	}

	public String getPlace()
	{
		return place;
	}

	public void setPlace(String place)
	{
		this.place = place;
	}

	public boolean insert()
	{
		boolean flag = true;
		String CFN = "com.mysql.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "jason4680";

		String SQL = "insert into myproduct(pid, pname, price, place) values(?, ?, ?, ?)";

		try
		{
			Class.forName(CFN);
			Connection c = DriverManager.getConnection(URL, user, password);
			PreparedStatement p = c.prepareStatement(SQL);
			p.setInt(1, this.pid);
			p.setString(2, this.pname);
			p.setInt(3, this.price);
			p.setString(4, this.place);

			int rs = p.executeUpdate();
			if (rs > 0)
			{
				flag = true;
			} else
			{
				flag = false;
				c.close();
			}

		} catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
			return false;
		}

		return flag;
	}

	public List<product> selectAll()
	{
		List<product> list = new ArrayList<product>();

		String CFN = "com.mysql.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "jason4680";

		String SQL = "select * from myproduct order by pid desc";

		try
		{
			Class.forName(CFN);
			Connection c = DriverManager.getConnection(URL, user, password);
			Statement s = c.createStatement();
			ResultSet r = s.executeQuery(SQL);

			while (r.next())
			{
				product p = new product(
						r.getInt("pid"),
						r.getInt("price"),
						r.getString("pname"),
						r.getString("place"));
				list.add(p);
			}

		} catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}

		return list;
	}
}
