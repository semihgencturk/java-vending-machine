package Controllers.vendingMachine;

import Models.Denomination;
import Models.Product;
import Models.VendingMachine;

public class VendingMachineUpdater {
    private static VendingMachineUpdater self = null;
    public static VendingMachineUpdater getInstance() {
        if (self == null) {
            self = new VendingMachineUpdater();
        }
        return self;
    }

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
    public void denominationsOnUsageUpdater(VendingMachine vendingMachine, int denominationStorageUnit, Denomination denomination) {
        vendingMachine.setDenominationsOnUsage(denominationStorageUnit, denomination);
    };
    public void getDenominationsOnUsageAvailability(VendingMachine vendingMachine, int denominationStorageUnit, int denominationPiece) {
        vendingMachine.denominationsOnUsageAvailability(denominationStorageUnit, denominationPiece);
    };
    public void productsOnSaleUpdater(VendingMachine vendingMachine, int productStorageUnit, Product product) {
        vendingMachine.setProductsOnSale(productStorageUnit, product);
    };
    public void productsAvailabilityUpdater(VendingMachine vendingMachine, int productStorageUnit, int productPiece) {
        vendingMachine.productsOnSaleAvailability(productStorageUnit, productPiece);
    }
}
