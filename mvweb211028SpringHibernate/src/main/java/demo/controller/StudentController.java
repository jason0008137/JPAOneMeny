package demo.controller;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import model.Student;

@Controller
public class StudentController
{

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student()
	{
		Student temp = new Student();
		temp.setId(1);
		temp.setName("John");
		temp.setAge(20);
		return new ModelAndView("jqStudent", "command", temp);
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") Student student, ModelMap model)
	{
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());

		if (addSutent(student))
			model.addAttribute("flag", "YA");
		else
			model.addAttribute("flag", "DUM");

//		addSutent(student);

		return "result";
	}

	public boolean addSutent(Student s)
	{
		boolean flag = true;

		SessionFactory factory = null;
		try
		{
			factory = new Configuration().configure(/* "/model/hibernate.cfg.xml" */).buildSessionFactory();
		} catch (Throwable ex)
		{
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		Session session = factory.openSession();
		Transaction tx = null;

		try
		{
			tx = session.beginTransaction();
			session.save(s);
			tx.commit();
		} catch (/* Hibernate */Exception e)
		{
			if (tx != null)
				tx.rollback();
			System.out.print("Idiot" + e.getMessage());
			e.printStackTrace();
			flag = false;
		} finally
		{
			session.close();
		}

		return flag;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listStudent(ModelMap model)
	{
		List<Student> data = getAll();
		System.out.println(data);
		model.addAttribute("message", data);
		return "showStudent";
	}

	public List<Student> getAll()
	{
		SessionFactory factory = null;
		try
		{
			factory = new Configuration().configure(/* "/model/hibernate.cfg.xml" */).buildSessionFactory();
		} catch (Throwable ex)
		{
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		Session session = factory.openSession();
		Transaction tx = null;

		try
		{
			tx = session.beginTransaction();
			List data = session.createQuery("FROM Student").list();

//			for (Iterator iterator = data.iterator(); iterator.hasNext();)
//			{
//				Student st = (Student) iterator.next();
//				System.out.print("Student ID: " + st.getId());
//				System.out.print("  Last Name: " + st.getName());
//				System.out.println("  Address: " + st.getAge());
//			}

			for (Object object : data)
			{
				Student st = (Student) object;
				System.out.print("Student ID: " + st.getId());
				System.out.print("  Last Name: " + st.getName());
				System.out.println("  Address: " + st.getAge());
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
}
