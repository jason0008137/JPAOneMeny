package functionEX;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class product {
	private String name;
	private Integer amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}

class cal4 {
	static public String s1() {
		return "fdsfdsafdsaf";
	}
}

public class supplierEx {

	public static void main(String[] args) {
		Supplier<String> s1 = new Supplier<String>() {
			public String get() {
				return "fdsfdsafdsaf";
			}
		};
		Supplier<Double> s2 = () -> 3.14;
		Supplier<product> s3 = () -> new product();
		ArrayList<String> a = new ArrayList<>();
		a.add(s1.get());
		a.add(s2.get().toString());

		product p = s3.get();
		p.setName("BBBBB");

		a.add(p.getName());
		a.add(new product().getName());

		for (String o : a) {
			System.out.println(o);
		}

	}

}













