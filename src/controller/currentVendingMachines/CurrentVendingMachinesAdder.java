package controller.currentVendingMachines;

import model.VendingMachine;

import static model.CurrentVendingMachines.currentVendingMachinesList;

public class CurrentVendingMachinesAdder {
    private static CurrentVendingMachinesAdder self = new CurrentVendingMachinesAdder();
    public static CurrentVendingMachinesAdder getInstance() { return self; }

    public void CurrentVendingMachinesAdderStarter(VendingMachine myVendingMachine) {
        currentVendingMachinesList.add(myVendingMachine);
    }
}
