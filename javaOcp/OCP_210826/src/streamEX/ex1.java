package streamEX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class funCal {
	static void abc(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}

	static void abc2(int... x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}
}

public class ex1 {

	public static void main(String[] args) {

		List<Integer> x = new ArrayList<>();
		x.add(10);
		x.add(3);
		x.add(30);
		x.add(40);
		x.add(5);

		System.out.println(x);
		Collections.sort(x);
		for (Integer o : x) {
			System.out.print(o + " ");
		}

		System.out.println();
		funCal.abc(new int[] { 10, 20, 56 });

		System.out.println();
		funCal.abc2(10, 20, 56);
	}

}
