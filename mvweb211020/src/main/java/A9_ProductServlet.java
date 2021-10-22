
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Mod.product;

@WebServlet("/A9_ProductServlet")
public class A9_ProductServlet extends HttpServlet
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");
		
		product p = new product(
				Integer.parseInt(request.getParameter("pid")),
				Integer.parseInt(request.getParameter("price")),
				request.getParameter("pname"),
				request.getParameter("place"));
		boolean f = p.insert();
		response.getWriter().append("" + f);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
