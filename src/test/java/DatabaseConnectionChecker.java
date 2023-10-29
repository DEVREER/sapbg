import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionChecker {
    public static void main(String[] args) {
        // JDBC URL, username, and password of PostgreSQL server
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "invoiceparola123";

        try {
            // Register the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Check if the connection is successful
            if (connection != null) {
                System.out.println("Connection to the database has been established.");
                connection.close();
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed. Check your connection parameters.");
            e.printStackTrace();
        }
    }
}
