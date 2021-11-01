package lamdaEX;

import java.util.List;
import java.util.ArrayList;

interface book5<E> {
	E bookPrice(E price);
}

class Store1 implements book5<Integer> {
	public Integer bookPrice(Integer price) {
		return price;
	}

}

class Store2 implements book5<Double> {
	public Double bookPrice(Double price) {
		return price * 0.95;
	}

}

public class ex5 {

	public static void main(String[] args) {
		book5[] b1 = new book5[2];
		b1[0] = new Store1();
		b1[1] = new Store2();

		System.out.println(b1[0].bookPrice(10));
		System.out.println(b1[1].bookPrice(10.0));

		System.out.println("=============");
		ArrayList<book5> b2 = new ArrayList<>();
		b2.add(new Store1());
		b2.add(new Store2());

		System.out.println("=============");
		List<book5> b3 = new ArrayList<>();
		b3.add(new Store1());
		b3.add(new Store2());

		System.out.println("=============");
		List<book5<Integer>> b4 = new ArrayList<>();
		b4.add(new Store1());
		//b4.add(new Store2());
		/*
		for (book5 o : b2) {
			System.out.println(o.bookPrice(10));
		}*/
	}

}
