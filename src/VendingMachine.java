public class VendingMachine {
    /*
    Define the attributes and behaviours of the Vending Machine:
        - Which data should be defined in a Vending Machine?
            - Available Storage Unit Number
            - Storage Unit Number <-> Product ID
        - Which methods should be operated for a Vending Machine works smoothly?
            - Adding a new Product
     */

    private int AvailableStorageUnitNumber;

    public int getAvailableStorageUnitNumber() {
        return AvailableStorageUnitNumber;
    }

    public void setAvailableStorageUnitNumber(int availableStorageUnitNumber) {
        if (availableStorageUnitNumber >= 0) {
            this.AvailableStorageUnitNumber = availableStorageUnitNumber;
        } else {
            throw new IllegalArgumentException("Storage Unit cannot be smaller than 0");
        }
    }
}
