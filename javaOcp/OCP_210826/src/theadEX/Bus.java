package theadEX;

import java.util.Iterator;

public class Bus extends Thread {
	private static int sum;

	synchronized static void add(int money) {
		System.out.println("�ثe�`���B= " + sum + " ��");
		System.out.println("�i�b�@��= " + money + " ��");
		sum = sum + money;
		System.out.println("�̷s�`���B= " + sum + " ��");
		System.out.println();
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			add(50);
		}
	}

	public void show() {
		for (int i = 0; i < 20; i++) {
			add(50);
		}
	}
}
