package SampleEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ex11 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("win", "try", "best", "luck", "do");
		Predicate<String> test1 = w -> {
			System.out.println("Checking...");
			return w.equals("do"); // line n1

		};

		Predicate test2 = w -> ((String) w).length() > 3; // line n2

		words.stream()
				.filter(test2)
				.filter(test1)
				.count();
	}
}
