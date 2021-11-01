package SampleEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex27 {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/extest";
		String userName = "root";
		String passWord = "jason4680";
		String query = "SELECT * FROM employee WHERE ID=110";

		Connection conn;
		try {
			conn = DriverManager.getConnection(dbURL, userName, passWord);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next()) {
				System.out.println("Employee ID:" + rs.getInt("ID"));
			}
//			while (rs.next()) {
//				System.out.println("Employee ID:" + rs.getInt("ID"));
//			}
		} catch (SQLException e) {
			System.out.println("Error");
		} catch (Exception se) {
			System.out.println("Error OOOHHH");
		}
	}
}
