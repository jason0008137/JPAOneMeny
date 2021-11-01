package theadEX;

public class add2 {

	public static void main(String[] args) throws InterruptedException {
		school2[] s = new school2[4];

		s[0] = new school2("a");
		s[1] = new school2("b");
		s[2] = new school2("c");
		s[3] = new school2("d");

		Thread[] t = new Thread[4];

		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(s[i]);
		}

		t[0].start();
		t[1].start();
		//t[1].join();
		t[2].start();
		t[3].start();
	}

}
