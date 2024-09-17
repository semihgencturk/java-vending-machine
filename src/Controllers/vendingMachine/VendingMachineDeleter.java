package Controllers.vendingMachine;

import static App_data.VendingMachineTable.vendingMachineTable;

public class VendingMachineDeleter {
    private static VendingMachineDeleter self = null;
    public static VendingMachineDeleter getInstance() {
        if (self == null) {
            self = new VendingMachineDeleter();
        }
        return self;
    }

    public void vendingMachineDeleter(int vendingMachineIndex) {
        vendingMachineTable.remove(vendingMachineIndex);
    }
}
