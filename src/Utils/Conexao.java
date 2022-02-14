package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection conectar() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/devs2blu";
		String user = "root";
		String password = "1234";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("SQLException: " + ex.getMessage());
		}
		return con;
	}

}
