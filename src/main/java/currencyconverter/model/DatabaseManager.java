package currencyconverter.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    private DatabaseManager() {
    }

    private static final String DB_URL = DatabaseManager.class.getClassLoader()
                                                              .getResource("currencydb")
                                                              .getPath();

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:" + DB_URL);
    }
}