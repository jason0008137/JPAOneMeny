package javaAPI;

public class test2 {
	String name;
	boolean contract;
	double salary;

	test2() {
		this.name = new String("Joe");
		this.contract = new Boolean(true);
		this.salary = new Double(100);

//		name = "Joe";
//		contract = true;
//		salary = 100.0f;
// line n1
	}

	public String toString() {
		return name + ":" + contract + ":" + salary;
	}

	public static void main(String[] args) {
		test2 e = new test2();
		// line n2
		e.name = "Joe";
		e.contract = true;
		e.salary = 100;
		System.out.print(e);
	}
}
