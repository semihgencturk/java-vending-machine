package Controller.vendingMachine;

import static App_data.VendingMachineTable.vendingMachineTable;

public class VendingMachineDeleter {
    private static VendingMachineDeleter self = new VendingMachineDeleter();
    public static VendingMachineDeleter getInstance() { return self; }

    public void vendingMachineDeleter(int vendingMachineIndex) {
        vendingMachineTable.remove(vendingMachineIndex);
    }
}
