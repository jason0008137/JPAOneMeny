package ioEX;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class fileOutputStreamEX {

	public static void main(String[] args) throws IOException {
		//FileOutputStream fos = new FileOutputStream("E:/B.txt");

		// fos.write(65);

		//OutputStreamWriter osw = new OutputStreamWriter(fos);

		BufferedWriter bw =
				new BufferedWriter(
				new OutputStreamWriter(
				new FileOutputStream("E:/C.txt")));

		bw.write("fdsafdsa");
		bw.close();
	}

}
