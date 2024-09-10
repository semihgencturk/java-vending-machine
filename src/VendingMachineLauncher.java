import java.util.HashMap;

public class VendingMachineLauncher {
    public static void main(String[] args) {

        // We're going to launch the machine in there.
        System.out.println("Main is called successfully!");

        /*
        What's Next:
        1) Define the Vending Machine Class
        2) Create an instance of it in there
        3) And call the run method defined in the class initialization
        */

        // Admin
        VendingMachineAdmin myVendingMachineAdmin = new VendingMachineAdmin();

        //Denomination
        Denomination denomination5 = myVendingMachineAdmin.definingNewDenomination("TRY", 5);
        Denomination denomination10 = myVendingMachineAdmin.definingNewDenomination("TRY", 10);

        // Product
        Product myProduct1 = myVendingMachineAdmin.definingNewProduct("myProduct1Name", 4.99);
        Product myProduct2 = myVendingMachineAdmin.definingNewProduct("myProduct2Name", 8.99);

        /*
        myVendingMachineAdmin.updatingExistingProduct(myProduct1, "Test", 9.99);
        System.out.println(myProduct1.getProductName());
        */

        /* It doesn't work since it is passed by value! I should learn how to pass by reference
        myVendingMachineAdmin.deleteExistingProduct(myProduct1);
        System.out.println(myProduct1.getProductName());
        */

        // Machine
        VendingMachine myVendingMachine1 = new VendingMachine();

        // Machine's Denominations
        myVendingMachineAdmin.addingDenominationToMachine(myVendingMachine1, 1, denomination5, 5);
        myVendingMachineAdmin.addingDenominationToMachine(myVendingMachine1, 2, denomination10, 15);
        myVendingMachineAdmin.addingDenominationToMachine(myVendingMachine1, 3, denomination10, 25);

        System.out.println(myVendingMachine1.getDenominationsOnUsage());
        System.out.println(myVendingMachine1.getDenominationAvailability());

        myVendingMachineAdmin.updatingDenominationInMachine(myVendingMachine1, 1, 4);
        myVendingMachineAdmin.deletingDenominationFromMachine(myVendingMachine1, 3);

        System.out.println(myVendingMachine1.getDenominationsOnUsage());
        System.out.println(myVendingMachine1.getDenominationAvailability());

        // Machine's Products
        myVendingMachineAdmin.addingProductToMachine(myVendingMachine1, 1, myProduct1, 10);
        myVendingMachineAdmin.addingProductToMachine(myVendingMachine1, 2, myProduct2, 20);
        myVendingMachineAdmin.addingProductToMachine(myVendingMachine1, 3, myProduct2, 30);

        System.out.println(myVendingMachine1.getProductsOnSale());
        System.out.println(myVendingMachine1.getProductsAvailability());

        myVendingMachineAdmin.updatingProductInMachine(myVendingMachine1,1, 9);
        myVendingMachineAdmin.deletingProductFromMachine(myVendingMachine1, 3);

        System.out.println(myVendingMachine1.getProductsOnSale());
        System.out.println(myVendingMachine1.getProductsAvailability());
    }
}
