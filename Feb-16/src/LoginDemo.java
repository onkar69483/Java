import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class LoginDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Class named class in java
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flexi","Onkar", "Prem@1234");
			System.out.println("Connection Established");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from login");
			ResultSetMetaData rsMetaData = rs.getMetaData();
			System.out.println(rsMetaData.getColumnName(1) + "	" + rsMetaData.getColumnName(2));
			while(rs.next()) {
				System.out.println(rs.getString(1) + "	" + rs.getString(2));
				
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}