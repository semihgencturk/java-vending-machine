import database.DatabaseBuilder;
import database.DatabaseConnector;
import script.MockDataGenerator;
import view.GreetingView;

public class ApplicationLauncher {
    public static void main(String[] args) {
        DatabaseConnector databaseConnector = new DatabaseConnector();
        DatabaseBuilder databaseBuilder = new DatabaseBuilder();
        MockDataGenerator mockDataGenerator = new MockDataGenerator();
        GreetingView greetingView = new GreetingView();

        // Connecting to the database
        databaseConnector.createDerbyDatabaseConnection();

        // Create table in the database
        databaseBuilder.createDatabaseTable();

        // Insert mock data to the database
        mockDataGenerator.generateMockData();

        // Application Interface
        greetingView.getGreetingView();

        // Drop Table From The Memory
        databaseBuilder.dropDatabaseTable();
    }
}
