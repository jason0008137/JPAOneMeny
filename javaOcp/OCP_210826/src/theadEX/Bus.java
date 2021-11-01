package theadEX;

import java.util.Iterator;

public class Bus extends Thread {
	private static int sum;

	synchronized static void add(int money) {
		System.out.println("目前總金額= " + sum + " 元");
		System.out.println("進帳一筆= " + money + " 元");
		sum = sum + money;
		System.out.println("最新總金額= " + sum + " 元");
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
