package controller.definedVendingMachines;

import model.VendingMachine;
import static model.DefinedVendingMachines.definedVendingMachinesList;

public class DefinedVendingMachinesRemover {
    private static DefinedVendingMachinesRemover self = new DefinedVendingMachinesRemover();
    public static DefinedVendingMachinesRemover getInstance() { return self; }

    public void definedVendingMachinesRemoverStarter(VendingMachine vendingMachine) {
        definedVendingMachinesList.remove(vendingMachine);
    }
}
