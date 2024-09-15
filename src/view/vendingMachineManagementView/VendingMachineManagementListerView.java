package view.vendingMachineManagementView;

import controller.definedVendingMachines.DefinedVendingMachinesLister;

public class VendingMachineManagementListerView {
    private static VendingMachineManagementListerView self = new VendingMachineManagementListerView();
    public static VendingMachineManagementListerView getInstance() { return self; }

    public void vendingMachineManagementListerViewStarter() {
        System.out.println("List of Defined Vending Machines:");
        DefinedVendingMachinesLister.getInstance().definedVendingMachinesListerStarter();
    }
}
