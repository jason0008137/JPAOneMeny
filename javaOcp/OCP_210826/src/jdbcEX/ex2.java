package jdbcEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ex2 {

	public static void main(String[] args) {
		String SQL = "insert into member(name,address,mobile) values(?,?,?)";

		try {
			Class.forName(fkinstrings.classforname);
			Connection conn=DriverManager.getConnection(fkinstrings.url, fkinstrings.user, fkinstrings.password);
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, "aaaa");
			ps.setString(2, "tt");
			ps.setString(3, "222");
			
			ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}

	}

}
