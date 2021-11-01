package javaAPI;

import java.util.Locale;

public class LocaleEx {
	public static void main(String[] args) {
		Locale l = Locale.getDefault();
		System.out.println(l.getDisplayCountry());
		System.out.println(l.getDisplayLanguage());
		
		Locale l1 = Locale.ITALY;
		System.out.println(l1.getDisplayCountry());
		System.out.println(l1.getDisplayLanguage());
	}
}
