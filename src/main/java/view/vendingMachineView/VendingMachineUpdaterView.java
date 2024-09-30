package view.vendingMachineView;

import controller.VendingMachineDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class VendingMachineUpdaterView {
    public void updateVendingMachine() throws SQLException {
        VendingMachineDatabaseController vendingMachineDatabaseController = new VendingMachineDatabaseController();
        VendingMachineReaderView vendingMachineReaderView = new VendingMachineReaderView();
        Scanner myScanner = new Scanner(System.in);

        vendingMachineReaderView.printVendingMachines();

        // Get all necessary information from the user to update a new vending machine
        System.out.println("Please select the vending machine's you want to update: (Expected integer - Example entry: 1)");
        int vendingMachineId = myScanner.nextInt();

        System.out.println("Please enter the new vending Machine Name: (Expected String - Example entry: AkatlarVendingMachine)");
        String vendingMachineName = myScanner.nextLine();

        System.out.println("Please enter the new total Denomination Storage Unit Count: (Expected integer - Example entry: 34)");
        int totalDenominationStorageUnitNumber = myScanner.nextInt();

        System.out.println("Please enter the new denomination Storage Unit Capacity: (Expected integer - Example entry: 27)");
        int denominationStorageUnitCapacity = myScanner.nextInt();

        System.out.println("Please enter the new total Product Storage Unit Count: (Expected integer - Example entry: 34)");
        int totalProductStorageUnitNumber = myScanner.nextInt();

        System.out.println("Please enter the new product Storage Unit Capacity: (Expected integer - Example entry: 27)");
        int productStorageUnitCapacity = myScanner.nextInt();

        vendingMachineDatabaseController.updateVendingMachine(vendingMachineId, vendingMachineName, totalDenominationStorageUnitNumber, denominationStorageUnitCapacity, totalProductStorageUnitNumber, productStorageUnitCapacity);

        // Get all necessary information from the user to update denominations of the vending machine
        System.out.println("Please enter the denomination Storage Unit: (Expected integer - Example entry: 13)");
        int denominationStorageUnit = myScanner.nextInt();

        System.out.println("Please enter the new denomination on Usage: (Expected integer - Example entry: 4)");
        int denominationId = myScanner.nextInt();

        System.out.println("Please enter the new denomination count on storage: (Expected integer - Example entry: 23)");
        int denominationCountOnStorage = myScanner.nextInt();

        vendingMachineDatabaseController.updateDenominationOfVendingMachine(vendingMachineId, denominationStorageUnit, denominationId, denominationCountOnStorage);

        // Get all necessary information from the user to update products of the vending machine
        System.out.println("Please enter the product Storage Unit: (Expected integer - Example entry: 19)");
        int productStorageUnit = myScanner.nextInt();

        System.out.println("Please enter the new product on sale: (Expected integer - Example entry: 2)");
        int productId = myScanner.nextInt();

        System.out.println("Please enter the new product count on storage: (Expected integer - Example entry: 24)");
        int productCountOnStorage = myScanner.nextInt();

        vendingMachineDatabaseController.updateProductOfVendingMachine(vendingMachineId, productStorageUnit, productId, productCountOnStorage);

        System.out.println("Vending machine is updated successfully!");
    }
}
