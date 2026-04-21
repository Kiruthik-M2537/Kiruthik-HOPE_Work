import java.sql.*;

public class JDBCConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println(connection.getSchema());
            System.out.println("Connected to the database.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}