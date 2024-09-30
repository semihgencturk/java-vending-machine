package view.vendingMachineView;

import controller.VendingMachineDatabaseController;
import view.denominationView.DenominationReaderView;
import view.productView.ProductReaderView;

import java.sql.SQLException;
import java.util.Scanner;

public class VendingMachineCreatorView {
    public void createVendingMachine() throws SQLException {
        VendingMachineDatabaseController vendingMachineDatabaseController = new VendingMachineDatabaseController();
        DenominationReaderView denominationReaderView = new DenominationReaderView();
        ProductReaderView productReaderView = new ProductReaderView();

        Scanner myScanner = new Scanner(System.in);

        // Get all necessary information from the user to create a new vending machine
        System.out.println("Enter the Vending Machine Name: (Expected String - Example entry: BesiktasVendingMachine)");
        myScanner.nextLine();
        String vendingMachineName = myScanner.nextLine();

        System.out.println("Enter the totalDenominationStorageUnitCount: (Expected integer - Example entry: 9)");
        int totalDenominationStorageUnitNumber = myScanner.nextInt();

        System.out.println("Enter the denominationStorageUnitCapacity: (Expected integer - Example entry: 300)");
        int denominationStorageUnitCapacity = myScanner.nextInt();

        System.out.println("Enter the totalProductStorageUnitCount: (Expected integer - Example entry: 37)");
        int totalProductStorageUnitNumber = myScanner.nextInt();

        System.out.println("Enter the productStorageUnitCapacity: (Expected integer - Example entry: 19)");
        int productStorageUnitCapacity = myScanner.nextInt();

        vendingMachineDatabaseController.insertVendingMachine(vendingMachineName, totalDenominationStorageUnitNumber, denominationStorageUnitCapacity, totalProductStorageUnitNumber, productStorageUnitCapacity);
        int lastVendingMachineId = vendingMachineDatabaseController.getVendingMachines().getLast().getVendingMachineId();
        System.out.println("Vending machine is created successfully!");

        denominationReaderView.printDenominations();

        for (int denominationStorageUnit = 1; denominationStorageUnit <= totalDenominationStorageUnitNumber; denominationStorageUnit++) {

            // Get all necessary information from the user to add denominations of the vending machine
            System.out.println("Enter denominationId to add the denomination on usage for unit" + denominationStorageUnit + "of" + totalDenominationStorageUnitNumber + "(Expected integer - Example entry: 2)");
            int denominationId = myScanner.nextInt();

            System.out.println("Enter denomination count on storage for the denomination availability of unit" + denominationStorageUnit + "of" + totalDenominationStorageUnitNumber + "(Expected integer - Example entry: 150)");
            int denominationCountOnStorage = myScanner.nextInt();

            vendingMachineDatabaseController.insertDenominationToVendingMachine(lastVendingMachineId, denominationId, denominationStorageUnit, denominationCountOnStorage);
            System.out.println("Denominations are added to the vending machine successfully!");
        }

        productReaderView.printProducts();

        for (int productStorageUnit = 1; productStorageUnit <= totalProductStorageUnitNumber; productStorageUnit++) {

            // Get all necessary information from the user to add products of the vending machine
            System.out.println("Enter the productId to add product on sale for unit" + productStorageUnit + "of" + totalProductStorageUnitNumber + "(Expected integer - Example entry: 1)");
            int productId = myScanner.nextInt();

            System.out.println("Enter product count on storage for the product availability for unit" + productStorageUnit + "of" + totalProductStorageUnitNumber + "(Expected integer - Example entry: 15)");
            int productCountOnStorage = myScanner.nextInt();

            vendingMachineDatabaseController.insertProductToVendingMachine(lastVendingMachineId, productId, productStorageUnit, productCountOnStorage );
            System.out.println("Products are added to the vending machine successfully!");
        }
    }
}