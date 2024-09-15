package Controller.vendingMachine;

import Model.VendingMachine;
import static App_data.VendingMachineTable.vendingMachineTable;

public class VendingMachineReader {
    private static VendingMachineReader self = new VendingMachineReader();
    public static VendingMachineReader getInstance() { return self; }

    public VendingMachine vendingMachineReader(int vendingMachineIndex) {
        return vendingMachineTable.get(vendingMachineIndex);
    }
}
