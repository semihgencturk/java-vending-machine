package controller.vendingMachine;

import model.Denomination;
import model.Product;
import model.VendingMachine;
import java.util.HashMap;

public class VendingMachineReader {
    private static VendingMachineReader self = null;
    public static VendingMachineReader getInstance() {
        if (self == null) {
            self = new VendingMachineReader();
        }
        return self;
    }

    public int vendingMachineIdReader(VendingMachine vendingMachine) {
        return vendingMachine.getVendingMachineId();
    }
    public String vendingMachineNameReader(VendingMachine vendingMachine) {
        return vendingMachine.getVendingMachineName();
    }
    public int totalProductStorageUnitNumberReader(VendingMachine vendingMachine) {
        return vendingMachine.getTotalProductStorageUnitNumber();
    }
    public int productStorageUnitCapacityReader(VendingMachine vendingMachine) {
        return vendingMachine.getProductStorageUnitCapacity();
    }
    public int totalDenominationStorageUnitNumberReader(VendingMachine vendingMachine) {
        return vendingMachine.getTotalDenominationStorageUnitNumber();
    }
    public int denominationStorageUnitCapacityReader(VendingMachine vendingMachine) {
        return vendingMachine.getDenominationStorageUnitCapacity();
    }
    public HashMap<Integer, Denomination> denominationsOnUsageReader(VendingMachine vendingMachine) {
        return vendingMachine.getDenominationsOnUsage();
    }
    public HashMap<Integer, Integer> getDenominationsOnUsageAvailability(VendingMachine vendingMachine) {
        return vendingMachine.getDenominationsOnUsageAvailability();
    }
    public HashMap<Integer, Product> productsOnSaleReader(VendingMachine vendingMachine) {
        return vendingMachine.getProductsOnSale();
    }
    public HashMap<Integer, Integer> productsAvailabilityReader(VendingMachine vendingMachine) {
        return vendingMachine.getProductsOnSaleAvailability();
    }
}
