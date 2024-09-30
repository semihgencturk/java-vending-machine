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

        System.out.println("Available Vending Machines: ");
        VendingMachineReaderView vendingMachineReaderView = new VendingMachineReaderView();
        vendingMachineReaderView.printVendingMachines();

        // Get all necessary information to start translation
        System.out.println("Enter the Vending Machine Id you want to shop: (Expected integer - Example entry: 9)");
        int vendingMachineId = myScanner.nextInt();

        System.out.println("Enter the Product's Storage Unit you want to buy: (Expected integer - Example entry: 19)");
        int productStorageUnit = myScanner.nextInt();

        if(vendingMachineController.isProductAvailable(vendingMachineId, productStorageUnit)) {
            transactionView.getCustomerTransactionView(vendingMachineId, productStorageUnit);
        } else {
            System.out.println("The product is out-of-stock!");
        }
    }
}