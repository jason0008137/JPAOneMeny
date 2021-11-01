package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import model.Book;

public class BookDAO
{
	protected SessionFactory sessionFactory;

	public void setup()
	{
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();
		try
		{
			sessionFactory = new MetadataSources(registry)
					.buildMetadata()
					.buildSessionFactory();
		} catch (Exception ex)
		{
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	protected void exit()
	{
		// code to close Hibernate Session factory
	}

	public void create()
	{
		Book book = new Book();
		book.setId(1);
		book.setTitle("Effective Java");
		book.setAuthor("Joshua Bloch");
		book.setPrice(32.59f);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(book);
		session.getTransaction().commit();
		session.close();
	}

	protected void read()
	{
		// code to get a book
	}

	protected void update()
	{
		// code to modify a book
	}

	protected void delete()
	{
		// code to remove a book
	}

	public static void main(String[] args)
	{
		// code to run the program
	}
}
