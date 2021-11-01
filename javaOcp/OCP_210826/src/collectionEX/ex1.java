package collectionEX;

//import java.util.Iterator;

public class ex1 {

	public static void main(String[] args) {
		int[] x = new int[3];

		/*
		 * for (int i = 0; i <= x.length; i++) { x[i] = (i + 1) * 10; }
		 */

		x[0] = 10;
		x[1] = 20;
		x[2] = 30;

		for (int i : x) {
			System.out.println(i);
		}
	}

}
