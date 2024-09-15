package controller.vendingMachine;

import controller.definedDenominations.DefinedDenominationsRemover;
import controller.definedVendingMachines.DefinedVendingMachinesRemover;

public class VendingMachineDeleter {
    private static VendingMachineDeleter self = new VendingMachineDeleter();
    public static VendingMachineDeleter getInstance() { return self; }

    public void vendingMachineDeleterStarter(int vendingMachineIndex) {
        DefinedVendingMachinesRemover.getInstance().definedVendingMachinesRemoverStarter(vendingMachineIndex);
    }
}
