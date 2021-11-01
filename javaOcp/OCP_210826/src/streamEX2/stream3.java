package streamEX2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Order {
	private String name;
	private Integer lcd, ram, sum;

	public Order(String name, Integer lcd, Integer ram) {
		super();
		this.name = name;
		this.lcd = lcd;
		this.ram = ram;
		this.sum = lcd + ram;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLcd() {
		return lcd;
	}

	public void setLcd(Integer lcd) {
		this.lcd = lcd;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getSum() {
		sum = lcd + ram;
		return sum;
	}

	public void setSum(Integer sum) {

		this.sum = sum;
	}

	void show() {
		System.out.println("name: " + getName()
				+ "\tLcd: " + getLcd()
				+ "\tRam: " + getRam()
				+ "\tSum: " + getSum());
	}

}

public class stream3 {

	public static void main(String[] args) {

		Order[] o = new Order[] {
				new Order("A", 1, 2),
				new Order("B", 3, 4),
				new Order("C", 5, 6),
		};

//		for (Order obj : o) {
//			obj.show();
//		}

		List<Order> l = Arrays.asList(o);
		Comparator<Order> comp1 = new Comparator<Order>() {

			public int compare(Order o1, Order o2) {
				return o1.getSum() - o2.getSum();
			}
		};

		Comparator<Order> comp2 = (o1, o2) -> o1.getSum() - o2.getSum();

		l
				.stream()
				.sorted((o1, o2) -> o1.getSum() - o2.getSum())
				.forEach(v -> v.show());

	}

}
