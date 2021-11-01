package theadEX;

import java.util.Iterator;

import jdbcEX.fkinstrings;

public class school extends Thread {
	private String name;

	public school(String name) {
		this.name = name;
	}

	void show() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(300);
				fkinstrings.fkinE("i = " + i + "\t name = " + name);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
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
