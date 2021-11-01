
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListener2 implements ServletContextListener
{

	public TestListener2()
	{
	}

	public void contextDestroyed(ServletContextEvent sce)
	{
	}

	public void contextInitialized(ServletContextEvent sce)
	{
		ServletContext app = sce.getServletContext();
		String name = app.getInitParameter("admin");
		app.setAttribute("admin", name);
	}

}
