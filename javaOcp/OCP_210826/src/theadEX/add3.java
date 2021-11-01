package theadEX;

public class add3 {

	public static void main(String[] args) {
		Bus[] b = new Bus[3];

		for (int i = 0; i <= 2; i++) {
			b[i] = new Bus();
		}
		for (int i = 0; i <= 2; i++) {
			// b[i].show();
			b[i].start();
		}
	}
}
