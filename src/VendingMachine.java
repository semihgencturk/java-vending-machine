import java.util.HashMap;

public class VendingMachine {
    /*
    Define the attributes and behaviours of the Vending Machine:
        - Which data should be defined in a Vending Machine?
            - Available Storage Unit Number, their capacity
            - Storage Unit Number <-> Product
        - Which methods should be operated for a Vending Machine works smoothly?
            - Adding a new Product: Product, Storage Unit, Amount
     */

    private int totalProductStorageUnitNumber;
    private int productStorageUnitCapacity;

    private int totalDenominationStorageUnitNumber;
    private int denominationStorageUnitCapacity;

    private HashMap<Integer, Denomination> denominationsOnUsage = new HashMap<Integer, Denomination>();
    private HashMap<Integer, Integer> denominationAvailability = new HashMap<Integer, Integer>();
    private HashMap<Integer, Product> productsOnSale = new HashMap<Integer, Product>();
    private HashMap<Integer, Integer> productsAvailability = new HashMap<Integer, Integer>();

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

    public HashMap<Integer, Integer> getDenominationAvailability() {
        return denominationAvailability;
    }

    public void setDenominationAvailability(int denominationStorageUnit, int amount) {
        denominationAvailability.put(denominationStorageUnit, amount);
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

    public void setProductsAvailability(int productStorageUnit, int amount) {
        productsAvailability.put(productStorageUnit, amount);
    }
}
