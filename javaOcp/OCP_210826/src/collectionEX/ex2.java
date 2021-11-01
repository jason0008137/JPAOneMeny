package collectionEX;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class ex2 {

	public static void main(String[] args) {
		// ArrayList<Integer> x = new ArrayList<>();//可重複，資料按照key進去的順序
		// HashSet<Integer> x = new HashSet<>();//不重複，隨機
		// TreeSet<Integer> x = new TreeSet<>();//不重複，由小到大
		PriorityQueue<Integer> x = new PriorityQueue<>();//可重複，神秘排列法
		x.add(10);
		x.add(10);
		x.add(30);

		for (int o : x) {
			System.out.print(o + " ");
		}

		x.add(87);
		x.add(69);
		x.add(420);

		System.out.println("\n=============");

		for (int o : x) {
			System.out.print(o + " ");
		}

	}

}
