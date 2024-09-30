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
    VendingMachineDatabaseController vendingMachineDatabaseController = new VendingMachineDatabaseController();

    // Drop all tables in the database
    public void dropDatabaseTable() throws SQLException{
        try {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, "ME", "%", null);
            while (resultSet.next()) {
                switch(resultSet.getString(3)) {
                    case "DENOMINATION":
                        vendingMachineDatabaseController.dropDenominationOfVendingMachineTable();
                        break;
                    case "PRODUCT":
                        vendingMachineDatabaseController.dropProductOfVendingMachineTable();
                        break;
                    case "VENDING_MACHINE":
                        vendingMachineDatabaseController.dropVendingMachineTable();
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

        // Drop database before creating if the table exist in the database from previous session
        dropDatabaseTable();

        denominationController.createDenominationTable();
        productController.createProductTable();
        vendingMachineDatabaseController.createVendingMachineTable();
        vendingMachineDatabaseController.createDenominationOfVendingMachineTable();
        vendingMachineDatabaseController.createProductOfVendingMachineTable();
    }
}
