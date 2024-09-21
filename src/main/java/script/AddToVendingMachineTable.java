package script;

import app_data.DenominationTable;
import app_data.ProductTable;
import controller.vendingMachine.VendingMachineCreator;
import model.Denomination;
import model.Product;

import java.util.ArrayList;

public class AddToVendingMachineTable {
    private static AddToVendingMachineTable self = null;
    public static AddToVendingMachineTable getInstance() {
        if (self == null) {
            self = new AddToVendingMachineTable();
        }
        return self;
    }

    public void addToVendingMachineTable() {
        VendingMachineCreator vendingMachineCreator = VendingMachineCreator.getInstance();

        ArrayList<Denomination> denominationsOnUsage = DenominationTable.denominationTable;
        ArrayList<Integer> denominationsAvailability = new ArrayList<>();
        ArrayList<Product> productsOnSale = ProductTable.productTable;
        ArrayList<Integer> productsOnSaleAvailability = new ArrayList<>();

        for (int i = 0; i <= denominationsOnUsage.size(); i++) {
            denominationsAvailability.add(10);
        }

        for (int i = 0; i <= productsOnSale.size(); i++) {
            productsOnSaleAvailability.add(5);
        }

        vendingMachineCreator.vendingMachineCreator(1, "myVendingMachine1",5,10,5,100, denominationsOnUsage, denominationsAvailability, productsOnSale, productsOnSaleAvailability);
        vendingMachineCreator.vendingMachineCreator(2, "myVendingMachine2",5,10,5,100, denominationsOnUsage, denominationsAvailability, productsOnSale, productsOnSaleAvailability);
        vendingMachineCreator.vendingMachineCreator(3, "myVendingMachine3",5,10,5,100, denominationsOnUsage, denominationsAvailability, productsOnSale, productsOnSaleAvailability);
    }
}
