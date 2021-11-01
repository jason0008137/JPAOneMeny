package ioEX;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("E:/createNewFile.txt");
		fw.write("AAAAA");
		fw.close();
	}
}
