package database;

import controller.DenominationController;
import controller.ProductController;
import controller.VendingMachineController;

public class DatabaseBuilder {
    public void createDatabaseTable() {
        DenominationController denominationController = new DenominationController();
        ProductController productController = new ProductController();
        VendingMachineController vendingMachineController = new VendingMachineController();

        // Create Table in the Database
        denominationController.createDenominationTable();
        productController.createProductTable();
        vendingMachineController.createVendingMachineTable();
        vendingMachineController.createDenominationOfVendingMachineTable();
        vendingMachineController.createProductOfVendingMachineTable();
    }
}
