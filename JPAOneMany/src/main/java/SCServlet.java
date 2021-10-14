
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
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

import model.Coffee;
import model.Supplier;

@WebServlet("/SCServlet")
public class SCServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
//		add();
		query(request, response);
		response.getWriter().append("YOOOOOOOOOOOOOOOOOOOOO");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

	protected void add()
	{

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAOneMany");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Supplier sp = new Supplier();
		sp.setCity("Taipei");
		sp.setSupName("Gjun");
		sp.setState("TW");
		sp.setStreet("Kung Yuan Road");
		sp.setZip("101");
		sp.setSupId(1);

		Coffee c1 = new Coffee();
		c1.setCofName("Flavor A");
		c1.setPrice(new BigDecimal(200.0));
		c1.setSales(10);
		c1.setTotal(5);
		c1.setSupplier(sp);

		Coffee c2 = new Coffee();
		c2.setCofName("Flavor B");
		c2.setPrice(new BigDecimal(100.0));
		c2.setSales(11);
		c2.setTotal(6);
		c2.setSupplier(sp);

//		em.persist(c1);
//		em.persist(c2);

		ArrayList<Coffee> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		sp.setCoffees(list);
		em.persist(sp);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	protected void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAOneMany");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query query = em.createQuery("Select c from Coffee c");

		List<Coffee> list = query.getResultList();
		System.out.println("Coffee :");
		for (Coffee s : list)
		{
			System.out.print(s);
			System.out.println("\t" + s.getSupplier());
		}

		em.close();
		emf.close();

		request.setAttribute("CofList", list);
		request.getRequestDispatcher("viewCoffee.jsp").forward(request, response);
	}
}
