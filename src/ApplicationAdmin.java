import model.Denomination;
import model.Product;
import model.VendingMachine;

public class ApplicationAdmin {
    /*
    Admin should be able to conduct following operations:
        - Defining a new machine - Updating and Deleting an existing machine
        - Defining a new product - Restocking the product (Adding, removing)
        - Defining the denominations - Collecting the money, Adding the money
    */

    // Managing Machines

//    public VendingMachine definingNewVendingMachine() {
//        return new VendingMachine();
//    }

    // Managing Denominations

//    public Denomination definingNewDenomination(String myDenominationCurrency, Integer myDenominationAmount){
//        Denomination myDenomination = new Denomination();
//        myDenomination.setDenominationCurrency(myDenominationCurrency);
//        myDenomination.setDenominationAmount(myDenominationAmount);
//
//        return myDenomination;
//    }

    // Managing The Product

//    public Product definingNewProduct(String myProductName, Double myProductPrice){
//        Product myProduct = new Product();
//        myProduct.setProductName(myProductName);
//        myProduct.setProductPrice(myProductPrice);
//
//        return myProduct;
//    }

//    public void updatingExistingProduct(Product myProduct, String myProductName, Double myProductPrice) {
//        myProduct.setProductName(myProductName);
//        myProduct.setProductPrice(myProductPrice);
//    }

//    public void deleteExistingProduct(Product myProduct) {
//        // how to pass by reference in java?
//    }

    // Managing The Product-Vending Machine

//    public void addingProductToVendingMachine(VendingMachine myVendingMachine, int productStorageUnit, Product myProduct, int amount) {
//        myVendingMachine.setProductsOnSale(productStorageUnit, myProduct);
//        myVendingMachine.setProductsAvailability(productStorageUnit, amount);
//    }

//    public void updatingProductInVendingMachine(VendingMachine myVendingMachine, int productStorageUnit, int amount) {
//        myVendingMachine.setProductsAvailability(productStorageUnit, amount);
//    }

//    public void deletingProductFromVendingMachine(VendingMachine myVendingMachine, int productStorageUnit) {
//        myVendingMachine.setProductsOnSale(productStorageUnit, null);
//        myVendingMachine.setProductsAvailability(productStorageUnit, 0);
//    }

    // Managing the Denomination-Vending Machine

//    public void addingDenominationToVendingMachine(VendingMachine myVendingMachine, int denominationStorageUnit, Denomination myDenomination, int amount) {
//        myVendingMachine.setDenominationsOnUsage(denominationStorageUnit, myDenomination);
//        myVendingMachine.setDenominationAvailability(denominationStorageUnit, amount);
//    }

//    public void updatingDenominationInVendingMachine(VendingMachine myVendingMachine, int denominationStorageUnit, int amount) {
//        myVendingMachine.setDenominationAvailability(denominationStorageUnit, amount);
//    }

//    public void deletingDenominationFromVendingMachine(VendingMachine myVendingMachine, int denominationStorageUnit) {
//        myVendingMachine.setDenominationsOnUsage(denominationStorageUnit, null);
//        myVendingMachine.setDenominationAvailability(denominationStorageUnit, 0);
//    }

}
