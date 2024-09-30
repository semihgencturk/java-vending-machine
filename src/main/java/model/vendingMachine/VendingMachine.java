package model.vendingMachine;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;

public class VendingMachine {
    private int vendingMachineId;
    private String vendingMachineName;
    private int totalDenominationStorageUnitCount;
    private int denominationStorageUnitCapacity;
    private int totalProductStorageUnitCount;
    private int productStorageUnitCapacity;
    private HashMap<Integer, DenominationAvailability> denominationOnUsage = new HashMap<>();
    private HashMap<Integer, ProductAvailability> productOnSale =  new HashMap<>();

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

    public HashMap<Integer, DenominationAvailability> getDenominationOnUsage() {
        return denominationOnUsage;
    }
    public void setDenominationOnUsage(int denominationStorageUnitNumber, DenominationAvailability denominationAvailability) {
        denominationOnUsage.put(denominationStorageUnitNumber, denominationAvailability);
    }

    public HashMap<Integer, ProductAvailability> getProductOnSale() {
        return productOnSale;
    }
    public void setProductOnSale(int productStorageUnitNumber, ProductAvailability productAvailability) {
        productOnSale.put(productStorageUnitNumber, productAvailability);
    }
}
