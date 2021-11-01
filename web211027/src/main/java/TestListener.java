
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListener implements ServletContextListener
{
	public TestListener()
	{
	}

	public void contextDestroyed(ServletContextEvent sce)
	{
	}

	public void contextInitialized(ServletContextEvent sce)
	{
		ServletContext sctx = sce.getServletContext();
		sctx.setAttribute("Crop", "Gjun");
		sctx.setAttribute("Tell", "123456789");
	}

}
