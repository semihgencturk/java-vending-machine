package Views;

import Controllers.vendingMachine.VendingMachineReader;
import Models.VendingMachine;
import Views.vendingMachineView.VendingMachineReaderAllView;

import java.util.Scanner;

import static App_data.VendingMachineTable.vendingMachineTable;

public class CustomerView {
    private static CustomerView self = new CustomerView();
    public static CustomerView getInstance() { return self; }

    public void customerView() {
//        Scanner myScanner = new Scanner(System.in);
//
//        System.out.println("This is the Customer Page. Here is the vending machines. Please select the vending machine:");
//
//        VendingMachineReader vendingMachineReader = VendingMachineReader.getInstance();
//
//        for(VendingMachine vendingMachine : vendingMachineTable) {
//            System.out.println("2-vendingMachineName: " + vendingMachineReader.vendingMachineNameReader(vendingMachine));
//        }
//
//        for(int i = 0; i< vendingMachineTable.size(); i++) {
//            System.out.println("1-vendingMachineName: " + i + vendingMachineReader.vendingMachineNameReader(vendingMachineTable.get(i)));
//        }

//        int vendingMachineIndex = myScanner.nextInt();
//
//        VendingMachine vendingMachine = vendingMachineTable.get(vendingMachineIndex);
//
//        System.out.println("Here is the available products. Please enter the product you want to purchase: ");
//
//        System.out.println("1-vendingMachineName: " + vendingMachineReader.vendingMachineNameReader(vendingMachine));
//        System.out.println("9-productsOnSale: " + vendingMachineReader.productsOnSaleReader(vendingMachine));
//        System.out.println("10-productsAvailability: " + vendingMachineReader.productsAvailabilityReader(vendingMachine));
//
      }
}
