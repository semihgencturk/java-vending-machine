package view.vendingMachineView;

import java.util.Scanner;


public class VendingMachineUpdaterView {
    public void updateVendingMachine(){
        Scanner myScanner = new Scanner(System.in);
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

        System.out.println("Please enter the denomination Storage Unit");
        int denominationStorageUnit = myScanner.nextInt();
        System.out.println("Please enter the new denomination on Usage");
        int denomination = myScanner.nextInt();

        System.out.println("Please enter the denomination Storage Unit");
        int denominationStorageUnit2 = myScanner.nextInt();
        System.out.println("Please enter the new denominationPiece");
        int denominationPiece = myScanner.nextInt();

        System.out.println("Please enter the product Storage Unit");
        int productStorageUnit = myScanner.nextInt();
        System.out.println("Please enter the new product on sale");
        int product = myScanner.nextInt();

        System.out.println("Please enter the product Storage Unit");
        int productStorageUnit2 = myScanner.nextInt();
        System.out.println("Please enter the new product on sale");
        int productPiece = myScanner.nextInt();
    }
}
