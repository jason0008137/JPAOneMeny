package demo.controller;

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
import java.util.*;
import model.*;
import javax.persistence.TypedQuery;

@Controller
public class SupplierCoffeeController_T {
     
	private static SessionFactory sessionFactory;
	private  SessionFactory  buildSessionFactory() {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		return sessionFactory;
	}
	public SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;
	}

	@RequestMapping("/supcof_T")
    public String supplierCoffee(Model model) {  
		
		sessionFactory = getSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("Session created");	 		    
		Transaction tx = session.beginTransaction();
		TypedQuery<Suppliers> query= session.createQuery("from Suppliers a where a.supId= :sup_id", Suppliers.class);
		 query.setParameter("sup_id", 49);
		List<Suppliers> sups=query.getResultList();
		Set<Coffees> cofs=sups.get(0).getCoffeeses();
		List<Coffees> cofss=new ArrayList<>(cofs);	    
		tx.commit();
		model.addAttribute("sups", sups);         
		model.addAttribute("coffees", cofss);    
        return"viewTables";         
    }
}
