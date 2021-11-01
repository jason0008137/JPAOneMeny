package nioEx;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ex4 {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("E:/_OCP/nio/2.txt");
		Charset cs = Charset.defaultCharset();
		
		List<String> l = Files.readAllLines(p);
		
		Path p2 = Paths.get("E:/_OCP/nio/3.html").toAbsolutePath();
		Files.write(p2, l, cs,StandardOpenOption.TRUNCATE_EXISTING);
		System.out.println("Done");
		
	}
}
