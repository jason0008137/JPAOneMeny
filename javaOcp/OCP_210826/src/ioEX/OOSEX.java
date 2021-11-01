package ioEX;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OOSEX {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("E:/D.txt"));

		oos.writeObject(new Order("aaa", 6, 8));
		oos.writeObject(new Order("bbb", 5, 4));
		oos.writeObject(new Order("ccc", 3, 7));
		oos.writeObject(new Order("ddd", 9, 2));

		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("E:/D.txt"));

		while (true) {
			try {
				((Order) ois.readObject()).show();
			} catch (java.io.EOFException e) {
				System.out.print("Stoop");
				break;
			}
		}
	}
}
