package script;

import controller.DenominationDatabaseController;
import controller.ProductDatabaseController;
import controller.VendingMachineDatabaseController;
import java.sql.SQLException;

public class MockDataGenerator {
    public void generateMockData() throws SQLException {
        DenominationDatabaseController denominationController = new DenominationDatabaseController();
        ProductDatabaseController productController = new ProductDatabaseController();
        VendingMachineDatabaseController vendingMachineController = new VendingMachineDatabaseController();

        // Insert some predefined denominations to the database
        denominationController.insertDenomination("TRY", 0.1);
        denominationController.insertDenomination("TRY", 0.5);
        denominationController.insertDenomination("TRY", 1);
        denominationController.insertDenomination("TRY", 5);
        denominationController.insertDenomination("TRY", 10);
        denominationController.insertDenomination("TRY", 20);
        denominationController.insertDenomination("TRY", 50);
        denominationController.insertDenomination("TRY", 100);
        denominationController.insertDenomination("TRY", 200);

        // Insert some predefined products to the database
        productController.insertProduct("myProduct1", 1.99);
        productController.insertProduct("myProduct2", 2.99);
        productController.insertProduct("myProduct3", 3.99);
        productController.insertProduct("myProduct4", 4.99);
        productController.insertProduct("myProduct5", 5.99);

        // Insert some predefined vending machines to the database
        vendingMachineController.insertVendingMachine(1,"myVendingMachine1", 3, 11, 9, 99);
        vendingMachineController.insertVendingMachine(2,"myVendingMachine2", 3, 11, 9, 99);

        // Insert some predefined denominations of vending machine to the database
        vendingMachineController.insertDenominationToVendingMachine(1,1,1,10);
        vendingMachineController.insertDenominationToVendingMachine(1,2,2,10);
        vendingMachineController.insertDenominationToVendingMachine(1,3,3,10);
        vendingMachineController.insertDenominationToVendingMachine(2,1,1,10);
        vendingMachineController.insertDenominationToVendingMachine(2,2,2,10);
        vendingMachineController.insertDenominationToVendingMachine(2,3,3,10);

        // Insert some predefined products of vending machine to the database
        vendingMachineController.insertProductToVendingMachine(1, 1, 1, 10);
        vendingMachineController.insertProductToVendingMachine(1, 2, 2, 10);
        vendingMachineController.insertProductToVendingMachine(1, 3, 3, 10);
        vendingMachineController.insertProductToVendingMachine(2, 1, 1, 10);
        vendingMachineController.insertProductToVendingMachine(2, 2, 2, 10);
        vendingMachineController.insertProductToVendingMachine(2, 3, 3, 10);
    }

}
