package model;

public class Item
{

	private Image image;
	private int quantity;

	public Item()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(Image image, int quantity)
	{
		super();
		this.image = image;
		this.quantity = quantity;
	}

	public Image getImage()
	{
		return image;
	}

	public void setImage(Image image)
	{
		this.image = image;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

}
