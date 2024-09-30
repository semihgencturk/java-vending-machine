package script;

import controller.DenominationDatabaseController;
import controller.ProductDatabaseController;
import controller.VendingMachineDatabaseController;
import java.sql.SQLException;

public class MockDataManager {
    public void insertDatabaseMockData() throws SQLException {
        DenominationDatabaseController denominationController = new DenominationDatabaseController();
        ProductDatabaseController productController = new ProductDatabaseController();
        VendingMachineDatabaseController vendingMachineDatabaseController = new VendingMachineDatabaseController();

        // Insert some mock denominations to the database
        denominationController.insertDenomination("TRY", 0.1);
        denominationController.insertDenomination("TRY", 0.5);
        denominationController.insertDenomination("TRY", 1);
        denominationController.insertDenomination("TRY", 5);
        denominationController.insertDenomination("TRY", 10);
        denominationController.insertDenomination("TRY", 20);
        denominationController.insertDenomination("TRY", 50);
        denominationController.insertDenomination("TRY", 100);
        denominationController.insertDenomination("TRY", 200);

        // Insert some mock products to the database
        productController.insertProduct("myProduct1", 1.99);
        productController.insertProduct("myProduct2", 2.99);
        productController.insertProduct("myProduct3", 3.99);
        productController.insertProduct("myProduct4", 4.99);
        productController.insertProduct("myProduct5", 5.99);

        // Insert some mock vending machines to the database
        vendingMachineDatabaseController.insertVendingMachine("myVendingMachine1", 3, 11, 3, 99);
        vendingMachineDatabaseController.insertVendingMachine("myVendingMachine2", 3, 11, 3, 99);

        // Insert some mock denominations of vending machine to the database
        vendingMachineDatabaseController.insertDenominationToVendingMachine(1,1,1,10);
        vendingMachineDatabaseController.insertDenominationToVendingMachine(1,2,2,10);
        vendingMachineDatabaseController.insertDenominationToVendingMachine(1,3,3,10);
        vendingMachineDatabaseController.insertDenominationToVendingMachine(2,1,1,10);
        vendingMachineDatabaseController.insertDenominationToVendingMachine(2,2,2,10);
        vendingMachineDatabaseController.insertDenominationToVendingMachine(2,3,3,10);

        // Insert some mock products of vending machine to the database
        vendingMachineDatabaseController.insertProductToVendingMachine(1, 1, 1, 10);
        vendingMachineDatabaseController.insertProductToVendingMachine(1, 2, 2, 10);
        vendingMachineDatabaseController.insertProductToVendingMachine(1, 3, 3, 10);
        vendingMachineDatabaseController.insertProductToVendingMachine(2, 1, 1, 10);
        vendingMachineDatabaseController.insertProductToVendingMachine(2, 2, 2, 10);
        vendingMachineDatabaseController.insertProductToVendingMachine(2, 3, 3, 10);
    }

}
