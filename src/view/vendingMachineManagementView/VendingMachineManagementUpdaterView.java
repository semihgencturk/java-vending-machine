package view.vendingMachineManagementView;

import controller.vendingMachine.VendingMachineUpdater;

import java.util.Scanner;

import static model.DefinedVendingMachines.definedVendingMachinesList;

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
                vendingMachineUpdater.vendingMachineIdUpdater(definedVendingMachinesList.get(vendingMachine), vendingMachineId);
                break;
            case 2:
                System.out.println("Please enter the new vending Machine Name");
                String vendingMachineName = myScanner.nextLine();
                vendingMachineUpdater.vendingMachineNameUpdater(definedVendingMachinesList.get(vendingMachine), vendingMachineName);
                break;
            case 3:
                System.out.println("Please enter the new total Product Storage Unit Number");
                int totalProductStorageUnitNumber = myScanner.nextInt();
                vendingMachineUpdater.totalProductStorageUnitNumberUpdater(definedVendingMachinesList.get(vendingMachine), totalProductStorageUnitNumber);
                break;
            case 4:
                System.out.println("Please enter the new product Storage Unit Capacity");
                int productStorageUnitCapacity = myScanner.nextInt();
                vendingMachineUpdater.productStorageUnitCapacityUpdater(definedVendingMachinesList.get(vendingMachine), productStorageUnitCapacity);
                break;
            case 5:
                System.out.println("Please enter the new total Denomination Storage Unit Number");
                int totalDenominationStorageUnitNumber = myScanner.nextInt();
                vendingMachineUpdater.totalDenominationStorageUnitNumberUpdater(definedVendingMachinesList.get(vendingMachine), totalDenominationStorageUnitNumber);
                break;
            case 6:
                System.out.println("Please enter the new denomination Storage Unit Capacity");
                int denominationStorageUnitCapacity = myScanner.nextInt();
                vendingMachineUpdater.denominationStorageUnitCapacityUpdater(definedVendingMachinesList.get(vendingMachine), denominationStorageUnitCapacity);
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
