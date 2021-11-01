package SampleEx;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class ex14 {

	public static void main(String[] args) {
		Stream.of("Java", "Unix", "Linux")
				.filter(s -> s.contains("n"))
				.peek(s -> System.out.println("PEEK:" + s))
				.findAny();
				//.collect(Collectors.toList());

	}

}
