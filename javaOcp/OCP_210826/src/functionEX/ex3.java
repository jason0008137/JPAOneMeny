package functionEX;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ex3 {

	public static void main(String[] args) {
		List<Integer> l0 = Arrays.asList(12, 52, 17);
		Stream<Integer> s0 = l0.stream();
		Consumer<Integer> c = v -> System.out.print(v + " ");
		s0.forEach(c);

		System.out.println("\n================");
		List<Integer> l1 = Arrays.asList(12, 52, 17);
		Stream<Integer> s1 = l1.stream();
		s1.forEach(v -> System.out.print(v + " "));

		System.out.println("\n================");
		List<Integer> l2 = Arrays.asList(12, 52, 17);
		l2.stream().forEach(v -> System.out.print(v + " "));

		System.out.println("\n================");
		Arrays.asList(12, 52, 17).stream().forEach(
				v -> System.out.print(v + " "));

		System.out.println("\n================");
		Arrays
				.asList(12, 52, 17)
				.stream()
				.forEach(v -> System.out.print(v + " "));

	}

}
