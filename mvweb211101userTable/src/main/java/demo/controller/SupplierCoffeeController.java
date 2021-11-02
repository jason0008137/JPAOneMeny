package demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Coffees;
import model.Suppliers;

@Controller
public class SupplierCoffeeController
{
	private static SessionFactory sessionFactory;

	@RequestMapping("/supcof")
	public String supplierCoffee(Model model)
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

		tx.commit();
		session.close();
		sessionFactory.close();
		
		model.addAttribute("sups", sups);
		model.addAttribute("coffees", cofss);
		
		return "viewTable";
	}

	private SessionFactory buildSessionFactory()
	{
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure(/* "/model/hibernate.cfg.xml" */)
				.build();
		Metadata metadata = new MetadataSources(serviceRegistry)
				.getMetadataBuilder()
				.build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		return sessionFactory;
	}

	public SessionFactory getSessionFactory()
	{
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;
	}

}
