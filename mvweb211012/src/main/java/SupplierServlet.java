
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Mod.Supplier;
import MyUtil.Strings;

@WebServlet("/SupplierServlet")
public class SupplierServlet extends HttpServlet
{
	ArrayList sups = new ArrayList();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			Connection conn = null;
			try
			{
				Class.forName(Strings.CFN);
				conn = DriverManager.getConnection(Strings.URL, Strings.USER, Strings.PASSWORD);
			} catch (Exception ex)
			{
				System.out.println(ex.getMessage());
				return;
			}
			viewTable2(conn);
		} catch (SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		request.setAttribute("suppliers", sups);
		RequestDispatcher rd = request.getRequestDispatcher("ViewSupplier2.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

	public void viewTable(Connection con) throws SQLException
	{
		Statement stmt = null;
		String SQL = "select SUP_ID, SUP_NAME, STREET, CITY, STATE, ZIP from SUPPLIERS";
		try
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);

			while (rs.next())
			{
				HashMap sp = new HashMap();
				sp.put("SUP_ID", "" + rs.getInt("SUP_ID"));
				sp.put("SUP_NAME", rs.getString("SUP_NAME"));
				sp.put("STREET", rs.getString("STREET"));
				sp.put("CITY", rs.getString("CITY"));
				sp.put("STATE", rs.getString("CITY"));
				sp.put("ZIP", rs.getString("ZIP"));
				sups.add(sp);
			}

		} catch (SQLException e)
		{
			System.out.println(e.getMessage());
		} finally
		{
			if (stmt != null)
			{
				stmt.close();
			}
		}
	}

	public void viewTable2(Connection con) throws SQLException
	{
		Statement stmt = null;
		String SQL = "select SUP_ID, SUP_NAME, STREET, CITY, STATE, ZIP from SUPPLIERS";
		try
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);

			while (rs.next())
			{
				Supplier sp = new Supplier(
						rs.getInt("SUP_ID"),
						rs.getString("SUP_NAME"),
						rs.getString("STREET"),
						rs.getString("CITY"),
						rs.getString("STATE"),
						rs.getString("ZIP"));
				sups.add(sp);
			}

		} catch (SQLException e)
		{
			System.out.println(e.getMessage());
		} finally
		{
			if (stmt != null)
			{
				stmt.close();
			}
		}
	}
}
