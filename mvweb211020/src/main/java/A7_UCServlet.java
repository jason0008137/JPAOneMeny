
import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Mod.UC;

@WebServlet("/A7_UCServlet")
public class A7_UCServlet extends HttpServlet
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String data = request.getParameter("data");
		Gson g = new Gson();
		UC[] ucs = g.fromJson(data, UC[].class);
		String temp = "";
		for (UC uc : ucs)
		{
			temp += uc.toString() + "<br/>";
			response.getWriter().append("<h1>" + temp + "</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
