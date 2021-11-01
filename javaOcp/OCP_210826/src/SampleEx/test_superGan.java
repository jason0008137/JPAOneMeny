package SampleEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class test_superGan {
	public static void main(String[] args) {
		MyUtil1<Integer> m = new MyUtil1();
		m.show1(100);
		m.show2("A");

		MyUtil2 m2 = new MyUtil2();
		m2.show1("AAA");

		List<Number> listNum = new ArrayList<Number>();
		List<Integer> listInt = new ArrayList<Integer>();
		List<Double> listDoubles = new ArrayList<Double>();

		listNum.add(10);
		listInt.add(100);
		listDoubles.add(10.0);

		List<String> ls1 = new ArrayList<String>();
		List<String> ls2 = new ArrayList<String>();

		ls1.add("A");
		ls2.add("B");

//		new MyUtil3().copy(ln, li);
		Integer i = MyUtil3.copy(listNum, listInt);
		Double d = MyUtil3.copy(listNum, listDoubles);
		String s = MyUtil3.copy(ls1, ls2);

		System.out.println(s);

	}
}

class MyUtil1<T> {
	T show1(T t) {
		return t;
	}

	void show2(String s) {
	}
}

class MyUtil2 {
	<T> T show1(T t) {
		return t;
	}

	void show2(String s) {
	}
}

class MyUtil3 {
	static <T> T copy(Collection<? super T> target, Collection<T> source) {
		T result = null;

		for (T o : source) {
			result = o;
			target.add(result);
		}

		return result;
	}
}