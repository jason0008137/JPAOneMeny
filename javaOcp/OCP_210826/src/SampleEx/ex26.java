package SampleEx;

import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;

public class ex26 {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/gjcomp2";
		String userName = "root";
		String password = "jason4680";

		Connection con = null;
		try {

//			con = DriverManager.getConnection(userName, password, dbURL);

			Properties prop = new Properties();
			prop.put("user", userName);
			prop.put("password", password);
			con = DriverManager.getConnection(dbURL, prop);

//			con = DriverManager.getConnection(dbURL);
//			con.setClientInfo("user", userName);
//			con.setClientInfo("password", password);

//			Properties prop = new Properties();
//			prop.put("userId", userName);
//			prop.put("password", password);
//			prop.put("url", dbURL);
//			con = DriverManager.getConnection(prop);

			// line n1
			if (con != null) {
				System.out.print("Connection Established.");
			}
		} catch (Exception e) {
			System.out.print(e);
		}

	}
}
