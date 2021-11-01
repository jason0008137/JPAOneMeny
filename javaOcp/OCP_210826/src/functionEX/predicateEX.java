package functionEX;

import java.util.function.Predicate;

class cal1 {
	static boolean p1(Integer i) {
		i = i + 100;
		i = 2 * i;
		return i > 500;
	}
	static boolean p2(Double i) {
		i = i + 100;
		i = 2 * i;
		return i > 500;
	}
}

public class predicateEX {

	public static void main(String[] args) {
		Predicate<Integer> p = new Predicate<Integer>() {

			public boolean test(Integer t) {
				return t > 0;
			}
		};

		System.out.println(p.test(100));

		/*
		 * Integer i; i = 0; System.out.println((i > 0));
		 */

		System.out.println("=======================");
		Predicate<Double> p2 = i -> i >= 10;
		System.out.println(p2.test(4.));

		System.out.println("=======================");
		Predicate<Integer> p3 = cal1::p1;
		System.out.println(p3.test(250));		
	}
}
