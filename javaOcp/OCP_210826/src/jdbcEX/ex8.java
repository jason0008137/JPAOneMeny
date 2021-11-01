package jdbcEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex8 {

	public static void main(String[] args) {
		String SQL = "delete from gjun.member where id = ?;";

		try {
			Class.forName(fkinstrings.classforname);
			Connection conn = DriverManager.getConnection(fkinstrings.url, fkinstrings.user, fkinstrings.password);
			PreparedStatement ps = conn.prepareStatement(SQL);

			ps.setInt(1, 11);

			ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			fkinstrings.fkinE(fkinstrings.ndr);
			e.printStackTrace();
		} catch (SQLException e) {
			fkinstrings.fkinE(fkinstrings.ncn);
			e.printStackTrace();
		}

	}

}
