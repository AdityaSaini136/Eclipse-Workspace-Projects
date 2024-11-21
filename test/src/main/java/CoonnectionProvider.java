import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CoonnectionProvider {
	

	private static String url="jdbc:mysql://localhost:3306/test?useSSL=false";
	private static String user="root";
	private static String password ="root";
	static Connection connection;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
