package Models;

import java.util.HashMap;

public class VendingMachine {
    private int vendingMachineId;
    private String vendingMachineName;
    private int totalProductStorageUnitNumber;
    private int productStorageUnitCapacity;
    private int totalDenominationStorageUnitNumber;
    private int denominationStorageUnitCapacity;
    private HashMap<Integer, Denomination> denominationsOnUsage = new HashMap<Integer, Denomination>();
    private HashMap<Integer, Integer> denominationsOnUsageAvailability = new HashMap<Integer, Integer>();
    private HashMap<Integer, Product> productsOnSale = new HashMap<Integer, Product>();
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

    public int getTotalProductStorageUnitNumber() {
        return totalProductStorageUnitNumber;
    }

    public void setTotalProductStorageUnitNumber(int totalProductStorageUnitNumber) {
        this.totalProductStorageUnitNumber = totalProductStorageUnitNumber;
    }

    public int getProductStorageUnitCapacity() {
        return productStorageUnitCapacity;
    }

    public void setProductStorageUnitCapacity(int productStorageUnitCapacity) {
        this.productStorageUnitCapacity = productStorageUnitCapacity;
    }

    public int getTotalDenominationStorageUnitNumber() {
        return totalDenominationStorageUnitNumber;
    }

    public void setTotalDenominationStorageUnitNumber(int totalDenominationStorageUnitNumber) {
        this.totalDenominationStorageUnitNumber = totalDenominationStorageUnitNumber;
    }

    public int getDenominationStorageUnitCapacity() {
        return denominationStorageUnitCapacity;
    }

    public void setDenominationStorageUnitCapacity(int denominationStorageUnitCapacity) {
        this.denominationStorageUnitCapacity = denominationStorageUnitCapacity;
    }

    public HashMap<Integer, Denomination> getDenominationsOnUsage() {
        return denominationsOnUsage;
    }

    public void setDenominationsOnUsage(int denominationStorageUnit, Denomination denomination) {
        denominationsOnUsage.put(denominationStorageUnit, denomination);
    }

    public HashMap<Integer, Integer> getDenominationsOnUsageAvailability() {
        return denominationsOnUsageAvailability;
    }

    public void denominationsOnUsageAvailability(int denominationStorageUnit, int denominationPiece) {
        denominationsOnUsageAvailability.put(denominationStorageUnit, denominationPiece);
    }

    public HashMap<Integer, Product> getProductsOnSale() {
        return productsOnSale;
    }

    public void setProductsOnSale(int productStorageUnit, Product product) {
        productsOnSale.put(productStorageUnit, product);
    }

    public HashMap<Integer, Integer> getProductsOnSaleAvailability() {
        return productsOnSaleAvailability;
    }

    public void productsOnSaleAvailability(int productStorageUnit, int productPiece) {
        productsOnSaleAvailability.put(productStorageUnit, productPiece);
    }
}
