package Controller.vendingMachine;

import Model.VendingMachine;
import java.util.ArrayList;
import static App_data.VendingMachineTable.vendingMachineTable;

public class VendingMachineReaderAll {
    private static VendingMachineReaderAll self = new VendingMachineReaderAll();
    public static VendingMachineReaderAll getInstance() { return self; }

    public ArrayList<VendingMachine> vendingMachineReaderAll() {
        return vendingMachineTable;
    }
}
