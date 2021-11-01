package jdbcEX;

public class fkinstrings {
	public static String url = "jdbc:mysql://localhost:3306/gjun";
	public static String user = "root";
	public static String password = "jason4680";
	public static String classforname = "com.mysql.jdbc.Driver";
	public static String ndr = "no driver";
	public static String ncn = "no driver";

	public static void fkinE(String s) {
		System.out.println(s);
	}

	public static void myFor(String s) {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(200);
				System.out.println("i = " + i + "\t" + s);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
