import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import com.mysql.cj.jdbc.CallableStatement;

public class LoginDemo {
    private static Connection conn;
    private static Statement stmt;

    public static void main(String[] args) {
        try {
            // Establish database connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flexi", "Onkar", "Prem@1234");
            stmt = conn.createStatement();

            // Create and show the UI
            SwingUtilities.invokeLater(LoginDemo::createAndShowUI);
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }				
    }

    private static void createAndShowUI() {
        JFrame frame = new JFrame("Login Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;	
        constraints.insets = new Insets(5, 5, 5, 5);

        // Add components to the panel
        panel.add(new JLabel("Username:"), constraints);
        constraints.gridy++;
        JTextField usernameField = new JTextField(20);
        panel.add(usernameField, constraints);
        constraints.gridy++;
        panel.add(new JLabel("Password:"), constraints);
        constraints.gridy++;
        JPasswordField passwordField = new JPasswordField(20);
        panel.add(passwordField, constraints);
        constraints.gridy++;
        JButton loginButton = new JButton("Login");
        panel.add(loginButton, constraints);
        constraints.gridy++;
        JButton signupButton = new JButton("Signup");
        panel.add(signupButton, constraints);
        constraints.gridy++;
        JButton changePasswordButton = new JButton("Change Password");
        panel.add(changePasswordButton, constraints);

        // Add action listeners to buttons
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            try {
                ResultSet rs = stmt.executeQuery("SELECT * FROM login WHERE uname='" + username + "' AND pass='" + password + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(frame, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(frame, "Login Unsuccessful", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                System.out.println("SQL Error: " + ex.getMessage());
            }
        });

        signupButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            try {
                int rowsAffected = stmt.executeUpdate("INSERT INTO login (uname, pass) VALUES ('" + username + "', '" + password + "')");
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(frame, "Registered Successfully");
                } else {
                    JOptionPane.showMessageDialog(frame, "Registration Failed", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                System.out.println("SQL Error: " + ex.getMessage());
            }
        });

        changePasswordButton.addActionListener(e -> {
            String username = usernameField.getText();
            String currentPassword = new String(passwordField.getPassword());
            String newPassword = JOptionPane.showInputDialog(frame, "Enter new password:");
            try {
                int rowsAffected = stmt.executeUpdate("UPDATE login SET pass='" + newPassword + "' WHERE uname='" + username + "' AND pass='" + currentPassword + "'");
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(frame, "Password changed successfully");
                } else {
                    JOptionPane.showMessageDialog(frame, "Failed to change password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                System.out.println("SQL Error: " + ex.getMessage());
            }
        });

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
    }
}
