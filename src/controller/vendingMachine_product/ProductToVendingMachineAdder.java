package controller.vendingMachine_product;

import model.Product;
import model.VendingMachine;

public class ProductToVendingMachineAdder {
    public void addingProductToVendingMachine(VendingMachine myVendingMachine, int productStorageUnit, Product myProduct, int amount) {
        myVendingMachine.setProductsOnSale(productStorageUnit, myProduct);
        myVendingMachine.setProductsAvailability(productStorageUnit, amount);
    }
}
