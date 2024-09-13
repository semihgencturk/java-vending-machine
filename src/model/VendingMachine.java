/*
    Define the attributes and behaviours of the Vending Machine:
        - Which data should be defined in a Vending Machine?
            - Available Storage Unit Number, their capacity
            - Storage Unit Number <-> model.Product
        - Which methods should be operated for a Vending Machine works smoothly?
            - Adding a new model.Product: model.Product, Storage Unit, Amount
*/

package model;

import java.util.HashMap;

public class VendingMachine {
    private static VendingMachine self = new VendingMachine();
    public static VendingMachine getInstance() { return self; }

    private int vendingMachineId;
    private String vendingMachineName;

    private int totalProductStorageUnitNumber;
    private int productStorageUnitCapacity;
    private int totalDenominationStorageUnitNumber;
    private int denominationStorageUnitCapacity;
    private HashMap<Integer, Denomination> denominationsOnUsage = new HashMap<Integer, Denomination>();
    private HashMap<Integer, Integer> denominationsAvailability = new HashMap<Integer, Integer>();
    private HashMap<Integer, Product> productsOnSale = new HashMap<Integer, Product>();
    private HashMap<Integer, Integer> productsAvailability = new HashMap<Integer, Integer>();

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
        if (totalProductStorageUnitNumber >= 0) {
            this.totalProductStorageUnitNumber = totalProductStorageUnitNumber;
        } else {
            throw new IllegalArgumentException("Storage Unit cannot be smaller than 0");
        }
    }

    public int getProductStorageUnitCapacity() {
        return productStorageUnitCapacity;
    }

    public void setProductStorageUnitCapacity(int productStorageUnitCapacity) {
        if (productStorageUnitCapacity >= 0) {
            this.productStorageUnitCapacity = productStorageUnitCapacity;
        } else  {
            throw new IllegalArgumentException("Storage Unit Capacity cannot be smaller than 0");
        }
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

    public void setDenominationsOnUsage(int denominationStorageUnit, Denomination myDenomination) {
        denominationsOnUsage.put(denominationStorageUnit, myDenomination);
    }

    public HashMap<Integer, Integer> getDenominationsAvailability() {
        return denominationsAvailability;
    }

    public void setDenominationAvailability(int denominationStorageUnit, int denominationPiece) {
        denominationsAvailability.put(denominationStorageUnit, denominationPiece);
    }

    public HashMap<Integer, Product> getProductsOnSale() {
        return productsOnSale;
    }

    public void setProductsOnSale(int productStorageUnit, Product myProduct) {
        productsOnSale.put(productStorageUnit, myProduct);
    }

    public HashMap<Integer, Integer> getProductsAvailability() {
        return productsAvailability;
    }

    public void setProductsAvailability(int productStorageUnit, int productPiece) {
        productsAvailability.put(productStorageUnit, productPiece);
    }
}
