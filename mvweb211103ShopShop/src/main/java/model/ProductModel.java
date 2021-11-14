package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ProductModel
{

	private List<Product> products;

	public ProductModel()
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml")
				.build();

		Metadata meta = new MetadataSources(ssr)
				.getMetadataBuilder()
				.build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session sessionObj = null;
		Session session = null;
		session = factory.openSession();
		Transaction tx = null;

		try
		{
			tx = session.beginTransaction();
			products = session.createQuery("from Product").list();

			// check----------
			System.out.println("product list: " + products);
			// ---------------

			tx.commit();
		} catch (Exception e)
		{
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally
		{
			session.close();
			factory.close();
		}
	}

	void from_mvDB()
	{

	}

	public List<Product> findAll()
	{
		return this.products;
	}

	public Product find(String id)
	{
		for (Product product : this.products)
		{
			if (product.getId().equalsIgnoreCase(id))
			{
				return product;
			}
		}
		return null;
	}

}
