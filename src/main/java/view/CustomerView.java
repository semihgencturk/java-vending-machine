package view;

import controller.DatabaseController;
import model.VendingMachine;
import view.denominationView.DenominationReaderView;
import view.productView.ProductReaderView;
import view.vendingMachineView.VendingMachineReaderView;
import java.util.Scanner;

public class CustomerView {
    public void getCustomerView() {
        DenominationReaderView denominationReaderView = new DenominationReaderView();
        denominationReaderView.getDenominations();

        ProductReaderView productReaderView = new ProductReaderView();
        productReaderView.getProducts();

        System.out.println("====");

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
        double purchaseAmount = databaseController.getProductById(vendingMachine.getProductsOnSale().get(productStorageUnit)).getProductPrice();
        System.out.println("The Amount:" + purchaseAmount);

        System.out.println("Enter The Denominations: ");
        int totalDenominationStorageUnitNumber = vendingMachine.getTotalDenominationStorageUnitNumber();
        double totalAddedDenominationAmount = 0;
        for (int denominationStorageUnit = 1; denominationStorageUnit <= totalDenominationStorageUnitNumber; denominationStorageUnit++) {
            double denominationAmount = databaseController.getDenominationById(vendingMachine.getDenominationsOnUsage().get(denominationStorageUnit)).getDenominationAmount();

            System.out.println("Enter the denomination" + denominationAmount);
            int addedDenominationPiece = myScanner.nextInt();

            databaseController.updateDenominationOfVendingMachine(vendingMachineId, denominationStorageUnit, databaseController.getDenominationById(vendingMachine.getDenominationsOnUsage().get(denominationStorageUnit)).getDenominationId(), vendingMachine.getDenominationsOnUsageAvailability().get(denominationStorageUnit) + addedDenominationPiece);

            totalAddedDenominationAmount = totalAddedDenominationAmount + denominationAmount * addedDenominationPiece;
        }


        if (totalAddedDenominationAmount >= purchaseAmount) {
            databaseController.updateProductOfVendingMachine(vendingMachineId, productStorageUnit, vendingMachine.getProductsOnSale().get(productStorageUnit), (vendingMachine.getProductsOnSaleAvailability().get(productStorageUnit) - 1));
            giveChangeToCustomer(totalAddedDenominationAmount-purchaseAmount, totalDenominationStorageUnitNumber, totalAddedDenominationAmount, vendingMachine);
        } else {
            giveChangeToCustomer(totalAddedDenominationAmount, totalDenominationStorageUnitNumber, totalAddedDenominationAmount, vendingMachine);
        }

        vendingMachineReaderView.getVendingMachines();
    }

    private void giveChangeToCustomer(double changeAmount, int totalDenominationStorageUnitNumber, double totalAddedDenominationAmount, VendingMachine vendingMachine) {
        DatabaseController databaseController = new DatabaseController();
        for (int denominationStorageUnit = totalDenominationStorageUnitNumber; denominationStorageUnit >= 1; denominationStorageUnit--) {
            double denominationAmount = databaseController.getDenominationById(vendingMachine.getDenominationsOnUsage().get(denominationStorageUnit)).getDenominationAmount();
            int givenDenominationPiece;
            System.out.println("totalAddedDenominationAmount:"+ totalAddedDenominationAmount);
            if(totalAddedDenominationAmount != 0 && denominationAmount <= changeAmount) {
                    givenDenominationPiece = (int)(changeAmount / denominationAmount);
                    totalAddedDenominationAmount = totalAddedDenominationAmount - (givenDenominationPiece*denominationAmount);
                    System.out.println(totalAddedDenominationAmount);
                    databaseController.updateDenominationOfVendingMachine(vendingMachine.getVendingMachineId(), denominationStorageUnit, databaseController.getDenominationById(vendingMachine.getDenominationsOnUsage().get(denominationStorageUnit)).getDenominationId(), vendingMachine.getDenominationsOnUsageAvailability().get(denominationStorageUnit) - givenDenominationPiece);
            }
        }
    }
}