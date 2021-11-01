package SampleEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class test2 {

	IntConsumer consumer = e -> System.out.println(e);
	Integer value = 90;

//	IntFunction<Integer> funRef = e -> e + 10;
//	Integer result = funRef.apply(10);
//
////	ToIntFunction funRef=e->e+10;
//	int result = funRef.apply(value);
//
//	Function<Integer, Integer> funRef = e -> e + 10;
//	Integer result = funRef.apply(value);

	ToIntFunction<Integer> funRef = e -> e + 10;
	int result = funRef.applyAsInt(value);

//	consumer.accept(result);

}
