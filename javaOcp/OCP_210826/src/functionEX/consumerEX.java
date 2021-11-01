package functionEX;

import java.util.function.Consumer;

class cal2 {
	static void p1(String t) {
		if (t.equals("abc")) {
			System.out.println(t.equals("abc"));	
		}else {
			System.out.println(t.equals("abc"));
		}		
	}
}

public class consumerEX {

	public static void main(String[] args) {
		Consumer<String> c1 = new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t);
			}
		};
		Consumer<String> c2 = t -> System.out.println(t);
		Consumer<String> c3 = cal2::p1;
		Consumer<String> c4 = System.out::println;
		
		c1.accept("MAAA");
		c2.accept("POOOOMAAA");
		c3.accept("abc");
		c4.accept("abc");
		
	}
}
