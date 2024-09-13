package controller.definedVendingMachines;

import static model.DefinedVendingMachines.definedVendingMachinesList;

public class DefinedVendingMachinesLister {
    private static DefinedVendingMachinesLister self = new DefinedVendingMachinesLister();
    public static DefinedVendingMachinesLister getInstance() { return self; }

    public void definedVendingMachinesListerStarter() {
        System.out.println(definedVendingMachinesList);
    }
}
