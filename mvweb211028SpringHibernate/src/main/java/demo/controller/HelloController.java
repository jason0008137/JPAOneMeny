package demo.controller;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Student;

@Controller
@RequestMapping("/hello")
public class HelloController
{
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model)
	{
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "demo";
	}

//	@RequestMapping(method = RequestMethod.GET)
//	public String listStudent(ModelMap model)
//	{
//		List<Student> data = getAll();
//		System.out.println(data);
//		model.addAttribute("message", data);
//		return "showStudent";
//	}

//	public List<Student> getAll()
//	{
//		SessionFactory factory = null;
//		try
//		{
//			factory = new Configuration().configure(/* "/model/hibernate.cfg.xml" */).buildSessionFactory();
//		} catch (Throwable ex)
//		{
//			System.err.println("Failed to create sessionFactory object." + ex);
//			throw new ExceptionInInitializerError(ex);
//		}
//
//		Session session = factory.openSession();
//		Transaction tx = null;
//
//		try
//		{
//			tx = session.beginTransaction();
//			List data = session.createQuery("FROM Student").list();
//			for (Iterator iterator = data.iterator(); iterator.hasNext();)
//			{
//				Student st = (Student) iterator.next();
//				System.out.print("Student ID: " + st.getId());
//				System.out.print("  Last Name: " + st.getName());
//				System.out.println("  Address: " + st.getAge());
//			}
//			tx.commit();
//			return data;
//		} catch (HibernateException e)
//		{
//			if (tx != null)
//				tx.rollback();
//			e.printStackTrace();
//		} finally
//		{
//			session.close();
//		}
//
//		return null;
//	}

}
