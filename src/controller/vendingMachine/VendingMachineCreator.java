package controller.vendingMachine;
import model.VendingMachine;


public class VendingMachineCreator {
    private static VendingMachineCreator self = new VendingMachineCreator();
    public static VendingMachineCreator getInstance() { return self; }

    public VendingMachine VendingMachineCreatorStarter() {
            return VendingMachine.getInstance();
    }

    public VendingMachine VendingMachineCreatorStarter(int vendingMachineId,
                                                       String vendingMachineName,
                                                       int totalProductStorageUnitNumber,
                                                       int productStorageUnitCapacity,
                                                       int totalDenominationStorageUnitNumber,
                                                       int denominationStorageUnitCapacity) {

        VendingMachine vendingMachine = VendingMachine.getInstance();

        vendingMachine.setVendingMachineId(vendingMachineId);
        vendingMachine.setVendingMachineName(vendingMachineName);
        vendingMachine.setTotalProductStorageUnitNumber(totalProductStorageUnitNumber);
        vendingMachine.setProductStorageUnitCapacity(productStorageUnitCapacity);
        vendingMachine.setTotalDenominationStorageUnitNumber(totalDenominationStorageUnitNumber);
        vendingMachine.setDenominationStorageUnitCapacity(denominationStorageUnitCapacity);

        return vendingMachine;
    }
}

/*
private HashMap<Integer, Denomination> denominationsOnUsage = new HashMap<Integer, Denomination>();
private HashMap<Integer, Integer> denominationsAvailability = new HashMap<Integer, Integer>();
private HashMap<Integer, Product> productsOnSale = new HashMap<Integer, Product>();
private HashMap<Integer, Integer> productsAvailability = new HashMap<Integer, Integer>();
*/