package streamEX2;

import java.util.Arrays;
import java.util.List;

public class stream1 {

	public static void main(String[] args) {
		List<Integer> i = Arrays.asList(21, 12, 32, 45, 12);
		i
				.stream()
				.sorted()
				.filter(n -> n >= 30)
				.forEach(n -> System.out.println(n + " "));
	}

}
