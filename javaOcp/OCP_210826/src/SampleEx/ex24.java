package SampleEx;

import java.util.Locale;
import java.util.ResourceBundle;

public class ex24 {
	public static void main(String[] args) {
		Locale locale = new Locale.Builder()
				.setLanguage("en")
				.setRegion("FR")
				.build();
		Locale.setDefault(locale);
		ResourceBundle resource = ResourceBundle.getBundle("resources.Messages");
		System.out.print(resource.getString("msg"));

	}
}
