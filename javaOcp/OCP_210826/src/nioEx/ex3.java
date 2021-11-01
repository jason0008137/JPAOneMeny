package nioEx;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex3 {

	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("E:/_OCP");

		DirectoryStream<Path> t = Files.newDirectoryStream(p1, "*");
		System.out.println(t);

		for (Path path : t) {
			System.out.println(path);
		}

	}

}
