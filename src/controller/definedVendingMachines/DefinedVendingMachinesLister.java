package controller.definedVendingMachines;

import static model.DefinedVendingMachineList.definedVendingMachineList;

public class DefinedVendingMachinesLister {
    private static DefinedVendingMachinesLister self = new DefinedVendingMachinesLister();
    public static DefinedVendingMachinesLister getInstance() { return self; }

    public void definedVendingMachinesListerStarter() {
        System.out.println(definedVendingMachineList);
    }
}
