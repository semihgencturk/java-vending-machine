package view.vendingMachineManagementView;

import controller.definedVendingMachines.DefinedVendingMachinesAdder;
import controller.vendingMachine.VendingMachineCreator;

import java.util.Scanner;

public class VendingMachineManagementCreatorView {
    private static VendingMachineManagementCreatorView self = new VendingMachineManagementCreatorView();
    public static VendingMachineManagementCreatorView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void vendingMachineManagementCreatorViewStarter() {

        System.out.println("Enter the Vending Machine Id");
        int vendingMachineId = myScanner.nextInt();

        System.out.println("Enter the Vending Machine Name");
        String vendingMachineName = myScanner.nextLine();

        System.out.println("Enter the totalProductStorageUnitNumber");
        int totalProductStorageUnitNumber = myScanner.nextInt();

        System.out.println("Enter the productStorageUnitCapacity");
        int productStorageUnitCapacity = myScanner.nextInt();

        System.out.println("Enter the denominationStorageUnitCapacity");
        int totalDenominationStorageUnitNumber = myScanner.nextInt();

        System.out.println("Enter the totalDenominationStorageUnitNumber");
        int denominationStorageUnitCapacity = myScanner.nextInt();

        DefinedVendingMachinesAdder.getInstance().definedVendingMachinesAdderStarter(VendingMachineCreator.getInstance().VendingMachineCreatorStarter(vendingMachineId, vendingMachineName, totalProductStorageUnitNumber, productStorageUnitCapacity, totalDenominationStorageUnitNumber, denominationStorageUnitCapacity));

        System.out.println("Enter the totalDenominationStorageUnitNumber");
        System.out.println("Enter the totalDenominationStorageUnitNumber");
        System.out.println("Enter the totalDenominationStorageUnitNumber");
        System.out.println("Enter the totalDenominationStorageUnitNumber");

    }
}

//private HashMap<Integer, Denomination> denominationsOnUsage = new HashMap<Integer, Denomination>();
//private HashMap<Integer, Integer> denominationsAvailability = new HashMap<Integer, Integer>();
//private HashMap<Integer, Product> productsOnSale = new HashMap<Integer, Product>();
//private HashMap<Integer, Integer> productsAvailability = new HashMap<Integer, Integer>();
