package collectionEX;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ex5 {

	public static void main(String[] args) {
		//ArrayList<student> x = new ArrayList();
		TreeSet<student> x = new TreeSet();
		x.add(new student("A", 2, 2));
		x.add(new student("B", 3, 100));
		x.add(new student("C", 5, 10));

		for (student s : x) {
			s.show();
		}
	}

}
