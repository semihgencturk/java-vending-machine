package database;

import controller.DenominationDatabaseController;
import controller.ProductDatabaseController;
import controller.VendingMachineDatabaseController;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import static database.DatabaseConnector.connection;

public class DatabaseBuilder {
    DenominationDatabaseController denominationController = new DenominationDatabaseController();
    ProductDatabaseController productController = new ProductDatabaseController();
    VendingMachineDatabaseController vendingMachineController = new VendingMachineDatabaseController();

    // Drop all tables in the database
    public void dropDatabaseTable() throws SQLException{
        try {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, "ME", "%", null);
            while (resultSet.next()) {
                switch(resultSet.getString(3)) {
                    case "DENOMINATION":
                        vendingMachineController.dropDenominationOfVendingMachineTable();
                        break;
                    case "PRODUCT":
                        vendingMachineController.dropProductOfVendingMachineTable();
                        break;
                    case "VENDING_MACHINE":
                        vendingMachineController.dropVendingMachineTable();
                        break;
                    case "DENOMINATION_OF_VENDING_MACHINE":
                        denominationController.dropDenominationTable();
                        break;
                    case "PRODUCT_OF_VENDING_MACHINE":
                        productController.dropProductTable();
                        break;
                    default:
                        break;
                }
            }
            resultSet.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    // Create all necessary tables for entities in the project
    public void createDatabaseTable() throws SQLException {

        dropDatabaseTable();

        denominationController.createDenominationTable();
        productController.createProductTable();
        vendingMachineController.createVendingMachineTable();
        vendingMachineController.createDenominationOfVendingMachineTable();
        vendingMachineController.createProductOfVendingMachineTable();
    }
}
