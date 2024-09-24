package view;

import controller.DenominationDatabaseController;
import controller.ProductDatabaseController;
import controller.VendingMachineController;
import controller.VendingMachineDatabaseController;
import model.Product;
import model.VendingMachine;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionView {
    public void getCustomerTransactionView(int vendingMachineId, int productStorageUnit) throws SQLException {
        Scanner myScanner = new Scanner(System.in);
        VendingMachineDatabaseController vendingMachineDatabaseController = new VendingMachineDatabaseController();
        ProductDatabaseController productController = new ProductDatabaseController();
        DenominationDatabaseController denominationController = new DenominationDatabaseController();
        VendingMachineController vendingMachineController = new VendingMachineController();

        // Get the vending machine according to given id
        VendingMachine vendingMachine = vendingMachineDatabaseController.getVendingMachineById(vendingMachineId);

        // Get and show the product price corresponds to the given vendingMachine and productStorageUnit
        int productId = vendingMachine.getProductsOnSale().get(productStorageUnit);
        Product product = productController.getProductById(productId);
        double purchaseAmount = product.getProductPrice();
        System.out.println("The Amount:" + purchaseAmount);

        // Get the valid denominations for the selected vending machine and get denominations from the user for purchasing
        System.out.println("Enter The Denominations: ");
        int totalDenominationStorageUnitNumber = vendingMachine.getTotalDenominationStorageUnitCount();
        double totalAddedDenominationAmount = 0;
        for (int denominationStorageUnit = 1; denominationStorageUnit <= totalDenominationStorageUnitNumber; denominationStorageUnit++) {
            double denominationAmount = denominationController.getDenominationById(vendingMachine.getDenominationsOnUsage().get(denominationStorageUnit)).getDenominationAmount();

            System.out.println("Enter the denomination" + denominationAmount);
            int addedDenominationPiece = myScanner.nextInt();

            // Add the denominations of vending machine according to the added denominations by user
            int denominationId = vendingMachine.getDenominationsOnUsage().get(denominationStorageUnit);
            int denominationCountOfVendingMachineBeforeTransaction = vendingMachine.getDenominationsOnUsageAvailability().get(denominationStorageUnit);
            int denominationCountOfVendingMachineAfterTransaction = denominationCountOfVendingMachineBeforeTransaction + addedDenominationPiece;
            vendingMachineDatabaseController.updateDenominationOfVendingMachine(vendingMachineId, denominationStorageUnit, denominationId , denominationCountOfVendingMachineAfterTransaction);

            // Update total added denomination amount according to added denominations
            totalAddedDenominationAmount = totalAddedDenominationAmount + denominationAmount * addedDenominationPiece;
        }

        // Check the added denominations and purchaseAmount to give product or not
        if (totalAddedDenominationAmount >= purchaseAmount) {
            int productOnSaleAvailabilityBeforeTransaction = vendingMachine.getProductsOnSaleAvailability().get(productStorageUnit);
            int productOnSaleAvailabilityAfterTransaction = productOnSaleAvailabilityBeforeTransaction - 1;

            // Update the products of vending machine according to the sold product
            vendingMachineDatabaseController.updateProductOfVendingMachine(vendingMachineId, productStorageUnit, productId , productOnSaleAvailabilityAfterTransaction);
            System.out.println("The product is sold successfully!");

            // Give the change according to difference between added denominations and purchase amount
            vendingMachineController.giveChangeToCustomer(totalAddedDenominationAmount-purchaseAmount, vendingMachine);
            System.out.println("The change is given successfully!");
        } else {
            // Give the all added money without selling the product because of insufficient payment
            vendingMachineController.giveChangeToCustomer(totalAddedDenominationAmount, vendingMachine);
            System.out.println("Added money by customer is returned since of insufficient amount. Please add sufficient money considering purchase amount!");
        }
    }
}
