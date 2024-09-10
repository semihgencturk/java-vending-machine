public class VendingMachineAdmin {
    /*
    Admin should be able to conduct following operations:
        - Defining a new Product - Restocking the product (Adding, removing)
        - Defining the denominations - Collecting the money, Adding the money
    */

    // Managing Denominations

    public Denomination definingNewDenomination(String myDenominationCurrency, Integer myDenominationAmount){
        Denomination myDenomination = new Denomination();
        myDenomination.setDenominationCurrency(myDenominationCurrency);
        myDenomination.setDenominationAmount(myDenominationAmount);

        return myDenomination;
    }

    // Managing The Product

    public Product definingNewProduct(String myProductName, Double myProductPrice){
        Product myProduct = new Product();
        myProduct.setProductName(myProductName);
        myProduct.setProductPrice(myProductPrice);

        return myProduct;
    }

    public void updatingExistingProduct(Product myProduct, String myProductName, Double myProductPrice) {
        myProduct.setProductName(myProductName);
        myProduct.setProductPrice(myProductPrice);
    }

    public void deleteExistingProduct(Product myProduct) {
        // how to pass by reference in java?
    }

    // Managing The Product-Machine

    public void addingProductToMachine(VendingMachine myVendingMachine, int productStorageUnit, Product myProduct, int amount) {
        myVendingMachine.setProductsOnSale(productStorageUnit, myProduct);
        myVendingMachine.setProductsAvailability(productStorageUnit, amount);
    }

    public void updatingProductInMachine(VendingMachine myVendingMachine, int productStorageUnit, int amount) {
        myVendingMachine.setProductsAvailability(productStorageUnit, amount);
    }

    public void deletingProductFromMachine(VendingMachine myVendingMachine, int productStorageUnit) {
        myVendingMachine.setProductsOnSale(productStorageUnit, null);
        myVendingMachine.setProductsAvailability(productStorageUnit, 0);
    }

    // Managing the Machine-Denomination

    public void addingDenominationToMachine(VendingMachine myVendingMachine, int denominationStorageUnit, Denomination myDenomination, int amount) {
        myVendingMachine.setDenominationsOnUsage(denominationStorageUnit, myDenomination);
        myVendingMachine.setDenominationAvailability(denominationStorageUnit, amount);
    }

    public void updatingDenominationInMachine(VendingMachine myVendingMachine, int denominationStorageUnit, int amount) {
        myVendingMachine.setDenominationAvailability(denominationStorageUnit, amount);
    }

    public void deletingDenominationFromMachine(VendingMachine myVendingMachine, int denominationStorageUnit) {
        myVendingMachine.setDenominationsOnUsage(denominationStorageUnit, null);
        myVendingMachine.setDenominationAvailability(denominationStorageUnit, 0);
    }

}
