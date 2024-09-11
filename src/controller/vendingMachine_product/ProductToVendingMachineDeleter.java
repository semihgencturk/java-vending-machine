package controller.vendingMachine_product;

import model.VendingMachine;

public class ProductToVendingMachineDeleter {
    public void deletingProductFromVendingMachine(VendingMachine myVendingMachine, int productStorageUnit) {
        myVendingMachine.setProductsOnSale(productStorageUnit, null);
        myVendingMachine.setProductsAvailability(productStorageUnit, 0);
    }
}
