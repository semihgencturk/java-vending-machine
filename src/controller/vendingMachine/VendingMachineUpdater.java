package controller.vendingMachine;

import model.Denomination;
import model.Product;
import model.VendingMachine;

public class VendingMachineUpdater {
    private static VendingMachineUpdater self = new VendingMachineUpdater();
    public static VendingMachineUpdater getInstance() { return self; }

    public void totalProductStorageUnitNumberUpdater(VendingMachine selectedVendingMachine, int totalProductStorageUnitNumber) {
        selectedVendingMachine.setTotalProductStorageUnitNumber(totalProductStorageUnitNumber);
    };
    public void productStorageUnitCapacityUpdater(VendingMachine selectedVendingMachine, int productStorageUnitCapacity) {
        selectedVendingMachine.setProductStorageUnitCapacity(productStorageUnitCapacity);
    };
    public void totalDenominationStorageUnitNumberUpdater(VendingMachine selectedVendingMachine, int totalDenominationStorageUnitNumber) {
        selectedVendingMachine.setTotalDenominationStorageUnitNumber(totalDenominationStorageUnitNumber);
    };
    public void denominationStorageUnitCapacityUpdater(VendingMachine selectedVendingMachine, int denominationStorageUnitCapacity) {
        selectedVendingMachine.setDenominationStorageUnitCapacity(denominationStorageUnitCapacity);
    };
    public void denominationsOnUsageUpdater(VendingMachine selectedVendingMachine, int denominationStorageUnit, Denomination myDenomination) {
        selectedVendingMachine.setDenominationsOnUsage(denominationStorageUnit, myDenomination);
    };
    public void denominationAvailabilityUpdater(VendingMachine selectedVendingMachine, int denominationStorageUnit, int denominationPiece) {
        selectedVendingMachine.setDenominationAvailability(denominationStorageUnit, denominationPiece);
    };
    public void productsOnSaleUpdater(VendingMachine selectedVendingMachine, int productStorageUnit, Product myProduct) {
        selectedVendingMachine.setProductsOnSale(productStorageUnit, myProduct);
    };
    public void productsAvailabilityUpdater(VendingMachine selectedVendingMachine, int productStorageUnit, int productPiece) {
        selectedVendingMachine.setProductsAvailability(productStorageUnit, productPiece);
    }
}
