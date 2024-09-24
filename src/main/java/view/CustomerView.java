package view;

import controller.VendingMachineController;
import view.vendingMachineView.VendingMachineReaderView;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerView {
    public void getCustomerView() throws SQLException {
        Scanner myScanner = new Scanner(System.in);
        VendingMachineController vendingMachineController = new VendingMachineController();
        TransactionView transactionView = new TransactionView();

        System.out.println("Customer View");

        // List of available vending machine to user
        System.out.println("Available Vending Machines: ");
        VendingMachineReaderView vendingMachineReaderView = new VendingMachineReaderView();
        vendingMachineReaderView.printVendingMachines();

        // Get all necessary information to start translation
        System.out.println("Enter the Vending Machine Id you want to shop: ");
        int vendingMachineId = myScanner.nextInt();

        System.out.println("Enter the Product's Storage Unit you want to buy: ");
        int productStorageUnit = myScanner.nextInt();

        // Check the availability of the product
        if(vendingMachineController.isProductAvailable(vendingMachineId, productStorageUnit)) {
            // Route to transaction view with the necessary information to start transaction
            transactionView.getCustomerTransactionView(vendingMachineId, productStorageUnit);
        } else {
            System.out.println("The product is out-of-stock!");
        }
    }
}