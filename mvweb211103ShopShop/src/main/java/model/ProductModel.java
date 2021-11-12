package model;

import java.util.ArrayList;
import java.util.List;

public class ProductModel
{

	private List<Product> products;

	public ProductModel()
	{
		this.products = new ArrayList<Product>();
		this.products.add(new Product("p01", "JBud Elite", "images/p1.jpg", 20));
		this.products.add(new Product("p02", "EdiMax Wifi", "images/p2.jpg", 21));
		this.products.add(new Product("p03", "Asus Laptop", "images/p3.jpg", 22));

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
