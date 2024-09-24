package view.vendingMachineView;

import controller.VendingMachineDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class VendingMachineUpdaterView {
    public void updateVendingMachine() throws SQLException {
        VendingMachineDatabaseController vendingMachineController = new VendingMachineDatabaseController();
        Scanner myScanner = new Scanner(System.in);

        // Get all necessary information from the user to update a new vending machine
        System.out.println("Please select the vending machine's you want to update:");
        int vendingMachineId = myScanner.nextInt();

        System.out.println("Please enter the new vending Machine Name");
        String vendingMachineName = myScanner.nextLine();

        System.out.println("Please enter the new total Denomination Storage Unit Number");
        int totalDenominationStorageUnitNumber = myScanner.nextInt();

        System.out.println("Please enter the new denomination Storage Unit Capacity");
        int denominationStorageUnitCapacity = myScanner.nextInt();

        System.out.println("Please enter the new total Product Storage Unit Number");
        int totalProductStorageUnitNumber = myScanner.nextInt();

        System.out.println("Please enter the new product Storage Unit Capacity");
        int productStorageUnitCapacity = myScanner.nextInt();

        // Update the vending machine into the database
        vendingMachineController.updateVendingMachine(vendingMachineId, vendingMachineName, totalDenominationStorageUnitNumber, denominationStorageUnitCapacity, totalProductStorageUnitNumber, productStorageUnitCapacity);

        // Get all necessary information from the user to update denominations of the vending machine
        System.out.println("Please enter the denomination Storage Unit");
        int denominationStorageUnit = myScanner.nextInt();
        System.out.println("Please enter the new denomination on Usage");
        int denominationId = myScanner.nextInt();
        System.out.println("Please enter the new denominationPiece");
        int denominationPiece = myScanner.nextInt();

        // Update denominations of vending machine into the database
        vendingMachineController.updateDenominationOfVendingMachine(vendingMachineId, denominationStorageUnit, denominationId, denominationPiece);

        // Get all necessary information from the user to update products of the vending machine
        System.out.println("Please enter the product Storage Unit");
        int productStorageUnit = myScanner.nextInt();
        System.out.println("Please enter the new product on sale");
        int productId = myScanner.nextInt();
        System.out.println("Please enter the new product on sale");
        int productPiece = myScanner.nextInt();

        // Update products of vending machine into the database
        vendingMachineController.updateProductOfVendingMachine(vendingMachineId, productStorageUnit, productId, productPiece);
    }
}
