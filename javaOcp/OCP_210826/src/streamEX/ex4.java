package streamEX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex4 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(12, 5, 6, 2);

		l
		.stream()
		.sorted()
		.forEach(v -> System.out.print(v + " "));

	}

}
