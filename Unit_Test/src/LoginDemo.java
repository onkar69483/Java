import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Login");
            System.out.println("2. Signup");
            System.out.println("3. Change Password");
            System.out.println("Enter option:");
            int option = sc.nextInt();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flexi", "Onkar", "Prem@1234");
            System.out.println("Connection Established");
            Statement stmt = conn.createStatement();
            
            switch (option) {
                case 1: // Login
                    System.out.println("Enter user name:");
                    String unameLogin = sc.next();
                    System.out.println("Enter password:");
                    String passLogin = sc.next();
                    login(stmt, unameLogin, passLogin);
                    break;
                case 2: // Signup
                    System.out.println("Enter user name:");
                    String unameSignup = sc.next();
                    System.out.println("Enter password:");
                    String passSignup = sc.next();
                    signup(stmt, unameSignup, passSignup);
                    break;
                case 3: // Change Password
                    System.out.println("Enter user name:");
                    String unameChange = sc.next();
                    System.out.println("Enter current password:");
                    String currentPass = sc.next();
                    System.out.println("Enter new password:");
                    String newPass = sc.next();
                    changePassword(stmt, unameChange, currentPass, newPass);
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void login(Statement stmt, String uname, String pass) throws Exception {
        ResultSet rs = stmt.executeQuery("SELECT * FROM login");
        boolean login = false;
        while (rs.next()) {
            if (uname.equals(rs.getString("uname")) && pass.equals(rs.getString("pass"))) {
                login = true;
                break;
            }
        }
        if (login) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Unsuccessful");
        }
    }

    private static void signup(Statement stmt, String uname, String pass) throws Exception {
        String query = "INSERT INTO login (uname, pass) VALUES ('" + uname + "', '" + pass + "')";
        int rowsAffected = stmt.executeUpdate(query);
        if (rowsAffected > 0) {
            System.out.println("Registered Successfully");
        } else
            System.out.println("Registration Failed");
        }
    }

    private static void changePassword(Statement stmt, String uname, String currentPass, String newPass) throws Exception {
        ResultSet rs = stmt.executeQuery("SELECT * FROM login WHERE uname='" + uname + "' AND pass='" + currentPass + "'");
        if (rs.next()) {
            String updateQuery = "UPDATE login SET pass='" + newPass + "' WHERE uname='" + uname + "'";
            int rowsAffected = stmt.executeUpdate(updateQuery);
            if (rowsAffected > 0) {
                System.out.println("Password changed successfully");
            } else {
                System.out.println("Failed to change password");
            }
        } else {
            System.out.println("Invalid user or password");
        }
    }
}
