package streamEX;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ex2 {

	public static void main(String[] args) {
		List<Integer> x = Arrays.asList(30, 50, 4, 5, 99);
		Stream<Integer> s = x.stream();
		Consumer<Integer> c = v -> System.out.print(v + " ");
		s.forEach(c);
	}

}
