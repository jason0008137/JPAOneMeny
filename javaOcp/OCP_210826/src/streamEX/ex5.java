package streamEX;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class cal {
	static boolean p1(Integer v) {
		return v > 3;
	}
}

public class ex5 {

	public static void main(String[] args) {

		/*
		 * List<Integer> l = Arrays.asList(1, 2, 4, 7, 2);
		 * 
		 * l .stream() .sorted() .filter(v -> v > 3) .forEach(v -> System.out.print(v +
		 * " "));
		 */
		List<Integer> l = Arrays.asList(1, 2, 4, 7, 2);

		l
				.stream()
				.sorted()
				.filter(cal::p1)
				.forEach(v -> System.out.print(v + " "));

		System.out.print("=========");

		l
				.stream()
				.forEach(v -> System.out.print(v + " "));

	}

}
