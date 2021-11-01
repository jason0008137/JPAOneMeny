
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/LabInitParam")
public class LabInitParam extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String initParam = super.getInitParameter("hi");
		response.getWriter().append("Init Param: ").append(initParam + "<p/>");

		response.setContentType("text/html;charset=UTF-8");
		ServletContext sctx = super.getServletContext();
		response.getWriter()
				.append(sctx.getAttribute("Crop").toString())
				.append("<p/>")
				.append(sctx.getAttribute("Tell").toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
