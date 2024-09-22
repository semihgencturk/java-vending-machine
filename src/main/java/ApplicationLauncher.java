import controller.DatabaseController;
import script.MockDataGenerator;
import view.GreetingView;


public class ApplicationLauncher {
    public static void main(String[] args) {
        DatabaseController databaseController = new DatabaseController();

        // Connecting to the database
        databaseController.createConnection();

        // Create Table in the Database
        databaseController.createDenominationTable();
        databaseController.createProductTable();
        databaseController.createVendingMachineTable();
        databaseController.createDenominationOfVendingMachineTable();
        databaseController.createProductOfVendingMachineTable();

        // Create And Insert Mock Data To Table
        MockDataGenerator mockDataGenerator = new MockDataGenerator();
        mockDataGenerator.generateMockData();

        // Application Interface
        GreetingView greetingView = new GreetingView();
        greetingView.getGreetingView();

        // Drop Table From The Memory
        databaseController.dropDenominationOfVendingMachineTable();
        databaseController.dropProductOfVendingMachineTable();
        databaseController.dropDenominationTable();
        databaseController.dropProductTable();
        databaseController.dropVendingMachineTable();


    }
}
