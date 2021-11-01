
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

import model.Student;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPQLAllDemo");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("Select s from Student s ");
		@SuppressWarnings("unchecked")
		List<Student> list = (List<Student>) query.getResultList();
		System.out.print("sid");
		System.out.print("\t sname");
		System.out.println("\t age");
		for (Student s : list)
		{
			System.out.print(s.getSid());
			System.out.print("\t" + s.getSname());
			System.out.print("\t" + s.getAge());
			System.out.println();
		}
		em.getTransaction().commit();
		em.close();
		emf.close();
		response.getWriter().append("See Tomcat Console Student Data<br/>");

//		update(request, response);
//		insertQuery(response);
		deleteQuery(response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPQLAllDemo");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

//		Query query = em.createQuery("update Student SET age=19 where sid=103");
//		int r = query.executeUpdate();
//		if (r > 0)
//			System.out.println("update successfully");
//		else
//			System.out.println("update failed");

		em.merge(new Student(101, 60, "Gay"));

		em.getTransaction().commit();
		em.close();
		emf.close();
		response.getWriter().append("See Tomcat Console Student Data");
	}

	void insertQuery(HttpServletResponse response) throws ServletException, IOException
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPQLAllDemo");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Student s1 = new Student();
		s1.setSid(1001);
		s1.setSname("Max");
		s1.setAge(27);

		Student s2 = new Student();
		s2.setSid(1102);
		s2.setSname("Yen");
		s2.setAge(21);

		Student s3 = new Student(2020, 15, "YOOO");

		em.persist(s1);
		em.persist(s2);
		em.persist(s3);

		em.getTransaction().commit();
		em.close();
		emf.close();
		response.getWriter().append("See Tomcat Console Student Data");
	}

	void deleteQuery(HttpServletResponse response) throws ServletException, IOException
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPQLAllDemo");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

//		Query query = em.createQuery("delete from Student where sid=2020");
//
//		int r = query.executeUpdate();
//		if (r > 0)
//			System.out.println("delete successfully");
//		else
//			System.out.println("delete failed");

		Student sx = em.find(Student.class, 101);
		em.remove(sx);

		em.getTransaction().commit();

		em.close();
		emf.close();

		response.getWriter().append("See Tomcat Console Student Data");
	}

}
