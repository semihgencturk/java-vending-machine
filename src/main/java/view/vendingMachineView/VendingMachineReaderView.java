package view.vendingMachineView;

import controller.VendingMachineDatabaseController;
import model.VendingMachine;
import java.sql.SQLException;
import java.util.Scanner;

public class VendingMachineReaderView {
    VendingMachineDatabaseController vendingMachineController = new VendingMachineDatabaseController();

    // Print all attributes of a vending machine
    public void printVendingMachineById() throws SQLException {
        Scanner myScanner = new Scanner(System.in);

        // Show the vending machines to the user
        printVendingMachines();

        System.out.println("Enter the product id you want to see its details:");
        int vendingMachineId = myScanner.nextInt();

        printVendingMachine(vendingMachineController.getVendingMachineById(vendingMachineId));
    }

    // Print all vending machines with their details
    public void printVendingMachines() throws SQLException {
        for (VendingMachine vendingMachine : vendingMachineController.getVendingMachines()) {
            printVendingMachine(vendingMachine);
        }
    }

    // Create a GUI and print the attributes of the vending machine
    private void printVendingMachine(VendingMachine vendingMachine) {
        System.out.println("1-vendingMachineId: " + vendingMachine.getVendingMachineId());
        System.out.println("2-vendingMachineName: " + vendingMachine.getVendingMachineName());
        System.out.println("3-totalDenominationStorageUnitNumber: " + vendingMachine.getTotalDenominationStorageUnitNumber());
        System.out.println("4-denominationStorageUnitCapacity: " + vendingMachine.getDenominationStorageUnitCapacity());
        System.out.println("5-totalProductStorageUnitNumber: " + vendingMachine.getTotalProductStorageUnitNumber());
        System.out.println("6-productStorageUnitCapacity: " + vendingMachine.getProductStorageUnitCapacity());

        System.out.println("7-denominationsOnUsage & denominationOnUsageAvailability:");
        for (int denominationStorageUnit = 1; denominationStorageUnit <= vendingMachine.getTotalDenominationStorageUnitNumber(); denominationStorageUnit++) {
            System.out.println("denominationId: " + vendingMachine.getDenominationsOnUsage().get(denominationStorageUnit) + " = " +"denominationCount: " + vendingMachine.getDenominationsOnUsageAvailability().get(denominationStorageUnit));
        }

        System.out.println("7-productsOnSale & productOnSaleAvailability:");
        for (int productStorageUnit = 1; productStorageUnit <= vendingMachine.getTotalDenominationStorageUnitNumber(); productStorageUnit++) {
            System.out.println("productsId: " + vendingMachine.getProductsOnSale().get(productStorageUnit) + " = " + "productCount: " + vendingMachine.getProductsOnSaleAvailability().get(productStorageUnit));
        }
    }
}
