package jdbcEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex3 {

	public static void main(String[] args) {

		// String SQL = "SELECT * from member";
		String SQL = "select * from member where name=?";
		String SQL1 = "select * from member where name='AAA'";

		try {
			Class.forName(fkinstrings.classforname);
			Connection conn = DriverManager.getConnection(fkinstrings.url, fkinstrings.user, fkinstrings.password);
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL1);

			/*PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, "AAA");
			ResultSet rs = ps.executeQuery();*/

			while (rs.next()) {

				System.out.println(rs.getInt("id")
						+ "\t" + rs.getString("name")
						+ "\t" + rs.getString("address")
						+ "\t" + rs.getString("mobile"));
			}

		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}

	}

}
