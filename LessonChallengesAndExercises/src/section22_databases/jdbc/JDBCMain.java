package section22_databases.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JDBCMain {

    private final static String CONN_STR = "jdbc:mysql://localhost:3306/music";

    public static void main(String[] args) throws SQLException {
        List<String> dbCredentials = getCredentials();

        try (Connection conn = DriverManager.getConnection(CONN_STR, dbCredentials.get(0), dbCredentials.get(1))) {
            System.out.println("Connection with 'music' db successfully created.");
            dbCredentials.set(1, ""); // Resets password to empty string for security purposes.
            dbCredentials.set(0, ""); // Resets username to empty string for security purposes.
        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }

    public static List<String> getCredentials() {
        List<String> credentials = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your username: ");
        String username = scanner.nextLine();
        credentials.add(username);

        System.out.println("Please provide your password: ");
        String password = scanner.nextLine();
        credentials.add(password);

        return credentials;
    }
}
