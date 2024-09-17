package Controllers.vendingMachine;

import Models.Denomination;
import Models.Product;
import Models.VendingMachine;
import java.util.ArrayList;
import static App_data.VendingMachineTable.vendingMachineTable;

public class VendingMachineCreator {
    private static VendingMachineCreator self = new VendingMachineCreator();
    public static VendingMachineCreator getInstance() { return self; }

    public void vendingMachineCreator() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachineTable.add(vendingMachine);
    }

    public void vendingMachineCreator(int vendingMachineId,
                                      String vendingMachineName,
                                      int totalProductStorageUnitNumber,
                                      int productStorageUnitCapacity,
                                      int totalDenominationStorageUnitNumber,
                                      int denominationStorageUnitCapacity,
                                      ArrayList<Denomination> denominationsOnUsage,
                                      ArrayList<Integer> denominationsOnUsageAvailability,
                                      ArrayList<Product> productsOnSale,
                                      ArrayList<Integer> productsOnSaleAvailability) {

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.setVendingMachineId(vendingMachineId);
        vendingMachine.setVendingMachineName(vendingMachineName);
        vendingMachine.setTotalProductStorageUnitNumber(totalProductStorageUnitNumber);
        vendingMachine.setProductStorageUnitCapacity(productStorageUnitCapacity);
        vendingMachine.setTotalDenominationStorageUnitNumber(totalDenominationStorageUnitNumber);
        vendingMachine.setDenominationStorageUnitCapacity(denominationStorageUnitCapacity);
        for(int denominationStorageUnit=0; denominationStorageUnit < totalDenominationStorageUnitNumber; denominationStorageUnit++){
            vendingMachine.setDenominationsOnUsage(denominationStorageUnit, denominationsOnUsage.get(denominationStorageUnit));
            vendingMachine.denominationsOnUsageAvailability(denominationStorageUnit,denominationsOnUsageAvailability.get(denominationStorageUnit));
        }
        for(int productStorageUnit=0; productStorageUnit < totalProductStorageUnitNumber; productStorageUnit++){
            vendingMachine.setProductsOnSale(productStorageUnit, productsOnSale.get(productStorageUnit));
            vendingMachine.productsOnSaleAvailability(productStorageUnit,productsOnSaleAvailability.get(productStorageUnit));
        }

        vendingMachineTable.add(vendingMachine);
    }
}
