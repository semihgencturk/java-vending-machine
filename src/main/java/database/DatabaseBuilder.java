package database;

import controller.DenominationController;
import controller.ProductController;
import controller.VendingMachineController;

import java.sql.SQLException;

public class DatabaseBuilder {
    DenominationController denominationController = new DenominationController();
    ProductController productController = new ProductController();
    VendingMachineController vendingMachineController = new VendingMachineController();

    public void createDatabaseTable() throws SQLException {
        denominationController.createDenominationTable();
        productController.createProductTable();
        vendingMachineController.createVendingMachineTable();
        vendingMachineController.createDenominationOfVendingMachineTable();
        vendingMachineController.createProductOfVendingMachineTable();
    }

    public void dropDatabaseTable() throws SQLException {
        vendingMachineController.dropDenominationOfVendingMachineTable();
        vendingMachineController.dropProductOfVendingMachineTable();
        vendingMachineController.dropVendingMachineTable();
        denominationController.dropDenominationTable();
        productController.dropProductTable();
    }
}
