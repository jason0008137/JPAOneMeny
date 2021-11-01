package javaAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class test4 {

	public static void main(String[] args) throws IOException {

//		Stream<Path> stream = Files.find(Paths.get("customers.txt"));
//		stream.forEach(c -> System.out.println(c));

		Stream<String> lines = Files.lines(Paths.get("E:/_OCP/nio/2.txt"));
		lines.forEach(c -> System.out.println(c));

//		Stream<String> stream = Files.find(Paths.get("customers.txt"));
//		stream.forEach((String c) -> System.out.println(c));
	}
}
