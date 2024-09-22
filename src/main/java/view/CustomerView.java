package view;

import controller.DatabaseController;
import model.VendingMachine;
import view.vendingMachineView.VendingMachineReaderView;

import java.util.Scanner;

public class CustomerView {
    public void getCustomerView() {
        Scanner myScanner = new Scanner(System.in);
        DatabaseController databaseController = new DatabaseController();
        System.out.println("Customer View");

        System.out.println("Available Vending Machines: ");
        VendingMachineReaderView vendingMachineReaderView = new VendingMachineReaderView();
        vendingMachineReaderView.getVendingMachines();

        System.out.println("Enter the Vending Machine Id you want to shop: ");
        int vendingMachineId = myScanner.nextInt();
        System.out.println("Enter the Product's Storage Unit you want to buy: ");
        int productStorageUnit = myScanner.nextInt();

        VendingMachine vendingMachine = databaseController.getVendingMachineById(vendingMachineId);
        double amount = databaseController.getProductById(vendingMachine.getProductsOnSale().get(productStorageUnit)).getProductPrice();
        System.out.println("The Amount:" + amount);

//        System.out.println("Enter The Denominations: ");
//        int totalDenominationStorageUnitNumber = vendingMachine.getTotalDenominationStorageUnitNumber();
//        for (int denominationStorageUnit = 1; denominationStorageUnit <= totalDenominationStorageUnitNumber; denominationStorageUnit++) {
//            double denominationAmount = databaseController.getDenominationById(vendingMachine.getDenominationsOnUsage().get(denominationStorageUnit)).getDenominationAmount();
//            System.out.println("Enter the denomination" + denominationAmount);
//            int addedPiece = myScanner.nextInt();
//            if(addedPiece * denominationAmount >= amount) {
//                databaseController.updateDenominationOfVendingMachine(vendingMachineId, denominationStorageUnit, databaseController.getDenominationById(vendingMachine.getDenominationsOnUsage().get(denominationStorageUnit)).getDenominationId(), vendingMachine.getDenominationsOnUsageAvailability().get(denominationStorageUnit) + addedPiece);
//                databaseController.updateProductOfVendingMachine(vendingMachineId, productStorageUnit, vendingMachine.getProductsOnSale().get(productStorageUnit), vendingMachine.getProductsOnSaleAvailability().get(productStorageUnit) - 1);
//            }
//      }

        System.out.println(vendingMachine.getProductsOnSale().get(productStorageUnit));
        System.out.println(vendingMachine.getProductsOnSaleAvailability().get(productStorageUnit) - 1);

        databaseController.updateProductOfVendingMachine(vendingMachineId, productStorageUnit, vendingMachine.getProductsOnSale().get(productStorageUnit), (vendingMachine.getProductsOnSaleAvailability().get(productStorageUnit) - 1));

        vendingMachineReaderView.getVendingMachines();
    }
}

