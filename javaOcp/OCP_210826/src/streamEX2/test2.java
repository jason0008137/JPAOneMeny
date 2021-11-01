package streamEX2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class test2 {

	public static void main(String[] args) {

		// 1
		List<Person> sts = Arrays.asList(new Person("Jack", 30), new Person("Mike Hill", 21),
				new Person("Thomas Hill", 24));
		Stream<Person> resList = sts.stream().filter(s -> s.getAge() >= 25); // Line n1
		long count = resList.filter(s -> s.getName().contains("Hill")).count();
		System.out.print(count);

		System.out.println("\n\n\n\n");

		//

		List<String> valList = Arrays.asList("", "George", "", "John", "Jim");

		Long newVal = valList.stream()
				.filter(x -> !x.isEmpty())
				.count();

		System.out.println(newVal);

		//

		List<Integer> prices = Arrays.asList(3, 4, 5);
		prices.stream()
				.filter(e -> e > 4)
				.peek(e -> System.out.print("Price " + e))// line 1
				.map(n -> n - 1)// line 2
				.peek(n -> System.out.println(" New Price " + n))// line 3
				.forEach(e -> System.out.println(e));

		System.out.println("\n\n\n\n");

		// 5
		List<String> li = Arrays.asList("Java", "J2EE", "J2ME", "JSTL", "JSP", "Oracle DB");
		Predicate<String> val = p -> p.contains("J");
		List<String> neLi = li.stream().filter(x -> x.length() > 3)
				.filter(val).collect(Collectors.toList());
		System.out.println(neLi);

		System.out.println("\n\n\n\n");

		// 6

		List<String> qwords = Arrays.asList("why", "what", "when ");
		BinaryOperator<String> operator = (s1, s2) -> s1.concat(s2);// line n1
		String sen = qwords.stream()
				.reduce("Word: ", operator);
		System.out.println(sen);

	}

}
