
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;

import model.Employee;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure(/* "/demo/mydb/hibernate.cfg.xml" */)
				.build();

		SessionFactory sessionFactory = new MetadataSources(registry)
				.buildMetadata()
				.buildSessionFactory();

		Session session = sessionFactory.openSession();// 從對談工廠獲取一個session
		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setId(1001);
		e1.setFirstName("Yui");
		e1.setLastName("Lee");

		Employee e2 = new Employee();
		e2.setId(1002);
		e2.setFirstName("Ming");
		e2.setLastName("Wang");
		
		session.persist(e1);
		session.persist(e2);
		t.commit();
		
		session.close();
		
		response.getWriter().append("Employee Saved ");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
