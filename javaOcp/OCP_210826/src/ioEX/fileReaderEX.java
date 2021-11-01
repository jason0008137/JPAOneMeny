package ioEX;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReaderEX {

	public static void main(String[] args) throws IOException {
		String f1 = "E:/C.txt";
		String f2 = "E:/createNewFile.txt";
		
		FileReader fr = new FileReader(f1);

		// System.out.println((char))

		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
	}
}
