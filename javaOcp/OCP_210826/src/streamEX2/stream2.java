package streamEX2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

class student implements Comparable<student> {
	private String name;
	private int a;
	private int b;
	private int sum;

	public student() {
		super();
	}

	public student(String name, int a, int b) {
		this.name = name;
		this.a = a;
		this.b = b;
		this.sum = a + b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getsum() {
		return sum;
	}

	public void setsum(int c) {
		this.sum = c;
	}

	void show1() {
		System.out.println("name: " + getName()
				+ "\ta: " + getA()
				+ "\tb: " + getB()
				+ "\tc: " + getsum());
	}

	String show2() {
		return "name: " + getName()
				+ "\ta: " + getA()
				+ "\tb: " + getB()
				+ "\tc: " + getsum();
	}

	String show3() {
		return "sum: " + getsum();
	}

	@Override
	public int compareTo(student o) {
//		return this.sum - o.sum;
		return o.sum - this.sum;
	}
}

public class stream2 {

	public static void main(String[] args) {
		List<student> s = Arrays.asList(
				new student("X", 1, 2),
				new student("Y", 3, 4),
				new student("Z", 5, 6));

//		s.stream().forEach(v -> v.show());
		s
				.stream()
				.sorted()
				.filter(v -> v.getA() >= 2)
				.forEach(showStudent::show1);
	}

}

class showStudent {
	static void show1(student s) {
		if (s.getsum() >= 7) {
			System.out.println(s.show2());
		} else {
			System.out.println(s.show2());
		}
	}
}
