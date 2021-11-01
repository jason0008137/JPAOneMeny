package SampleEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex28 {
	public static void main(String[] args) {
		// code to load and register valid jdbc driver go here
		String url = "jdbc:mysql://localhost:3306/extest";
		String user = "root";
		String password = "jason4680";

		Connection con;
		try {
			con = DriverManager.getConnection(url, user, password);

			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			st.execute("select * from student");
			ResultSet rs = st.getResultSet();
			if (rs.next()) {
				rs.absolute(1);
//				rs.moveToInsertRow();
//				rs.updateInt(1, 113);
//				rs.updateString(2, "jane@uni.com");
//				rs.updateRow();
//				rs.refreshRow();
//				System.out.println(rs.getInt(1)
//						+ " : " + rs.getString(2)
//						+ " : " + rs.getString(3));

				System.out.println(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error OOOHHH");
		}
	}
}
