package collectionEX;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class ex2 {

	public static void main(String[] args) {
		// ArrayList<Integer> x = new ArrayList<>();//�i���ơA��ƫ���key�i�h������
		// HashSet<Integer> x = new HashSet<>();//�����ơA�H��
		// TreeSet<Integer> x = new TreeSet<>();//�����ơA�Ѥp��j
		PriorityQueue<Integer> x = new PriorityQueue<>();//�i���ơA�����ƦC�k
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
