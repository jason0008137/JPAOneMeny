
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Mod.product;
import com.google.gson.*;

@WebServlet("/productServlet")
public class productServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		product p1 = new product("ASER", 3000);
		Gson g = new Gson();
		String s = g.toJson(p1);
		response.getWriter().append(s);
//		response.getWriter().append("AAAAAAAAAA");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
