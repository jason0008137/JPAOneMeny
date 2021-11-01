package functionEX;

import java.util.Objects;
import java.util.function.Function;

class Order {
	private String name;

	public Order(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class cal3 {
	static Integer f1(String t) {
		return Integer.parseInt(t);
	}

	static Double f2(String t) {
		return Double.parseDouble(t);
	}

	static Order f3(String t) {

		return new Order(t);
	}
}

public class functionEX2 {

	public static void main(String[] args) {
		Function<String, Integer> f1 = new Function<String, Integer>() {
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}

		};
		Function<String, Double> f2 = t -> Double.parseDouble(t);
		Function<String, Order> f3 = n -> new Order(n);
		Function<String, Order> f4 = new Function<String, Order>() {
			public Order apply(String t) {
				return new Order(t);
			}
		};
		Order o = f4.apply("teacher");

		System.out.println(f1.apply("123"));
		System.out.println(f2.apply("12"));
		System.out.println(o.getName());
		o.setName("rrrr");
		System.out.println(o.getName());
	}
}





/*


public interface Function<T, R> {

    R apply(T t);

    default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
        Objects.requireNonNull(before);
        return (V v) -> apply(before.apply(v));
    }

    default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }

    static <T> Function<T, T> identity() {
        return t -> t;
    }
}



*/
















