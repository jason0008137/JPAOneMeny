package lamdaEX;

interface book3<E, T> {
	void bookName(String name, E price, T discount);
}

class bookstore1 implements book3<Integer, Double> {

	public void bookName(String name, Integer price, Double discount) {
	}
}

class bookstore2 implements book3<Double, Double> {

	public void bookName(String name, Double price, Double discount) {
	}
}

public class ex3 {

	public static void main(String[] args) {

	}

}
