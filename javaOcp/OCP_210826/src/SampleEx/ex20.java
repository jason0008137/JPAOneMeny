package SampleEx;

import java.util.Locale;
import java.util.ResourceBundle;

public class ex20 {
	public static void main(String[] args) {
//		Locale l1 = new Locale.Builder()
//				.setLanguage("de")
//				.setRegion("DE")
//				.build();
		Locale l1 = new Locale("de", "DE");
		ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", l1);
		System.out.println(rb.getString("inquiry"));

//		Locale currentLocale = Locale.getInstance(Locale.GERMAN, Locale.GERMANY);

	}

}
