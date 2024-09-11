package controller.vendingMachine_product;

import model.VendingMachine;

public class ProductToVendingMachineUpdater {
    public void updatingProductInVendingMachine(VendingMachine myVendingMachine, int productStorageUnit, int amount) {
        myVendingMachine.setProductsAvailability(productStorageUnit, amount);
    }
}
