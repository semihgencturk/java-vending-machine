package view.vendingMachineView;

import controller.vendingMachine.VendingMachineReader;
import model.VendingMachine;
import static app_data.VendingMachineTable.vendingMachineTable;

public class VendingMachineReaderAllView {
    private static VendingMachineReaderAllView self = null;
    public static VendingMachineReaderAllView getInstance() {
        if (self == null) {
            self = new VendingMachineReaderAllView();
        }
        return self;
    }

    public void vendingMachineReaderAllView() {
        System.out.println("List of Defined Vending Machines and their details:");

        VendingMachineReader vendingMachineReader = VendingMachineReader.getInstance();

        for(VendingMachine vendingMachine : vendingMachineTable) {
            System.out.println("Vending Machine Details:");
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
}
