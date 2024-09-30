import database.DatabaseBuilder;
import database.DatabaseConnector;
import script.MockDataManager;
import view.GreetingView;
import java.sql.SQLException;

public class ApplicationLauncher {
    public static void main(String[] args) throws SQLException {
        DatabaseConnector databaseConnector = new DatabaseConnector();
        DatabaseBuilder databaseBuilder = new DatabaseBuilder();
        MockDataManager mockDataGenerator = new MockDataManager();
        GreetingView greetingView = new GreetingView();

        databaseConnector.createDerbyDatabaseConnection();


        databaseBuilder.createDatabaseTable();

        mockDataGenerator.insertDatabaseMockData();

        // Vending Machine Application Starter View
        greetingView.getGreetingView();
    }
}
