package Views.vendingMachineView;

import App_data.VendingMachineTable;
import Controllers.vendingMachine.VendingMachineReader;
import Models.VendingMachine;

import java.util.Scanner;

import static App_data.VendingMachineTable.vendingMachineTable;

public class VendingMachineReaderView {
    private static VendingMachineReaderView self = new VendingMachineReaderView();
    public static VendingMachineReaderView getInstance() { return self; }

    public void vendingMachineReaderView(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the vending machine you want to see its details:");
        int vendingMachineIndex = myScanner.nextInt();
        VendingMachine vendingMachine = vendingMachineTable.get(vendingMachineIndex);

        VendingMachineReader vendingMachineReader = VendingMachineReader.getInstance();

        System.out.println("1-vendingMachineId: " + vendingMachineReader.vendingMachineIdReader(vendingMachine));
        System.out.println("2-vendingMachineName: " + vendingMachineReader.vendingMachineNameReader(vendingMachine));
        System.out.println("3-totalProductStorageUnitNumber: " + vendingMachineReader.totalProductStorageUnitNumberReader(vendingMachine));
        System.out.println("4-productStorageUnitCapacity: " + vendingMachineReader.productStorageUnitCapacityReader(vendingMachine));
        System.out.println("5-totalDenominationStorageUnitNumber: " + vendingMachineReader.totalDenominationStorageUnitNumberReader(vendingMachine));
        System.out.println("6-denominationStorageUnitCapacity: " + vendingMachineReader.denominationStorageUnitCapacityReader(vendingMachine));
        System.out.println("7-denominationsOnUsage: " + vendingMachineReader.denominationsOnUsageReader(vendingMachine));
        System.out.println("8-denominationOnUsageAvailability: " + vendingMachineReader.getDenominationsOnUsageAvailability(vendingMachine));
        System.out.println("9-productsOnSale: " + vendingMachineReader.productsOnSaleReader(vendingMachine));
        System.out.println("10-productsAvailability: " + vendingMachineReader.productsAvailabilityReader(vendingMachine));

    }
}
