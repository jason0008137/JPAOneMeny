package collectionEX;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ex3 {

	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<>();
		x.add(10);
		x.add(10);
		x.add(30);
		x.add(40);
		System.out.println(x);
		System.out.println("===============");
		x.add(2, 9999);

		System.out.println(x);
		System.out.println("===============");
		System.out.println(x.get(2));

		System.out.println("===============");

		Collections.sort(x);
		System.out.println(x);
		System.out.println(Collections.binarySearch(x, 41));
	}

}
