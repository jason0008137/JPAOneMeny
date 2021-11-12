package model;

import java.util.ArrayList;
import java.util.List;

public class ProductModel
{
	private List<Image> products;

	public ProductModel()
	{
		this.products = new ArrayList<Image>();
		this.products.add(new Image(1, "images/p1.jpg", "1", "1111"));
		this.products.add(new Image(1, "images/p2.jpg", "1", "1111"));
		this.products.add(new Image(1, "images/p3.jpg", "1", "1111"));
	}

	public List<Image> findAll()
	{
		return products;
	}

	public Image find(String id)
	{
		for (Image image : products)
		{
			if (id.equalsIgnoreCase(image.getPid() + ""))
				return image;
		}
		return null;
	}
}
