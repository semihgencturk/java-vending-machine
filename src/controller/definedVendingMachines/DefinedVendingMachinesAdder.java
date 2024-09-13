package controller.definedVendingMachines;

import model.VendingMachine;
import static model.DefinedVendingMachines.definedVendingMachinesList;

public class DefinedVendingMachinesAdder {
    private static DefinedVendingMachinesAdder self = new DefinedVendingMachinesAdder();
    public static DefinedVendingMachinesAdder getInstance() { return self; }

    public void definedVendingMachinesAdderStarter(VendingMachine vendingMachine) {
        definedVendingMachinesList.add(vendingMachine);
    }
}
