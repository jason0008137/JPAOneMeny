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
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class ProductModel
{

	private List<Image> images;

	public ProductModel()
	{
		this.images = new ArrayList<Image>();

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
			images = session.createQuery("from productimages").list();

			// check----------
			System.out.println("product list: " + images);
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

	public List<Image> findAll()
	{
		return this.images;
	}

	public Image find(String id)
	{
		for (Image image : this.images)
		{
			if (image.getPid() == Integer.parseInt(id))
			{
				return image;
			}
		}
		return null;
	}

}
