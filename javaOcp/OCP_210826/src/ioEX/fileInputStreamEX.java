package ioEX;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class fileInputStreamEX {

	public static void main(String[] args) throws IOException {
		//FileInputStream fis = new FileInputStream("E:/C.txt");
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream("E:/C.txt"))); 
		
		int i;
		while ((i = br.read()) != -1) {
			System.out.print((char) i);
		}

	}

}
