package javaAPI;

public class stingBuilderEX {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("A dog");
		System.out.println(sb);
//		System.out.println(sb.append("AAA"));
//		System.out.println(sb.append(sb));
		System.out.println(sb.indexOf("d"));
		System.out.println(sb.insert(2, "d"));
		System.out.println(sb.replace(0, 3, "CAT"));
		System.out.println(sb.substring(0, 2));
		System.out.println(sb.delete(1, 2));
		String s = sb.toString();
		System.out.println(s);
		
		

	}

}
