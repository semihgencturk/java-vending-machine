package App_start;

import App_data.DenominationTable;
import App_data.ProductTable;
import Controllers.vendingMachine.VendingMachineCreator;
import Models.Denomination;
import Models.Product;
import Views.vendingMachineView.VendingMachineReaderAllView;

import java.util.ArrayList;

public class AddToVendingMachineTable {
    private static AddToVendingMachineTable self = new AddToVendingMachineTable();
    public static AddToVendingMachineTable getInstance() { return self; }

    public void addToVendingMachineTable() {
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

        VendingMachineCreator.getInstance().vendingMachineCreator(1, "myVendingMachine1",5,10,5,100, denominationsOnUsage, denominationsAvailability, productsOnSale, productsOnSaleAvailability);
        VendingMachineCreator.getInstance().vendingMachineCreator(2, "myVendingMachine2",5,10,5,100, denominationsOnUsage, denominationsAvailability, productsOnSale, productsOnSaleAvailability);
        VendingMachineCreator.getInstance().vendingMachineCreator(3, "myVendingMachine3",5,10,5,100, denominationsOnUsage, denominationsAvailability, productsOnSale, productsOnSaleAvailability);
    }
}
