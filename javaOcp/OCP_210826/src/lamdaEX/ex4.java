package lamdaEX;

interface book4<E, T> {
	T bookName(E n);
}

class Order {
	private String name;

	public Order(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class ex4 {

	public static void main(String[] args) {
		book4 b = new book4<String, Order>() {

			public Order bookName(String n) {
				return new Order(n);
			}
		};

		System.out.println(b.bookName("java"));
		System.out.println(new Order("java").getName());
	}

}
