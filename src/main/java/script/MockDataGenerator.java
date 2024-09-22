package script;

import controller.DatabaseController;

public class MockDataGenerator {
    DatabaseController databaseController = new DatabaseController();

    public void generateMockDenominationData() {
        databaseController.insertDenominationToTable(1, "TRY", 0.1);
        databaseController.insertDenominationToTable(2, "TRY", 0.5);
        databaseController.insertDenominationToTable(3, "TRY", 1);
        databaseController.insertDenominationToTable(4, "TRY", 5);
        databaseController.insertDenominationToTable(5, "TRY", 10);
        databaseController.insertDenominationToTable(6, "TRY", 20);
        databaseController.insertDenominationToTable(7, "TRY", 50);
        databaseController.insertDenominationToTable(8, "TRY", 100);
        databaseController.insertDenominationToTable(9, "TRY", 200);
    }

    public void generateMockProductData() {
        databaseController.insertProductToTable(1, "myProduct1", 1.99);
        databaseController.insertProductToTable(2, "myProduct2", 2.99);
        databaseController.insertProductToTable(3, "myProduct3", 3.99);
        databaseController.insertProductToTable(4, "myProduct4", 4.99);
        databaseController.insertProductToTable(5, "myProduct5", 5.99);
    }

    public void generateMockVendingMachineData() {
        databaseController.insertVendingMachineToTable(1,"myVendingMachine1", 5, 11, 9, 99);
        databaseController.insertDenominationOfVendingMachineTable(1,1,1,10);
        databaseController.insertDenominationOfVendingMachineTable(1,2,2,10);
        databaseController.insertDenominationOfVendingMachineTable(1,3,3,10);
        databaseController.insertProductOfVendingMachineTable(1, 1, 1, 10);
        databaseController.insertProductOfVendingMachineTable(1, 2, 2, 10);
        databaseController.insertProductOfVendingMachineTable(1, 3, 3, 10);
    }
}
