package SampleEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ex31 {
	public static void main(String[] args) {

		String dbURL = "jdbc:mysql://localhost:3306/extest";
		String userName = "root";
		String passWord = "jason4680";
		String query = "DELETE FROM Student2 WHERE id=103";
		String query2 = "select * FROM Student2 WHERE id=102";

		Connection conn;
		try {
			conn = DriverManager.getConnection(dbURL, userName, passWord);
			Statement st = conn.createStatement();
			System.out.println("Status: " + st.execute(query2));
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
