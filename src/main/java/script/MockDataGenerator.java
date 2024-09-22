package script;

import controller.DatabaseController;

public class MockDataGenerator {
    DatabaseController databaseController = new DatabaseController();
    public void generateMockData() {
        databaseController.insertDenomination(1, "TRY", 0.1);
        databaseController.insertDenomination(2, "TRY", 0.5);
        databaseController.insertDenomination(3, "TRY", 1);
        databaseController.insertDenomination(4, "TRY", 5);
        databaseController.insertDenomination(5, "TRY", 10);
        databaseController.insertDenomination(6, "TRY", 20);
        databaseController.insertDenomination(7, "TRY", 50);
        databaseController.insertDenomination(8, "TRY", 100);
        databaseController.insertDenomination(9, "TRY", 200);

        databaseController.insertProduct(1, "myProduct1", 1.99);
        databaseController.insertProduct(2, "myProduct2", 2.99);
        databaseController.insertProduct(3, "myProduct3", 3.99);
        databaseController.insertProduct(4, "myProduct4", 4.99);
        databaseController.insertProduct(5, "myProduct5", 5.99);

        databaseController.insertVendingMachine(1,"myVendingMachine1", 3, 11, 9, 99);
        databaseController.insertVendingMachine(2,"myVendingMachine2", 3, 11, 9, 99);

        databaseController.insertDenominationToVendingMachine(1,1,1,10);
        databaseController.insertDenominationToVendingMachine(1,2,2,10);
        databaseController.insertDenominationToVendingMachine(1,3,3,10);
        databaseController.insertDenominationToVendingMachine(2,1,1,10);
        databaseController.insertDenominationToVendingMachine(2,2,2,10);
        databaseController.insertDenominationToVendingMachine(2,3,3,10);

        databaseController.insertProductToVendingMachine(1, 1, 1, 10);
        databaseController.insertProductToVendingMachine(1, 2, 2, 10);
        databaseController.insertProductToVendingMachine(1, 3, 3, 10);
        databaseController.insertProductToVendingMachine(2, 1, 1, 10);
        databaseController.insertProductToVendingMachine(2, 2, 2, 10);
        databaseController.insertProductToVendingMachine(2, 3, 3, 10);
    }

}
