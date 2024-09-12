package controller.currentVendingMachines;

import controller.vendingMachine.VendingMachineCreator;
import controller.vendingMachine.VendingMachineUpdater;

import java.util.Scanner;

import static model.CurrentVendingMachines.currentVendingMachinesList;

public class currentVendingMachineUpdater {
    private static currentVendingMachineUpdater self = new currentVendingMachineUpdater();
    public static currentVendingMachineUpdater getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void VendingMachineUpdaterStarter(){
        System.out.println("Please select the vending machine you want to update:");

        int selectedVendingMachine = myScanner.nextInt();

        System.out.println("Please select the property you want to update:");
        System.out.println("1-totalProductStorageUnitNumberUpdater");
        System.out.println("2-productStorageUnitCapacityUpdater");
        System.out.println("3-totalDenominationStorageUnitNumberUpdater");
        System.out.println("4-denominationStorageUnitCapacityUpdater");
        System.out.println("5-denominationsOnUsageUpdater");
        System.out.println("6-denominationAvailabilityUpdater");
        System.out.println("7-productsOnSaleUpdater");
        System.out.println("8-productsAvailabilityUpdater");

        int selectedOption = myScanner.nextInt();

        // todoo: should be deleted before complete the project. It just for testing
        currentVendingMachinesList.add(VendingMachineCreator.getInstance().definingNewVendingMachine());

        switch (selectedOption) {
            case 1:
                System.out.println("Please enter the new total Product Storage Unit Number");
                int totalProductStorageUnitNumber = myScanner.nextInt();
                VendingMachineUpdater.getInstance().totalProductStorageUnitNumberUpdater(currentVendingMachinesList.get(selectedVendingMachine), totalProductStorageUnitNumber);
                break;
            case 2:
                System.out.println("Please enter the new product Storage Unit Capacity");
                int productStorageUnitCapacity = myScanner.nextInt();
                VendingMachineUpdater.getInstance().productStorageUnitCapacityUpdater(currentVendingMachinesList.get(selectedVendingMachine), productStorageUnitCapacity);
                break;
            case 3:
                System.out.println("Please enter the new total Denomination Storage Unit Number");
                int totalDenominationStorageUnitNumber = myScanner.nextInt();
                VendingMachineUpdater.getInstance().totalDenominationStorageUnitNumberUpdater(currentVendingMachinesList.get(selectedVendingMachine), totalDenominationStorageUnitNumber);
                break;
            case 4:
                System.out.println("Please enter the new denomination Storage Unit Capacity");
                int denominationStorageUnitCapacity = myScanner.nextInt();
                VendingMachineUpdater.getInstance().denominationStorageUnitCapacityUpdater(currentVendingMachinesList.get(selectedVendingMachine), denominationStorageUnitCapacity);
                break;
//            case 5:
//                System.out.println("Please enter the denomination Storage Unit");
//                int denominationStorageUnit = myScanner.nextInt();
//                System.out.println("Please enter the new denominations On Usage");
//                todoo
//                VendingMachineUpdater.getInstance().denominationsOnUsageUpdater(currentVendingMachinesList.get(selectedVendingMachine), denominationStorageUnit, denominationsOnUsage);
//                break;
//            case 6:
//
//            case 7:
//
//            case 8:
//
            default:
                System.out.println("Invalid Entry");
        }
    }
}
