package wien.codersbay.rg.personalbuero.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private ConnectionManager() {

    }

    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/employee", "root", "");
        }
        return connection;
    }
}
