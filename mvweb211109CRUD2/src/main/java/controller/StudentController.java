//package controller;
//
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.*;
//import model.Student;
//
//@Controller
//@RequestMapping("/student")
//public class StudentController
//{
//
//	@RequestMapping(method = RequestMethod.GET)
//	public String listStudent(ModelMap model)
//	{
//		List<Student> data = getAll();
//		System.out.println(data);
//		model.addAttribute("message", data);
//		return "showStudent";
//	}
//
//	List<Student> getAll()
//	{
//		Configuration configObj = new Configuration();
//		configObj.addClass(model.Student.class);
//		configObj.configure("hibernate.cfg.xml");
//
//		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
//		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
//				.applySettings(configObj.getProperties()).build();
//		Session session = null;
//		session = configObj.buildSessionFactory(serviceRegistryObj).openSession();
//		Transaction tx = null;
//		try
//		{
//
//			tx = session.beginTransaction();
//			List data = session.createQuery("FROM Student").list();
//			for (Iterator iterator = data.iterator(); iterator.hasNext();)
//			{
//				Student st = (Student) iterator.next();
//				System.out.print("Student ID: " + st.getStudentId());
//				System.out.print("  Last Name: " + st.getName());
//				System.out.println("  Address: " + st.getAddress());
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
//
//	public void addStu(Student stu)
//	{
//		Configuration configObj = new Configuration();
//		configObj.addClass(model.Student.class);
//		configObj.configure("hibernate.cfg.xml");
//
//		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
//		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
//				.applySettings(configObj.getProperties()).build();
//		Session sessionObj = null;
//		// Creating Hibernate SessionFactory Instance
//		try
//		{
//			sessionObj = configObj.buildSessionFactory(serviceRegistryObj).openSession();
//			sessionObj.beginTransaction();
//			sessionObj.save(stu);
//
//			System.out.println("\n.......Records Saved Successfully To The Database.......\n");
//
//			// Committing The Transactions To The Database
//			sessionObj.getTransaction().commit();
//
//		} catch (Exception sqlException)
//		{
//			if (null != sessionObj.getTransaction())
//			{
//				System.out.println("\n.......Transaction Is Being Rolled Back.......");
//				sessionObj.getTransaction().rollback();
//			}
//			sqlException.printStackTrace();
//		} finally
//		{
//			if (sessionObj != null)
//			{
//				sessionObj.close();
//			}
//		}
//	}
//
//	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
//	public ModelAndView addStudent(@ModelAttribute("student") Student stu)
//	{
//		System.out.println("stu obj:" + stu);
//		addStu(stu);
//		return new ModelAndView("showStudent", "message", getAll());
//
//	}
//
//	public void updateStu(Student stu)
//	{
//		Configuration configObj = new Configuration();
//		configObj.addClass(model.Student.class);
//		configObj.configure("hibernate.cfg.xml");
//
//		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
//		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
//				.applySettings(configObj.getProperties()).build();
//		Session sessionObj = null;
//		// Creating Hibernate SessionFactory Instance
//		try
//		{
//			sessionObj = configObj.buildSessionFactory(serviceRegistryObj).openSession();
//			sessionObj.beginTransaction();
//			sessionObj.update(stu);
//
//			System.out.println("\n.......Records Saved Successfully To The Database.......\n");
//
//			// Committing The Transactions To The Database
//			sessionObj.getTransaction().commit();
//
//		} catch (Exception sqlException)
//		{
//			if (null != sessionObj.getTransaction())
//			{
//				System.out.println("\n.......Transaction Is Being Rolled Back.......");
//				sessionObj.getTransaction().rollback();
//			}
//			sqlException.printStackTrace();
//		} finally
//		{
//			if (sessionObj != null)
//			{
//				sessionObj.close();
//			}
//		}
//	}
//
//	@RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
//	public ModelAndView updateStudent(@ModelAttribute("student") Student stu)
//	{
//		System.out.println("stu obj:" + stu);
//		updateStu(stu);
//		return new ModelAndView("showStudent", "message", getAll());
//
//	}
//
//	public void deleteStu(Student stu)
//	{
//		Configuration configObj = new Configuration();
//		configObj.addClass(model.Student.class);
//		configObj.configure("hibernate.cfg.xml");
//
//		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
//		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
//				.applySettings(configObj.getProperties()).build();
//		Session sessionObj = null;
//		// Creating Hibernate SessionFactory Instance
//		try
//		{
//			sessionObj = configObj.buildSessionFactory(serviceRegistryObj).openSession();
//			sessionObj.beginTransaction();
//			sessionObj.delete(stu);
//
//			System.out.println("\n.......Records Saved Successfully To The Database.......\n");
//
//			// Committing The Transactions To The Database
//			sessionObj.getTransaction().commit();
//
//		} catch (Exception sqlException)
//		{
//			if (null != sessionObj.getTransaction())
//			{
//				System.out.println("\n.......Transaction Is Being Rolled Back.......");
//				sessionObj.getTransaction().rollback();
//			}
//			sqlException.printStackTrace();
//		} finally
//		{
//			if (sessionObj != null)
//			{
//				sessionObj.close();
//			}
//		}
//	}
//
//	@RequestMapping(value = "/deleteStudent", method = RequestMethod.POST)
//	public ModelAndView deleteStudent(@ModelAttribute("student") Student stu)
//	{
//		System.out.println("stu obj:" + stu);
//		deleteStu(stu);
//		return new ModelAndView("showStudent", "message", getAll());
//
//	}
//}

/*
???????????????????????????????????????????????????????????????????????????????????????
???????????????????????????????????????????????????????????????????????????????????????
???????????????????????????????????????????????????????????????????????????????????????
???????????????????????????????????????????????????????????????????????????????????????
???????????????????????????????????????????????????????????????????????????????????????
???????????????????????????????????????????????????????????????????????????????????????
???????????????????????????????????????????????????????????????????????????????????????
???????????????????????????????????????????????????????????????????????????????????????
???????????????????????????????????????????????????????????????????????????????????????
???????????????????????????????????????????????????????????????????????????????????????
???????????????????????????????????????????????????????????????????????????????????????
???????????????????????????????????????????????????????????????????????????????????????
???????????????????????????????????????????????????????????????????????????????????????
???????????????????????????????????????????????????????????????????????????????????????
???????????????????????????????????????????????????????????????????????????????????????
*/

package controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;
import model.Student;

@Controller
@RequestMapping("/student")
public class StudentController
{

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Student listStudent(@ModelAttribute("student") Student stu)
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session sessionObj = null;

		Session session = null;
		session = factory.openSession();
		Transaction tx = null;
		try
		{

			tx = session.beginTransaction();
			Student st = session.find(model.Student.class, stu.getStudentId());
			tx.commit();
			return st;
		} catch (HibernateException e)
		{
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally
		{
			session.close();
		}

		return null;
	}

//	@RequestMapping(method = RequestMethod.GET)
//	public String listStudent(ModelMap model)
//	{
//		List<Student> data = getAll();
//		System.out.println(data);
//		model.addAttribute("message", data);
//		return "showStudent";
//	}

//	@RequestMapping(value = "/student2", method = RequestMethod.GET)
//	public String listStudent(ModelMap model)
//	{
//		List<Student> data = getAll();
//		System.out.println(data);
//		model.addAttribute("message", data);
//		return "showStudent";
//	}

	List<Student> getAll()
	{

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session sessionObj = null;

		Session session = null;
		session = factory.openSession();
		Transaction tx = null;
		try
		{

			tx = session.beginTransaction();
			List data = session.createQuery("FROM model.Student").list();
			for (Iterator iterator = data.iterator(); iterator.hasNext();)
			{
				Student st = (Student) iterator.next();
				System.out.print("Student ID: " + st.getStudentId());
				System.out.print("  Last Name: " + st.getName());
				System.out.println("  Address: " + st.getAddress());
			}
			tx.commit();
			return data;
		} catch (HibernateException e)
		{
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally
		{
			session.close();
		}

		return null;
	}

//	List<Student> getAll_hbmXML()
//	{
//
//		Configuration configObj = new Configuration();
//		configObj.addClass(model.Student.class); // Stuednt.hbm.xml
//		configObj.configure("hibernate.cfg.xml");
//
//		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
//		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
//				.applySettings(configObj.getProperties()).build();
//		Session session = null;
//		session = configObj.buildSessionFactory(serviceRegistryObj).openSession();
//		Transaction tx = null;
//		try
//		{
//
//			tx = session.beginTransaction();
//			List data = session.createQuery("FROM model.Student").list();
//			for (Iterator iterator = data.iterator(); iterator.hasNext();)
//			{
//				Student st = (Student) iterator.next();
//				System.out.print("Student ID: " + st.getStudentId());
//				System.out.print("  Last Name: " + st.getName());
//				System.out.println("  Address: " + st.getAddress());
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

	public void addStu(Student stu)
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session sessionObj = null;
		// Creating Hibernate SessionFactory Instance
		try
		{
			sessionObj = factory.openSession();
			sessionObj.beginTransaction();
			sessionObj.save(stu);

			System.out.println("\n.......Records Saved Successfully To The Database.......\n");

			// Committing The Transactions To The Database
			sessionObj.getTransaction().commit();

		} catch (Exception sqlException)
		{
			if (null != sessionObj.getTransaction())
			{
				System.out.println("\n.......addStu Transaction Is Being Rolled Back.......");
				sessionObj.getTransaction().rollback();
			}
			sqlException.printStackTrace();
		} finally
		{
			if (sessionObj != null)
			{
				sessionObj.close();
			}
		}
	}

	public void addStuhbmXML(Student stu)
	{
		Configuration configObj = new Configuration();
		configObj.addClass(model.Student.class); // Student.hbm.xml
		configObj.configure("hibernate.cfg.xml");

		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
				.applySettings(configObj.getProperties()).build();
		Session sessionObj = null;
		// Creating Hibernate SessionFactory Instance
		try
		{
			sessionObj = configObj.buildSessionFactory(serviceRegistryObj).openSession();
			sessionObj.beginTransaction();
			sessionObj.save(stu);

			System.out.println("\n.......addStuhbmXML Records Saved Successfully To The Database.......\n");

			// Committing The Transactions To The Database
			sessionObj.getTransaction().commit();

		} catch (Exception sqlException)
		{
			if (null != sessionObj.getTransaction())
			{
				System.out.println("\n.......addStuhbmXML Transaction Is Being Rolled Back.......");
				sessionObj.getTransaction().rollback();
			}
			sqlException.printStackTrace();
		} finally
		{
			if (sessionObj != null)
			{
				sessionObj.close();
			}
		}
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("student") Student stu)
	{
		System.out.println("stu obj:" + stu);
		addStu(stu);
		return new ModelAndView("showStudent", "message", getAll());

	}

	public void updateStu(Student stu)
	{
		Configuration configObj = new Configuration();
		configObj.addClass(model.Student.class); // use model/Student.hbm.xml
		configObj.configure("hibernate.cfg.xml");

		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
				.applySettings(configObj.getProperties()).build();
		Session sessionObj = null;
		// Creating Hibernate SessionFactory Instance
		try
		{
			sessionObj = configObj.buildSessionFactory(serviceRegistryObj).openSession();
			sessionObj.beginTransaction();
			sessionObj.update(stu);

			System.out.println("\n.......addStudent Records Saved Successfully To The Database.......\n");

			// Committing The Transactions To The Database
			sessionObj.getTransaction().commit();

		} catch (Exception sqlException)
		{
			if (null != sessionObj.getTransaction())
			{
				System.out.println("\n.......updateStu Transaction Is Being Rolled Back.......");
				sessionObj.getTransaction().rollback();
			}
			sqlException.printStackTrace();
		} finally
		{
			if (sessionObj != null)
			{
				sessionObj.close();
			}
		}
	}

	public void updateStu_SF(Student stu)
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session sessionObj = null;

		try
		{
			sessionObj = factory.openSession();
			sessionObj.beginTransaction();
			sessionObj.update(stu);

			System.out.println("\n.......addStudent Records Saved Successfully To The Database.......\n");

			// Committing The Transactions To The Database
			sessionObj.getTransaction().commit();

		} catch (Exception sqlException)
		{
			if (null != sessionObj.getTransaction())
			{
				System.out.println("\n.......updateStu Transaction Is Being Rolled Back.......");
				sessionObj.getTransaction().rollback();
			}
			sqlException.printStackTrace();
		} finally
		{
			if (sessionObj != null)
			{
				sessionObj.close();
			}
		}
	}

	@RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
	public ModelAndView updateStudent(@ModelAttribute("student") Student stu)
	{
		System.out.println("stu obj:" + stu);
		updateStu_SF(stu);
		return new ModelAndView("showStudent", "message", getAll());

	}

	public void deleteStu(Student stu)
	{
		Configuration configObj = new Configuration();
		configObj.addClass(model.Student.class);
		configObj.configure("hibernate.cfg.xml");

		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
				.applySettings(configObj.getProperties()).build();
		Session sessionObj = null;
		// Creating Hibernate SessionFactory Instance
		try
		{
			sessionObj = configObj.buildSessionFactory(serviceRegistryObj).openSession();
			sessionObj.beginTransaction();
			sessionObj.delete(stu);

			System.out.println("\n.......deleteStu Records Saved Successfully To The Database.......\n");

			// Committing The Transactions To The Database
			sessionObj.getTransaction().commit();

		} catch (Exception sqlException)
		{
			if (null != sessionObj.getTransaction())
			{
				System.out.println("\n.......deleteStu Transaction Is Being Rolled Back.......");
				sessionObj.getTransaction().rollback();
			}
			sqlException.printStackTrace();
		} finally
		{
			if (sessionObj != null)
			{
				sessionObj.close();
			}
		}
	}

	@RequestMapping(value = "/deleteStudent", method = RequestMethod.POST)
	public ModelAndView deleteStudent(@ModelAttribute("student") Student stu)
	{
		System.out.println("stu obj:" + stu);
		deleteStu(stu);
		return new ModelAndView("showStudent", "message", getAll());

	}
}
