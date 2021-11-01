import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sqlTest
{

	public static void main(String[] args)
	{

		String cfn = "com.mysql.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "jason4680";

		Connection c = null;

		try
		{
			Class.forName(cfn);
			c = DriverManager.getConnection(URL, user, password);

			String SQL = "select * from SUPPLIERS";

			PreparedStatement p = c.prepareStatement(SQL);
			ResultSet r = p.executeQuery();

			while (r.next())
			{
				System.out.println(r.getInt("SUP_ID"));
			}

		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}

	}

}
