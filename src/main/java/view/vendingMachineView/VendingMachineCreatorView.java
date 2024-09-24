package view.vendingMachineView;

import controller.VendingMachineDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class VendingMachineCreatorView {
    public void createVendingMachine() throws SQLException {
        VendingMachineDatabaseController vendingMachineController = new VendingMachineDatabaseController();
        Scanner myScanner = new Scanner(System.in);

        // Get all necessary information from the user to create a new vending machine
        System.out.println("Enter the Vending Machine Id");
        int vendingMachineId = myScanner.nextInt();

        System.out.println("Enter the Vending Machine Name");
        myScanner.nextLine();
        String vendingMachineName = myScanner.nextLine();

        System.out.println("Enter the denominationStorageUnitCapacity");
        int totalDenominationStorageUnitNumber = myScanner.nextInt();

        System.out.println("Enter the totalDenominationStorageUnitNumber");
        int denominationStorageUnitCapacity = myScanner.nextInt();

        System.out.println("Enter the totalProductStorageUnitNumber");
        int totalProductStorageUnitNumber = myScanner.nextInt();

        System.out.println("Enter the productStorageUnitCapacity");
        int productStorageUnitCapacity = myScanner.nextInt();

        // Insert the vending machine into the database
        vendingMachineController.insertVendingMachine(vendingMachineId, vendingMachineName, totalDenominationStorageUnitNumber, denominationStorageUnitCapacity, totalProductStorageUnitNumber, productStorageUnitCapacity);
        System.out.println("Vending machine is created successfully!");

        for (int denominationStorageUnit = 1; denominationStorageUnit <= totalDenominationStorageUnitNumber; denominationStorageUnit++) {

            // Get all necessary information from the user to add denominations of the vending machine
            System.out.println("Enter the denomination on usage for unit" + denominationStorageUnit + "of" + totalDenominationStorageUnitNumber);
            int denominationId = myScanner.nextInt();

            System.out.println("Enter the denomination availability for unit" + denominationStorageUnit + "of" + totalDenominationStorageUnitNumber);
            int denominationPiece = myScanner.nextInt();

            // Insert denominations of vending machine into the database
            vendingMachineController.insertDenominationToVendingMachine(vendingMachineId, denominationId, denominationStorageUnit, denominationPiece);
            System.out.println("Denominations are added to the vending machine successfully!");
        }

        for (int productStorageUnit = 1; productStorageUnit <= totalProductStorageUnitNumber; productStorageUnit++) {

            // Get all necessary information from the user to add products of the vending machine
            System.out.println("Enter the product on sale for unit" + productStorageUnit + "of" + totalProductStorageUnitNumber);
            int productId = myScanner.nextInt();

            System.out.println("Enter the product availability for unit" + productStorageUnit + "of" + totalProductStorageUnitNumber);
            int productPiece = myScanner.nextInt();

            // Insert products of vending machine into the database
            vendingMachineController.insertProductToVendingMachine(vendingMachineId, productId, productStorageUnit, productPiece);
            System.out.println("Products are added to the vending machine successfully!");
        }
    }
}