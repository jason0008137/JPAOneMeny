package lamdaEX;

interface book6<E> {
	void bookPrice(E price);
}

class cal {
	static void p1(Integer p) {
		if (p > 0) {
			System.out.println("price = " + p);
		} else {
			System.out.println("..");
		}
	}

	static void p2(Double p) {
		if (p > 0) {
			System.out.println("price = " + p);
		} else {
			System.out.println("..");
		}
	}
}

public class ex6 {

	public static void main(String[] args) {
		book6 b = new book6<Double>() {
			public void bookPrice(Double price) {
				System.out.println("price = " + price);
			}
		};

		System.out.println("==================");
		book6<Double> b2 = a -> System.out.println("price = " + a);
		b2.bookPrice(100.);

		book6<Integer> b3 = cal::p1;
		book6<Double> b4 = cal::p2;

		b3.bookPrice(1);
		b4.bookPrice(1.);
	}
}