package jdbcEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex4 {

	public static void main(String[] args) {
		String SQL = "insert into porder(name,lcd,ram,mouse,sum) values(?,?,?,?,?)";

		try {
			Class.forName(fkinstrings.classforname);
			Connection conn = DriverManager.getConnection(fkinstrings.url, fkinstrings.user, fkinstrings.password);
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, "nmsl");
			ps.setString(2, "4");
			ps.setString(3, "2");
			ps.setString(4, "6");
			ps.setString(5, "64");

			ps.executeUpdate();
			System.out.println("YPPP");
		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}
	}

}
