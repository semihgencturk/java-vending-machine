package controller.definedVendingMachines;

import model.VendingMachine;
import static model.DefinedVendingMachineList.definedVendingMachineList;

public class DefinedVendingMachinesAdder {
    private static DefinedVendingMachinesAdder self = new DefinedVendingMachinesAdder();
    public static DefinedVendingMachinesAdder getInstance() { return self; }

    public void definedVendingMachinesAdderStarter(VendingMachine vendingMachine) {
        definedVendingMachineList.add(vendingMachine);
    }
}
