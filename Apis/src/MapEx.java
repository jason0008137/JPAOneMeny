import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();
		Integer I = 30;

		m.put("Amy", 10);
		System.out.println("SSS");
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		System.out.print(m.get(n));
	}
}
