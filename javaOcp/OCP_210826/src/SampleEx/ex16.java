package SampleEx;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex16 {
	public static void main(String[] args) {
//		Stream str = Stream.of(1, 2, 3, 4);
//		IntStream str = Stream.of(1, 2, 3, 4);
//		DoubleStream str = Stream.of(1.0, 2.0, 3.0, 4.0);
		IntStream str = IntStream.of(1, 2, 3, 4);

		Double d = str.average().getAsDouble();
		System.out.println("Average=" + d);
	}
}
