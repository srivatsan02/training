package Inventory;
import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class JdbcFactory {
	private JdbcFactory() {

	}

	public static Connection getConnection() throws Exception {

		String url = "jdbc:mysql://localhost:3306/sri";
		DriverManager.registerDriver(new Driver());
		Connection conn = DriverManager.getConnection(url, "root", "12345");
		return conn;

	}

}