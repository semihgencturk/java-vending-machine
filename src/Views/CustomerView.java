package Views;

import Controllers.vendingMachine.VendingMachineReader;
import Models.Denomination;
import Models.Product;
import Models.VendingMachine;
import java.util.HashMap;
import java.util.Scanner;
import static App_data.VendingMachineTable.vendingMachineTable;

public class CustomerView {
    private static CustomerView self = null;
    public static CustomerView getInstance() {
        if (self == null) {
            self = new CustomerView();
        }
        return self;
    }

    public void customerView() {
//        Scanner myScanner = new Scanner(System.in);
//        VendingMachineReader vendingMachineReader = VendingMachineReader.getInstance();
//
//        // List of vending machines
//        System.out.println("This is the Customer Page. Here are the vending machines. Please select the vending machine:");
//        for(VendingMachine vendingMachine : vendingMachineTable) {
//            System.out.println("2-vendingMachineName: " + vendingMachineReader.vendingMachineNameReader(vendingMachine));
//        }
//        int vendingMachineIndex = myScanner.nextInt();
//        VendingMachine vendingMachine = vendingMachineTable.get(vendingMachineIndex);
//
//        // Products of selected machine
//        System.out.println("Here is the available products. Please enter the product you want to purchase: ");
//        System.out.println("1-vendingMachineName: " + vendingMachineReader.vendingMachineNameReader(vendingMachine));
//        System.out.println("9-productsOnSale: " + vendingMachineReader.productsOnSaleReader(vendingMachine));
//        System.out.println("10-productsAvailability: " + vendingMachineReader.productsAvailabilityReader(vendingMachine));
//        int productIndex = myScanner.nextInt();
//        Product product = vendingMachine.getProductsOnSale().get(productIndex);
//
//        // Enter the money
//        System.out.println("Total Amount:" + product.getProductPrice());
//        HashMap<Denomination, Integer> denominationsOnUsage = new HashMap<>();
//        //int totalEnteredMoney
//
//        for(int i=0; i<=vendingMachine.getDenominationsOnUsage().size(); i++){
//            System.out.println("Denomination number:");
//            Integer enteredMoney = myScanner.nextInt();
//            denominationsOnUsage.put((Denomination) vendingMachine.getDenominationsOnUsage().values().toArray()[i], enteredMoney);
//        }
    }
}

