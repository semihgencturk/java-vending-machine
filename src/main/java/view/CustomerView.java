package view;

import controller.DenominationController;
import controller.ProductController;
import controller.VendingMachineController;
import model.VendingMachine;
import view.vendingMachineView.VendingMachineReaderView;
import java.util.Scanner;

public class CustomerView {
    Scanner myScanner = new Scanner(System.in);
    public void getCustomerView() {
        System.out.println("Customer View");

        System.out.println("Available Vending Machines: ");
        VendingMachineReaderView vendingMachineReaderView = new VendingMachineReaderView();
        vendingMachineReaderView.getVendingMachines();

        System.out.println("Enter the Vending Machine Id you want to shop: ");
        int vendingMachineId = myScanner.nextInt();
        System.out.println("Enter the Product's Storage Unit you want to buy: ");
        int productStorageUnit = myScanner.nextInt();

        getCustomerTransactionView(vendingMachineId, productStorageUnit);
    }

    public void getCustomerTransactionView(int vendingMachineId, int productStorageUnit) {
        VendingMachineController vendingMachineController = new VendingMachineController();
        ProductController productController = new ProductController();
        DenominationController denominationController = new DenominationController();
        VendingMachineReaderView vendingMachineReaderView = new VendingMachineReaderView();

        VendingMachine vendingMachine = vendingMachineController.getVendingMachineById(vendingMachineId);
        double purchaseAmount = productController.getProductById(vendingMachine.getProductsOnSale().get(productStorageUnit)).getProductPrice();
        System.out.println("The Amount:" + purchaseAmount);

        System.out.println("Enter The Denominations: ");
        int totalDenominationStorageUnitNumber = vendingMachine.getTotalDenominationStorageUnitNumber();
        double totalAddedDenominationAmount = 0;
        for (int denominationStorageUnit = 1; denominationStorageUnit <= totalDenominationStorageUnitNumber; denominationStorageUnit++) {
            double denominationAmount = denominationController.getDenominationById(vendingMachine.getDenominationsOnUsage().get(denominationStorageUnit)).getDenominationAmount();

            System.out.println("Enter the denomination" + denominationAmount);
            int addedDenominationPiece = myScanner.nextInt();

            vendingMachineController.updateDenominationOfVendingMachine(vendingMachineId, denominationStorageUnit, denominationController.getDenominationById(vendingMachine.getDenominationsOnUsage().get(denominationStorageUnit)).getDenominationId(), vendingMachine.getDenominationsOnUsageAvailability().get(denominationStorageUnit) + addedDenominationPiece);

            totalAddedDenominationAmount = totalAddedDenominationAmount + denominationAmount * addedDenominationPiece;
        }


        if (totalAddedDenominationAmount >= purchaseAmount) {
            vendingMachineController.updateProductOfVendingMachine(vendingMachineId, productStorageUnit, vendingMachine.getProductsOnSale().get(productStorageUnit), (vendingMachine.getProductsOnSaleAvailability().get(productStorageUnit) - 1));
            giveChangeToCustomer(totalAddedDenominationAmount-purchaseAmount, totalDenominationStorageUnitNumber, totalAddedDenominationAmount, vendingMachine);
        } else {
            giveChangeToCustomer(totalAddedDenominationAmount, totalDenominationStorageUnitNumber, totalAddedDenominationAmount, vendingMachine);
        }

        vendingMachineReaderView.getVendingMachines();
    }

    private void giveChangeToCustomer(double changeAmount, int totalDenominationStorageUnitNumber, double totalAddedDenominationAmount, VendingMachine vendingMachine) {
        VendingMachineController vendingMachineController = new VendingMachineController();
        DenominationController denominationController = new DenominationController();

        for (int denominationStorageUnit = totalDenominationStorageUnitNumber; denominationStorageUnit >= 1; denominationStorageUnit--) {
            double denominationAmount = denominationController.getDenominationById(vendingMachine.getDenominationsOnUsage().get(denominationStorageUnit)).getDenominationAmount();
            int givenDenominationPiece;

            if(totalAddedDenominationAmount != 0 && denominationAmount <= changeAmount) {
                givenDenominationPiece = (int)(changeAmount / denominationAmount);
                totalAddedDenominationAmount = totalAddedDenominationAmount - (givenDenominationPiece*denominationAmount);
                System.out.println(totalAddedDenominationAmount);
                vendingMachineController.updateDenominationOfVendingMachine(vendingMachine.getVendingMachineId(), denominationStorageUnit, denominationController.getDenominationById(vendingMachine.getDenominationsOnUsage().get(denominationStorageUnit)).getDenominationId(), vendingMachine.getDenominationsOnUsageAvailability().get(denominationStorageUnit) - givenDenominationPiece);
            }
        }
    }
}