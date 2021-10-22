
import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Myproduct;

@WebServlet("/A1_MyproductServlet")
public class A1_MyproductServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mvweb211022");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Query q = em.createNamedQuery("Myproduct.findAll");
		List<Myproduct> products = (List<Myproduct>) q.getResultList();
		em.getTransaction().commit();

		em.close();
		emf.close();
		
		request.setAttribute("products", products);
		request.getRequestDispatcher("A2_viewProduct.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
