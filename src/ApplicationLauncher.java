import model.VendingMachine;
import view.GreetingPage;

import java.util.ArrayList;

public class ApplicationLauncher {
    public static void main(String[] args) {

        // We're going to launch the machine in there.
        System.out.println("Main is called successfully!");

        GreetingPage.getInstance().greetingPageStarter();

        /*

        Which way is better? Also, research what the best practices are?

        Option A:
        GreetingPage myGreetingPage = new GreetingPage();
        myGreetingPage.greetingPageStarter();

        Option B:
        GreetingPage myGreetingPage = GreetingPage.get();
        myGreetingPage.greetingPageStarter();

        Option C:
        GreetingPage.get().greetingPageStarter();

        */

//        // Admin
//        ApplicationAdmin myVendingMachineAdmin = new ApplicationAdmin();
//
//        //model.Denomination
//        Denomination denomination5 = myVendingMachineAdmin.definingNewDenomination("TRY", 5);
//        Denomination denomination10 = myVendingMachineAdmin.definingNewDenomination("TRY", 10);
//
//        // model.Product
//        Product myProduct1 = myVendingMachineAdmin.definingNewProduct("myProduct1Name", 4.99);
//        Product myProduct2 = myVendingMachineAdmin.definingNewProduct("myProduct2Name", 8.99);
//
//        /*
//        myVendingMachineAdmin.updatingExistingProduct(myProduct1, "Test", 9.99);
//        System.out.println(myProduct1.getProductName());
//        */
//
//        /* It doesn't work since it is passed by value! I should learn how to pass by reference
//        myVendingMachineAdmin.deleteExistingProduct(myProduct1);
//        System.out.println(myProduct1.getProductName());
//        */
//
//        // Machine
//
//
//        // Machine's Denominations
//        myVendingMachineAdmin.addingDenominationToMachine(myVendingMachine1, 1, denomination5, 5);
//        myVendingMachineAdmin.addingDenominationToMachine(myVendingMachine1, 2, denomination10, 15);
//        myVendingMachineAdmin.addingDenominationToMachine(myVendingMachine1, 3, denomination10, 25);
//
//        System.out.println(myVendingMachine1.getDenominationsOnUsage());
//        System.out.println(myVendingMachine1.getDenominationAvailability());
//
//        myVendingMachineAdmin.updatingDenominationInMachine(myVendingMachine1, 1, 4);
//        myVendingMachineAdmin.deletingDenominationFromMachine(myVendingMachine1, 3);
//
//        System.out.println(myVendingMachine1.getDenominationsOnUsage());
//        System.out.println(myVendingMachine1.getDenominationAvailability());
//
//        // Machine's Products
//        myVendingMachineAdmin.addingProductToMachine(myVendingMachine1, 1, myProduct1, 10);
//        myVendingMachineAdmin.addingProductToMachine(myVendingMachine1, 2, myProduct2, 20);
//        myVendingMachineAdmin.addingProductToMachine(myVendingMachine1, 3, myProduct2, 30);
//
//        System.out.println(myVendingMachine1.getProductsOnSale());
//        System.out.println(myVendingMachine1.getProductsAvailability());
//
//        myVendingMachineAdmin.updatingProductInMachine(myVendingMachine1,1, 9);
//        myVendingMachineAdmin.deletingProductFromMachine(myVendingMachine1, 3);
//
//        System.out.println(myVendingMachine1.getProductsOnSale());
//        System.out.println(myVendingMachine1.getProductsAvailability());

        /*
        User interaction:
         user open the machine
         available products and prices are displayed
         user select the products
         payment amount is shown
         user make payment
         checked the payment
         if payment is successful add the money on machine and give the product and update the available products
        */
    }
}
