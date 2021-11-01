
import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Mod.Supplier;

@WebServlet("/SupplierServlet")
public class SupplierServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("webJPA211012");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		List<Supplier> result = entityManager.createQuery("select s  from Supplier s ").getResultList();
		request.setAttribute("supplier", result);
		request.getRequestDispatcher("viewSupplier.jsp").forward(request, response);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
