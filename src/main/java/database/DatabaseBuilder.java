package database;

import controller.DenominationDatabaseController;
import controller.ProductDatabaseController;
import controller.VendingMachineDatabaseController;
import java.sql.SQLException;

public class DatabaseBuilder {
    DenominationDatabaseController denominationController = new DenominationDatabaseController();
    ProductDatabaseController productController = new ProductDatabaseController();
    VendingMachineDatabaseController vendingMachineController = new VendingMachineDatabaseController();

    // Create all necessary tables for entities in the project
    public void createDatabaseTable() throws SQLException {
        denominationController.createDenominationTable();
        productController.createProductTable();
        vendingMachineController.createVendingMachineTable();
        vendingMachineController.createDenominationOfVendingMachineTable();
        vendingMachineController.createProductOfVendingMachineTable();
    }

    // Drop all tables in the database
    public void dropDatabaseTable() throws SQLException {
        vendingMachineController.dropDenominationOfVendingMachineTable();
        vendingMachineController.dropProductOfVendingMachineTable();
        vendingMachineController.dropVendingMachineTable();
        denominationController.dropDenominationTable();
        productController.dropProductTable();
    }
}
