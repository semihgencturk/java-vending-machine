package model;

import java.util.HashMap;

public class VendingMachine {
    private int vendingMachineId;
    private String vendingMachineName;
    private int totalDenominationStorageUnitCount;
    private int denominationStorageUnitCapacity;
    private int totalProductStorageUnitCount;
    private int productStorageUnitCapacity;

    private HashMap<Integer, Integer> denominationsOnUsage = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> denominationsOnUsageAvailability = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> productsOnSale = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> productsOnSaleAvailability = new HashMap<Integer, Integer>();

    public int getVendingMachineId() {
        return vendingMachineId;
    }
    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public String getVendingMachineName() {
        return vendingMachineName;
    }
    public void setVendingMachineName(String vendingMachineName) {
        this.vendingMachineName = vendingMachineName;
    }

    public int getTotalDenominationStorageUnitCount() {
        return totalDenominationStorageUnitCount;
    }
    public void setTotalDenominationStorageUnitCount(int totalDenominationStorageUnitCount) {
        this.totalDenominationStorageUnitCount = totalDenominationStorageUnitCount;
    }

    public int getDenominationStorageUnitCapacity() {
        return denominationStorageUnitCapacity;
    }
    public void setDenominationStorageUnitCapacity(int denominationStorageUnitCapacity) {
        this.denominationStorageUnitCapacity = denominationStorageUnitCapacity;
    }

    public int getTotalProductStorageUnitCount() {
        return totalProductStorageUnitCount;
    }
    public void setTotalProductStorageUnitCount(int totalProductStorageUnitCount) {
        this.totalProductStorageUnitCount = totalProductStorageUnitCount;
    }

    public int getProductStorageUnitCapacity() {
        return productStorageUnitCapacity;
    }
    public void setProductStorageUnitCapacity(int productStorageUnitCapacity) {
        this.productStorageUnitCapacity = productStorageUnitCapacity;
    }

    public HashMap<Integer, Integer> getDenominationsOnUsage() {
        return denominationsOnUsage;
    }
    public void setDenominationsOnUsage(int denominationStorageUnit, int denominationId) {
        denominationsOnUsage.put(denominationStorageUnit, denominationId);
    }

    public HashMap<Integer, Integer> getDenominationsOnUsageAvailability() {
        return denominationsOnUsageAvailability;
    }
    public void setDenominationsOnUsageAvailability(int denominationStorageUnit, int denominationPiece) {
        denominationsOnUsageAvailability.put(denominationStorageUnit, denominationPiece);
    }

    public HashMap<Integer, Integer> getProductsOnSale() {
        return productsOnSale;
    }
    public void setProductsOnSale(int productStorageUnit, int productId) {
        productsOnSale.put(productStorageUnit, productId);
    }

    public HashMap<Integer, Integer> getProductsOnSaleAvailability() {
        return productsOnSaleAvailability;
    }
    public void setProductsOnSaleAvailability(int productStorageUnit, int productPiece) {
        productsOnSaleAvailability.put(productStorageUnit, productPiece);
    }
}
