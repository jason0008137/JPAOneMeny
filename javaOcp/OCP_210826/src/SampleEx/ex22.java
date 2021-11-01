package SampleEx;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class ex22 {

	public static void main(String[] args) {

		ResourceBundle resource = ResourceBundle.getBundle("Greetings", Locale.US);
		System.out.println(resource.getObject("HELLO_MSG"));
	}
}
