
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Myproduct;

@WebServlet("/A4_AddProductServlet")
public class A4_AddProductServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");

		Myproduct mp = new Myproduct();
		mp.setPid(Integer.parseInt(request.getParameter("pid")));
		mp.setPname(request.getParameter("pname"));
		mp.setPrice(Integer.parseInt(request.getParameter("price")));
		mp.setPlace(request.getParameter("place"));

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mvweb211022");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		try
		{
			em.persist(mp);
			em.getTransaction().commit();

			em.close();
			emf.close();

			response.getWriter().append("true");
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
			response.getWriter().append("false");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
