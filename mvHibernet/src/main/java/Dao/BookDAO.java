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
		sessionFactory.close();
	}

	public void read(Long id)
	{
		Session session = sessionFactory.openSession();

		Book book = session.get(Book.class, id);

		if (book != null)
		{
			System.out.println("Title: " + book.getTitle());
			System.out.println("Author: " + book.getAuthor());
			System.out.println("Price: " + book.getPrice());
		} else
		{
			System.out.println("DUM");
		}

		session.close();
		sessionFactory.close();
	}

	public void update()
	{
		Book book = new Book();
		book.setId(1);
		book.setTitle("KAIKIA");
		book.setAuthor("99999");
		book.setPrice(6969f);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

//		Book b = session.get(Book.class, book.getId());
//		if (b != null)
//		{
//			session.update(book);
//		} else
//		{
//			System.out.println("Dum");
//		}

		try
		{
			session.update(book);
			session.getTransaction().commit();
		} catch (Exception e)
		{
			System.out.println("Hibernate Error: " + e.getMessage());
			System.out.println("Can't update book id: " + book.getId());
		}

//		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	public void delete(Long id)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Book b = session.get(Book.class, id);
		if (b != null)
		{
			session.delete(b);
		} else
		{
			System.out.println("Dum");
		}

		session.getTransaction().commit();
		session.close();

	}
}
