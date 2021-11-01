package SampleEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class test1 {

	public static void main(String[] args) {
		Function<String, Integer> f = v -> Integer.parseInt(v);

		System.out.println(f.apply("10"));

		Stream<List<String>> strs = Stream.of(
				Arrays.asList("text1", "text2"),
				Arrays.asList("text2", "text3"));

		Stream<String> bs2 = strs
				// .filter(b -> b.contains("text1"))
				.flatMap(rs -> rs.stream());

		Stream<String> bs3 = Stream.of("rrr", "fff");

		bs2.forEach(b -> System.out.println("¬Ý³o¸Ì " + b));
//*************************************************
		List<Person> prog = Arrays.asList(
				new Person("Smith", 1500),
				new Person("John", 2000),
				new Person("Joe", 1000));
		double dVal = prog.stream()
				.filter(s -> s.getFirstName().startsWith("J"))
				.mapToInt(Person::getSalary)
				.average()
				.getAsDouble();
		System.out.println(dVal);
	}

}

class Person {
	private String firstName;
	private int salary;

	public Person(String fN, int sal) {
		this.firstName = fN;
		this.salary = sal;

	}

	public int getSalary() {
		return salary;
	}

	public String getFirstName() {
		return firstName;
	}
//*****************************

}
