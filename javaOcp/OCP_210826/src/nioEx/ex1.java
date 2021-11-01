package nioEx;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex1 {

	public static void main(String[] args) {
		String S = "E:/_OCP/txt.txt";
		Path p1 = Paths.get(S);
		Path p2 = Paths.get("E:/A/B/C/D/txt.txt");
		Path p3 = Paths.get("txt.txt");

		System.out.println(p2);
		System.out.println(p2.getFileName());
		System.out.println(p2.getParent());
		System.out.println(p2.getRoot());
		System.out.println(p2.getNameCount());
		System.out.println(p2.isAbsolute());
		System.out.println(p3.toAbsolutePath());
		System.out.println(p2.toUri());
		System.out.println("");

		System.out.println(p2.subpath(0, 3));
		System.out.println("");

		System.out.println(p2.resolve("EEE"));
		System.out.println(p2.resolve("/EEE"));
		System.out.println("");

		// 這裡不太懂耶
		Path p4 = Paths.get("A");
		System.out.println(p4);
		Path p5 = Paths.get("B");
		System.out.println(p4.relativize(p5));
		System.out.println(p5.relativize(p4));
		System.out.println("");
		//

		System.out.println(Files.exists(p1, LinkOption.NOFOLLOW_LINKS));
		System.out.println(Files.notExists(p1, LinkOption.NOFOLLOW_LINKS));

	}

}
