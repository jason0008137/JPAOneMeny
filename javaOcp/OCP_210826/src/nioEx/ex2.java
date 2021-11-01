package nioEx;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ex2 {

	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("E:/_OCP/nio/txt.html");
		URL url = URI.create("Http://www.google.com").toURL();

		InputStream fo = url.openStream();

		Files.copy(fo, p1,StandardCopyOption.REPLACE_EXISTING);
		
	System.out.print("Done");

	}

}
