package SampleEx;

import java.util.function.Function;
import java.util.function.Predicate;

interface LengthValidator {
	public boolean checkLength(String str);
}

public class ex34 {
	public static void main(String[] args) {

		System.out.println(
				((Predicate<String>) s -> s.length() > 5 && s.length() < 10)
						.test("Hello"));

//		Predicate<String> f = s -> s.length() > 5 && s.length() < 10;
//		System.out.println(f.test("Hello"));

		boolean res = ((LengthValidator) s -> s.length() > 5 && s.length() < 10)
				.checkLength("Hello");
		
		System.out.println(res);
		
//		LengthValidator l = str -> str.length() > 5 && str.length() < 10;

//		boolean res = l.checkLength("Hello");

//		boolean res = new LengthValidator() {
//			public boolean checkLength(String str) {
//				return str.length() > 5 && str.length() < 10;
//			}
//		}.checkLength("Hello");
	}
}
