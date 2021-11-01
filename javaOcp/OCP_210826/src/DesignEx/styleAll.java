package DesignEx;

public class styleAll {

	private static style1 s1;
	private static style2 s2;

//	public styleAll() {
//		super();
//		s1 = new style1();
//		s2 = new style2();
//	}

	public static style1 getS1() {
		return s1;
	}

	public static void setS1(style1 s1) {
		styleAll.s1 = s1;
	}

	public static style2 getS2() {
		return s2;
	}

	public static void setS2(style2 s2) {
		styleAll.s2 = s2;
	}

}
