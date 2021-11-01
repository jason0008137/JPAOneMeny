package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindSupplier
{

	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPABasic1");
		EntityManager em = emf.createEntityManager();

		Supplier s = em.find(Supplier.class, 49);
		System.out.println("Supplier id = " + s.getSupId());
		System.out.println("Supplier Name = " + s.getSupName());
		System.out.println("City = " + s.getCity());

		Coffee c = em.find(Coffee.class, "Espresso");
		System.out.println("COF_NAME = " + c.getCofName());
		System.out.println("sales = " + c.getSales());
	}

}
