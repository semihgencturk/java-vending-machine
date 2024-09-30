package view;

import controller.DenominationDatabaseController;
import controller.ProductDatabaseController;
import controller.VendingMachineController;
import controller.VendingMachineDatabaseController;
import model.Product;
import model.vendingMachine.VendingMachine;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionView {
    public void getCustomerTransactionView(int vendingMachineId, int productStorageUnit) throws SQLException {
        Scanner myScanner = new Scanner(System.in);
        VendingMachineDatabaseController vendingMachineDatabaseController = new VendingMachineDatabaseController();
        ProductDatabaseController productController = new ProductDatabaseController();
        DenominationDatabaseController denominationController = new DenominationDatabaseController();
        VendingMachineController vendingMachineController = new VendingMachineController();

        VendingMachine vendingMachine = vendingMachineDatabaseController.getVendingMachineById(vendingMachineId);

        // Get and show the product price corresponds to the given vendingMachine and productStorageUnit
        int productId = vendingMachine.getProductOnSale().get(productStorageUnit).getProduct().getProductId();
        Product product = productController.getProductById(productId);
        double productPrice = product.getProductPrice();
        System.out.println("The amount you should purchase to buy the product:" + productPrice);

        // Get the valid denominations for the selected vending machine and get denominations from the user for purchasing
        System.out.println("Enter The Denominations: ");
        int totalDenominationStorageUnitNumber = vendingMachine.getTotalDenominationStorageUnitCount();
        double totalAddedDenominationAmount = 0;
        for (int denominationStorageUnit = 1; denominationStorageUnit <= totalDenominationStorageUnitNumber; denominationStorageUnit++) {
            double denominationAmount = denominationController.getDenominationById(vendingMachine.getDenominationOnUsage().get(denominationStorageUnit).getDenomination().getDenominationId()).getDenominationAmount();

            System.out.println("How many count of denomination with the amount: " + denominationAmount + "will you add to the machine for purchase? (Expected integer - Example entry: 5)");
            int addedDenominationPiece = myScanner.nextInt();

            // Add the denominations of vending machine according to the added denominations by user
            int denominationId = vendingMachine.getDenominationOnUsage().get(denominationStorageUnit).getDenomination().getDenominationId();
            int denominationCountOfVendingMachineBeforeTransaction = vendingMachine.getDenominationOnUsage().get(denominationStorageUnit).getDenominationCountOnUsage();
            int denominationCountOfVendingMachineAfterTransaction = denominationCountOfVendingMachineBeforeTransaction + addedDenominationPiece;
            vendingMachineDatabaseController.updateDenominationOfVendingMachine(vendingMachineId, denominationStorageUnit, denominationId , denominationCountOfVendingMachineAfterTransaction);

            // Update total added denomination amount according to added denominations
            totalAddedDenominationAmount = totalAddedDenominationAmount + denominationAmount * addedDenominationPiece;
        }

        // Check the added denominations and productPrice to give product or not
        if (totalAddedDenominationAmount >= productPrice) {
            int productStockBeforeSale = vendingMachine.getProductOnSale().get(productStorageUnit).getProductCountOnStock();
            int productStockAfterSale = productStockBeforeSale - 1;

            // Update the products of vending machine according to the sold product
            vendingMachineDatabaseController.updateProductOfVendingMachine(vendingMachineId, productStorageUnit, productId , productStockAfterSale);
            System.out.println("Success! The product is sold successfully!");

            // Give the change according to difference between added denominations and purchase amount
            vendingMachineController.giveChangeToCustomer(totalAddedDenominationAmount-productPrice, vendingMachine);
            System.out.println("Success! The change is given successfully!");
        } else {
            // Give the all added money without selling the product because of insufficient payment
            vendingMachineController.giveChangeToCustomer(totalAddedDenominationAmount, vendingMachine);
            System.out.println("Operation Failed! Added money by customer is returned since of insufficient amount. Please add sufficient money considering purchase amount!");
        }
    }
}
