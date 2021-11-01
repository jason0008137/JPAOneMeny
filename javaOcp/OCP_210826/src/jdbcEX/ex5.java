package jdbcEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex5 {//Åª¨ú©N©N©N

	public static void main(String[] args) {

		String SQL = "SELECT * FROM gjun.porder order by sum desc";

		try {
			Class.forName(fkinstrings.classforname);
			Connection conn = DriverManager.getConnection(fkinstrings.url, fkinstrings.user, fkinstrings.password);
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt("ID")
						+ "\t" + rs.getString("name")
						+ "\t" + rs.getString("lcd")
						+ "\t" + rs.getString("ram")
						+ "\t" + rs.getString("mouse")
						+ "\t" + rs.getString("sum"));				
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
