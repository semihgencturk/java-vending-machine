package Views;

import Controllers.vendingMachine.VendingMachineReader;
import Models.Product;
import Models.VendingMachine;
import Views.vendingMachineView.VendingMachineReaderAllView;

import java.util.Scanner;

import static App_data.VendingMachineTable.vendingMachineTable;

public class CustomerView {
    private static CustomerView self = new CustomerView();
    public static CustomerView getInstance() { return self; }

    public void customerView() {
        Scanner myScanner = new Scanner(System.in);
        VendingMachineReader vendingMachineReader = VendingMachineReader.getInstance();

        System.out.println("GREET");
        VendingMachineReaderAllView.getInstance().vendingMachineReaderAllView();
        System.out.println("=====");

        // List of vending machines
        System.out.println("This is the Customer Page. Here are the vending machines. Please select the vending machine:");
        for(VendingMachine vendingMachine : vendingMachineTable) {
            System.out.println("2-vendingMachineName: " + vendingMachineReader.vendingMachineNameReader(vendingMachine));
        }
        int vendingMachineIndex = myScanner.nextInt();
        VendingMachine vendingMachine = vendingMachineTable.get(vendingMachineIndex);

        // Products of selected machine
        System.out.println("Here is the available products. Please enter the product you want to purchase: ");
        System.out.println("1-vendingMachineName: " + vendingMachineReader.vendingMachineNameReader(vendingMachine));
        System.out.println("9-productsOnSale: " + vendingMachineReader.productsOnSaleReader(vendingMachine));
        System.out.println("10-productsAvailability: " + vendingMachineReader.productsAvailabilityReader(vendingMachine));
        int productIndex = myScanner.nextInt();
        Product product = vendingMachine.getProductsOnSale().get(productIndex);

        System.out.println(vendingMachine.getDenominationsOnUsage().get(1));
        // Enter the money
        System.out.println("Total Amount:" + product.getProductPrice());
//        for (Denomination denomination : vendingMachine.getDenominationsOnUsage()) {
//            System.out.println("Enter the denomination number: " + denomination.getDenominationAmount());
//
//        }


    }
}

