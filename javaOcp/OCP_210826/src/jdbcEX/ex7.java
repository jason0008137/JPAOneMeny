package jdbcEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ex7 {

	public static void main(String[] args) {
		String SQL = "update member set name = ?, address = ? where id = ?;";
		
		try {
			Class.forName(fkinstrings.classforname);
			Connection conn = DriverManager.getConnection(fkinstrings.url,fkinstrings.user,fkinstrings.password);
			PreparedStatement ps = conn.prepareStatement(SQL);
			
			ps.setString(1, "Oof");
			ps.setString(2, "Ooooof");
			ps.setInt(3, 7);
			
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
