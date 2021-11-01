package SampleEx;

import java.text.NumberFormat;
import java.util.Locale;

public class ex19 {
	public static void main(String[] args) {
		double d = 15.0;		
		Locale l = new Locale("en", "US");
		NumberFormat f = NumberFormat.getCurrencyInstance(l);
		
		
//		double d = 15;
//		Locale l = new Locale("en", "US");
//		NumberFormat formatter = NumberFormat.getCurrencyInstance(l);
//		System.out.println(formatter.format(d));
	}
}
