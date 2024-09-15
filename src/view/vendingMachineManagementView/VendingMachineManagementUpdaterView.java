package view.vendingMachineManagementView;

import controller.vendingMachine.VendingMachineUpdater;

import java.util.Scanner;

import static model.DefinedDenominationList.definedDenominationList;
import static model.DefinedProductList.definedProductList;
import static model.DefinedVendingMachineList.definedVendingMachineList;

public class VendingMachineManagementUpdaterView {
    private static VendingMachineManagementUpdaterView self = new VendingMachineManagementUpdaterView();
    public static VendingMachineManagementUpdaterView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void vendingMachineManagementUpdaterViewStarter(){
        System.out.println("Please select the vending machine you want to update:");

        int vendingMachine = myScanner.nextInt();

        System.out.println("Please select the property you want to update:");
        System.out.println("1-vendingMachineIdUpdater");
        System.out.println("2-vendingMachineNameUpdater");
        System.out.println("3-totalProductStorageUnitNumberUpdater");
        System.out.println("4-productStorageUnitCapacityUpdater");
        System.out.println("5-totalDenominationStorageUnitNumberUpdater");
        System.out.println("6-denominationStorageUnitCapacityUpdater");
        System.out.println("7-denominationsOnUsageUpdater");
        System.out.println("8-denominationAvailabilityUpdater");
        System.out.println("9-productsOnSaleUpdater");
        System.out.println("10-productsAvailabilityUpdater");

        int selectedOption = myScanner.nextInt();

        VendingMachineUpdater vendingMachineUpdater = VendingMachineUpdater.getInstance();

        switch (selectedOption) {
            case 1:
                System.out.println("Please enter the new vending Machine Id");
                int vendingMachineId = myScanner.nextInt();
                vendingMachineUpdater.vendingMachineIdUpdater(definedVendingMachineList.get(vendingMachine), vendingMachineId);
                break;
            case 2:
                System.out.println("Please enter the new vending Machine Name");
                String vendingMachineName = myScanner.nextLine();
                vendingMachineUpdater.vendingMachineNameUpdater(definedVendingMachineList.get(vendingMachine), vendingMachineName);
                break;
            case 3:
                System.out.println("Please enter the new total Product Storage Unit Number");
                int totalProductStorageUnitNumber = myScanner.nextInt();
                vendingMachineUpdater.totalProductStorageUnitNumberUpdater(definedVendingMachineList.get(vendingMachine), totalProductStorageUnitNumber);
                break;
            case 4:
                System.out.println("Please enter the new product Storage Unit Capacity");
                int productStorageUnitCapacity = myScanner.nextInt();
                vendingMachineUpdater.productStorageUnitCapacityUpdater(definedVendingMachineList.get(vendingMachine), productStorageUnitCapacity);
                break;
            case 5:
                System.out.println("Please enter the new total Denomination Storage Unit Number");
                int totalDenominationStorageUnitNumber = myScanner.nextInt();
                vendingMachineUpdater.totalDenominationStorageUnitNumberUpdater(definedVendingMachineList.get(vendingMachine), totalDenominationStorageUnitNumber);
                break;
            case 6:
                System.out.println("Please enter the new denomination Storage Unit Capacity");
                int denominationStorageUnitCapacity = myScanner.nextInt();
                vendingMachineUpdater.denominationStorageUnitCapacityUpdater(definedVendingMachineList.get(vendingMachine), denominationStorageUnitCapacity);
                break;
            case 7:
                System.out.println("Please enter the denomination Storage Unit");
                int denominationStorageUnit = myScanner.nextInt();
                System.out.println("Please enter the new denomination on Usage");
                int denomination = myScanner.nextInt();
                vendingMachineUpdater.denominationsOnUsageUpdater(definedVendingMachineList.get(vendingMachine), denominationStorageUnit, definedDenominationList.get(denomination));
                break;
            case 8:
                System.out.println("Please enter the denomination Storage Unit");
                int denominationStorageUnit2 = myScanner.nextInt();
                System.out.println("Please enter the new denominationPiece");
                int denominationPiece = myScanner.nextInt();
                vendingMachineUpdater.denominationAvailabilityUpdater(definedVendingMachineList.get(vendingMachine), denominationStorageUnit2, denominationPiece);
                break;
            case 9:
                System.out.println("Please enter the product Storage Unit");
                int productStorageUnit = myScanner.nextInt();
                System.out.println("Please enter the new product on sale");
                int product = myScanner.nextInt();
                vendingMachineUpdater.productsOnSaleUpdater(definedVendingMachineList.get(vendingMachine), productStorageUnit, definedProductList.get(product));
                break;
            case 10:
                System.out.println("Please enter the product Storage Unit");
                int productStorageUnit2 = myScanner.nextInt();
                System.out.println("Please enter the new product on sale");
                int productPiece = myScanner.nextInt();
                vendingMachineUpdater.productsAvailabilityUpdater(definedVendingMachineList.get(vendingMachine), productStorageUnit2, productPiece);
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
