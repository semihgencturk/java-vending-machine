package view.vendingMachineView;

import controller.VendingMachineController;
import java.util.Scanner;

public class VendingMachineCreatorView {
    public void createVendingMachine() {
        VendingMachineController vendingMachineController = new VendingMachineController();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the Vending Machine Id");
        int vendingMachineId = myScanner.nextInt();

        System.out.println("Enter the Vending Machine Name");
        String vendingMachineName = myScanner.nextLine();

        System.out.println("Enter the denominationStorageUnitCapacity");
        int totalDenominationStorageUnitNumber = myScanner.nextInt();

        System.out.println("Enter the totalDenominationStorageUnitNumber");
        int denominationStorageUnitCapacity = myScanner.nextInt();

        System.out.println("Enter the totalProductStorageUnitNumber");
        int totalProductStorageUnitNumber = myScanner.nextInt();

        System.out.println("Enter the productStorageUnitCapacity");
        int productStorageUnitCapacity = myScanner.nextInt();

        vendingMachineController.insertVendingMachine(vendingMachineId, vendingMachineName, totalDenominationStorageUnitNumber, denominationStorageUnitCapacity, totalProductStorageUnitNumber, productStorageUnitCapacity);

        for (int denominationStorageUnit = 0; denominationStorageUnit <= totalDenominationStorageUnitNumber; denominationStorageUnit++) {
            System.out.println("Enter the denomination on usage for unit" + denominationStorageUnit + "of" + totalDenominationStorageUnitNumber);
            int denominationId = myScanner.nextInt();
            System.out.println("Enter the denomination availability for unit" + denominationStorageUnit + "of" + totalDenominationStorageUnitNumber);
            int denominationPiece = myScanner.nextInt();
            vendingMachineController.insertDenominationToVendingMachine(vendingMachineId, denominationId, denominationStorageUnit, denominationPiece);
        }

        for (int productStorageUnit = 0; productStorageUnit <= totalProductStorageUnitNumber; productStorageUnit++) {
            System.out.println("Enter the product on sale for unit" + productStorageUnit + "of" + totalProductStorageUnitNumber);
            int productId = myScanner.nextInt();
            System.out.println("Enter the product availability for unit" + productStorageUnit + "of" + totalProductStorageUnitNumber);
            int productPiece = myScanner.nextInt();
            vendingMachineController.insertProductToVendingMachine(vendingMachineId, productId, productStorageUnit, productPiece);
        }
    }
}