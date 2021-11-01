package SampleEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileW {

	public static void main(String[] args) {

		try (FileWriter fw = new FileWriter("E:/createNewFile.txt");) {
			fw.write("dsadsadsda");
//			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
