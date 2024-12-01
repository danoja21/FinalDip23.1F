
package employee_ms.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    private static Connection con = null;
    
    public static Connection getConnection() throws SQLException {
        if (con == null) {
            try {
                // Replace with your database URL, username, and password
                String url = "jdbc:mysql://localhost:3306/employee_ms";
                String user = "root";
                String password = "W7301@jqir#";
                
                // Load the JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new SQLException("MySQL JDBC Driver not found.");
            } catch (SQLException e) {
                e.printStackTrace();
                throw e; // Re-throwing the SQLException
            }
        }
        return con;
    }

    // Optional: method to close the connection
    public static void closeConnection() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
