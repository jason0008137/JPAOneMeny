package SampleEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person1 implements Comparable<Person1>// line n1
{
	String name;
	Integer i = 1;
	
	Person1(String name, Integer i) {
		this.name = name;
		this.i = i;
	}

//	public int compareTo(Person1 p) {
//		return this.name.compareTo(p.name);
//	}
	public int compareTo(Person1 p) {
		return this.name.compareTo(p.name);
	}
	// line n2
}

public class ex38 {
	public static void main(String[] args) {
		List<Person1> emps = new ArrayList<>();
//		emps.add(new Person1("A"));
		// code that adds objects of the Person class to the emps list goes here
		Collections.sort(emps);
	}
}
