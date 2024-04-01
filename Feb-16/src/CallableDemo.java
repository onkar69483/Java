import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.CallableStatement;


public class CallableDemo {
	private static Connection conn;
    private static Statement stmt;

    public static void main(String[] args) {
        try {
            // Establish database connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "Onkar", "Prem@1234");
            stmt = conn.createStatement();
            System.out.println("Connection Successsful!");
            String query = "{call proc3}";
            CallableStatement stmt = conn.prepareCall(query);
            ResultSet rs = stmt.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Name of Table: "+rsmd.getTableName(1));
            System.out.print(rsmd.getColumnName(1));
            System.out.print("	"+rsmd.getColumnName(2));
            System.out.println("		"+rsmd.getColumnName(3));
            while(rs.next()) {
            		System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"		"+rs.getString(3));
            }

        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }				
}
}
