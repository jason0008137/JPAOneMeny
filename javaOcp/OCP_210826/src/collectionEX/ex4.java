package collectionEX;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class ex4 {

	public static void main(String[] args) {
		HashMap<String, Integer> x = new HashMap();

		x.put("A", 1);
		x.put("B", 2);
		x.put("C", 3);

		System.out.println(x);

		Set<String> s = x.keySet();
		Collection<Integer> i = x.values();

		System.out.println(s + "\n" + i);

	}

}
