
import java.io.IOException;
import java.util.*;

import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import model.*;
import modelOneToMany.Coffees;
import modelOneToMany.Suppliers;

@WebServlet("/SupplierCoffeeServlet")
public class SupplierCoffeeServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public SupplierCoffeeServlet()
	{
		super();
	}

	private static SessionFactory sessionFactory;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		sessionFactory = getSessionFactory();
		Session session = sessionFactory.openSession();
		
		System.out.println("Session created");
		
		Transaction tx = session.beginTransaction();
		TypedQuery<Suppliers> query = session.createQuery("from Suppliers a where a.supId= :sup_id", Suppliers.class);
		query.setParameter("sup_id", 49);
		List<Suppliers> sups = query.getResultList();
		Set<Coffees> cofs = sups.get(0).getCoffeeses();
		List<Coffees> cofss = new ArrayList<>(cofs);
		request.setAttribute("sups", sups);
		request.setAttribute("coffees", cofs);
		request.getRequestDispatcher("viewTables.jsp").forward(request, response);
		tx.commit();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

	private SessionFactory buildSessionFactory()
	{
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml")
				.build();

		Metadata metadata = new MetadataSources(serviceRegistry)
				.getMetadataBuilder()
				.build();

		SessionFactory sessionFactory = metadata
				.getSessionFactoryBuilder()
				.build();

		return sessionFactory;
	}

	public SessionFactory getSessionFactory()
	{
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;
	}
}
