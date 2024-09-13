package controller.vendingMachine;

import model.Denomination;
import model.Product;
import model.VendingMachine;

public class VendingMachineUpdater {
    private static VendingMachineUpdater self = new VendingMachineUpdater();
    public static VendingMachineUpdater getInstance() { return self; }

    public void vendingMachineIdUpdater(VendingMachine vendingMachine, int vendingMachineId) {
        vendingMachine.setVendingMachineId(vendingMachineId);
    }
    public void vendingMachineNameUpdater(VendingMachine vendingMachine, String vendingMachineName) {
        vendingMachine.setVendingMachineName(vendingMachineName);
    }
    public void totalProductStorageUnitNumberUpdater(VendingMachine vendingMachine, int totalProductStorageUnitNumber) {
        vendingMachine.setTotalProductStorageUnitNumber(totalProductStorageUnitNumber);
    };
    public void productStorageUnitCapacityUpdater(VendingMachine vendingMachine, int productStorageUnitCapacity) {
        vendingMachine.setProductStorageUnitCapacity(productStorageUnitCapacity);
    };
    public void totalDenominationStorageUnitNumberUpdater(VendingMachine vendingMachine, int totalDenominationStorageUnitNumber) {
        vendingMachine.setTotalDenominationStorageUnitNumber(totalDenominationStorageUnitNumber);
    };
    public void denominationStorageUnitCapacityUpdater(VendingMachine vendingMachine, int denominationStorageUnitCapacity) {
        vendingMachine.setDenominationStorageUnitCapacity(denominationStorageUnitCapacity);
    };
    public void denominationsOnUsageUpdater(VendingMachine vendingMachine, int denominationStorageUnit, Denomination myDenomination) {
        vendingMachine.setDenominationsOnUsage(denominationStorageUnit, myDenomination);
    };
    public void denominationAvailabilityUpdater(VendingMachine vendingMachine, int denominationStorageUnit, int denominationPiece) {
        vendingMachine.setDenominationAvailability(denominationStorageUnit, denominationPiece);
    };
    public void productsOnSaleUpdater(VendingMachine vendingMachine, int productStorageUnit, Product myProduct) {
        vendingMachine.setProductsOnSale(productStorageUnit, myProduct);
    };
    public void productsAvailabilityUpdater(VendingMachine vendingMachine, int productStorageUnit, int productPiece) {
        vendingMachine.setProductsAvailability(productStorageUnit, productPiece);
    }
}
