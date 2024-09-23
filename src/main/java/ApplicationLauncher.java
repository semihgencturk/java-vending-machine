import database.DatabaseBuilder;
import database.DatabaseConnector;
import controller.DenominationController;
import controller.ProductController;
import controller.VendingMachineController;
import script.MockDataGenerator;
import view.GreetingView;


public class ApplicationLauncher {
    public static void main(String[] args) {
        DenominationController denominationController = new DenominationController();
        ProductController productController = new ProductController();
        VendingMachineController vendingMachineController = new VendingMachineController();

        DatabaseConnector databaseConnector = new DatabaseConnector();
        DatabaseBuilder databaseBuilder = new DatabaseBuilder();

        // Connecting to the database
        databaseConnector.createDerbyDatabaseConnection();

        // Create Table in the Database
        databaseBuilder.createDatabaseTable();

        // Insert Mock Data To Table
        MockDataGenerator mockDataGenerator = new MockDataGenerator();
        mockDataGenerator.generateMockData();

        // Application Interface
        GreetingView greetingView = new GreetingView();
        greetingView.getGreetingView();

        // Drop Table From The Memory
        vendingMachineController.dropDenominationOfVendingMachineTable();
        vendingMachineController.dropProductOfVendingMachineTable();
        vendingMachineController.dropVendingMachineTable();
        denominationController.dropDenominationTable();
        productController.dropProductTable();
    }
}
