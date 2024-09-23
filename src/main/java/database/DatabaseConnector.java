package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
    public static Connection connection = null;
    public void createDerbyDatabaseConnection(){
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            connection = DriverManager.getConnection("jdbc:derby:myDB;create=true;user=me;password=mine");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
