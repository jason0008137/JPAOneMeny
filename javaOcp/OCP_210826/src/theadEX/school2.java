package theadEX;

import jdbcEX.fkinstrings;

class student {

}

public class school2 extends student implements Runnable {
	private String name;

	public school2(String name) {

		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(300);
				fkinstrings.fkinE("i = " + i + "\t name = " + name);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
