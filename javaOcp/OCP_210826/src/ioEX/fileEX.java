package ioEX;

import java.io.File;
import java.io.IOException;

public class fileEX {

	public static void main(String[] args) throws IOException {
		File f = new File("E:/createNewFile.txt");

		f.createNewFile();

	}

}
