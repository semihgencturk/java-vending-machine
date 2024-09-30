package view.vendingMachineView;

import controller.VendingMachineDatabaseController;
import model.vendingMachine.VendingMachine;
import java.sql.SQLException;
import java.util.Scanner;

public class VendingMachineReaderView {
    VendingMachineDatabaseController vendingMachineDatabaseController = new VendingMachineDatabaseController();

    public void printVendingMachineById() throws SQLException {
        Scanner myScanner = new Scanner(System.in);

        printVendingMachines();

        System.out.println("Enter the product id you want to see its details:");
        int vendingMachineId = myScanner.nextInt();
        VendingMachine vendingMachine = vendingMachineDatabaseController.getVendingMachineById(vendingMachineId);

        printVendingMachine(vendingMachine);
    }

    public void printVendingMachines() throws SQLException {
        for (VendingMachine vendingMachine : vendingMachineDatabaseController.getVendingMachines()) {
            printVendingMachine(vendingMachine);
        }
    }

    private void printVendingMachine(VendingMachine vendingMachine) {
        System.out.println("1-vendingMachineId: " + vendingMachine.getVendingMachineId());
        System.out.println("2-vendingMachineName: " + vendingMachine.getVendingMachineName());
        System.out.println("3-totalDenominationStorageUnitNumber: " + vendingMachine.getTotalDenominationStorageUnitCount());
        System.out.println("4-denominationStorageUnitCapacity: " + vendingMachine.getDenominationStorageUnitCapacity());
        System.out.println("5-totalProductStorageUnitNumber: " + vendingMachine.getTotalProductStorageUnitCount());
        System.out.println("6-productStorageUnitCapacity: " + vendingMachine.getProductStorageUnitCapacity());

        System.out.println("7-denominationsOnUsage & denominationOnUsageAvailability:");
        for (int denominationStorageUnit = 1; denominationStorageUnit <= vendingMachine.getTotalDenominationStorageUnitCount(); denominationStorageUnit++) {
            System.out.println("denominationId: " + vendingMachine.getDenominationOnUsage().get(denominationStorageUnit).getDenomination().getDenominationId() + " <=> " +"denominationCount: " + vendingMachine.getDenominationOnUsage().get(denominationStorageUnit).getDenominationCountOnUsage());
        }

        System.out.println("8-productsOnSale & productOnSaleAvailability:");
        for (int productStorageUnit = 1; productStorageUnit <= vendingMachine.getTotalProductStorageUnitCount(); productStorageUnit++) {
            System.out.println("productsId: " + vendingMachine.getProductOnSale().get(productStorageUnit).getProduct().getProductId() + " <=> " + "productCount: " + vendingMachine.getProductOnSale().get(productStorageUnit).getProductCountOnStock());
        }
    }
}
