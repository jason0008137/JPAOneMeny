package com.SC;

import com.SA.student;
import com.SA.student2;
import com.SB.A;

public class add {
	public static void main(String[] args) {
		// System.out.println("hello world");
		student s = new student("a");
		System.out.println(s.show());
		A a = new A("a", 10);
		System.out.println(a.show());
		
		A b = new A("b", 90);
		System.out.println(b.show());
		
	}
}
