package script;

import controller.DenominationController;
import controller.ProductController;
import controller.VendingMachineController;

public class MockDataGenerator {
    public void generateMockData() {
        DenominationController denominationController = new DenominationController();
        ProductController productController = new ProductController();
        VendingMachineController vendingMachineController = new VendingMachineController();

        denominationController.insertDenomination(1, "TRY", 0.1);
        denominationController.insertDenomination(2, "TRY", 0.5);
        denominationController.insertDenomination(3, "TRY", 1);
        denominationController.insertDenomination(4, "TRY", 5);
        denominationController.insertDenomination(5, "TRY", 10);
        denominationController.insertDenomination(6, "TRY", 20);
        denominationController.insertDenomination(7, "TRY", 50);
        denominationController.insertDenomination(8, "TRY", 100);
        denominationController.insertDenomination(9, "TRY", 200);

        productController.insertProduct(1, "myProduct1", 1.99);
        productController.insertProduct(2, "myProduct2", 2.99);
        productController.insertProduct(3, "myProduct3", 3.99);
        productController.insertProduct(4, "myProduct4", 4.99);
        productController.insertProduct(5, "myProduct5", 5.99);

        vendingMachineController.insertVendingMachine(1,"myVendingMachine1", 3, 11, 9, 99);
        vendingMachineController.insertVendingMachine(2,"myVendingMachine2", 3, 11, 9, 99);

        vendingMachineController.insertDenominationToVendingMachine(1,1,1,10);
        vendingMachineController.insertDenominationToVendingMachine(1,2,2,10);
        vendingMachineController.insertDenominationToVendingMachine(1,3,3,10);
        vendingMachineController.insertDenominationToVendingMachine(2,1,1,10);
        vendingMachineController.insertDenominationToVendingMachine(2,2,2,10);
        vendingMachineController.insertDenominationToVendingMachine(2,3,3,10);

        vendingMachineController.insertProductToVendingMachine(1, 1, 1, 10);
        vendingMachineController.insertProductToVendingMachine(1, 2, 2, 10);
        vendingMachineController.insertProductToVendingMachine(1, 3, 3, 10);
        vendingMachineController.insertProductToVendingMachine(2, 1, 1, 10);
        vendingMachineController.insertProductToVendingMachine(2, 2, 2, 10);
        vendingMachineController.insertProductToVendingMachine(2, 3, 3, 10);
    }

}
