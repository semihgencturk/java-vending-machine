package controller.definedVendingMachines;

import static model.DefinedVendingMachineList.definedVendingMachineList;

public class DefinedVendingMachinesRemover {
    private static DefinedVendingMachinesRemover self = new DefinedVendingMachinesRemover();
    public static DefinedVendingMachinesRemover getInstance() { return self; }

    public void definedVendingMachinesRemoverStarter(int vendingMachineIndex) {
        definedVendingMachineList.remove(vendingMachineIndex);
    }
}
