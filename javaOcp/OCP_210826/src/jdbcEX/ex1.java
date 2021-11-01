package jdbcEX;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
//import com.mysql.jdbc.Statement;

public class ex1 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/gjun";
		String user = "root";
		String password = "jason4680";
		String SQL = "insert into member(name,address,mobile) values('PiPi','bigboba','omanko')";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement st = conn.createStatement();
			st.execute(SQL);

		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}

	}

}
