package controller.currentVendingMachines;

import static model.CurrentVendingMachines.currentVendingMachinesList;

public class CurrentVendingMachinesLister {
    private static CurrentVendingMachinesLister self = new CurrentVendingMachinesLister();
    public static CurrentVendingMachinesLister getInstance() { return self; }

    public void currentVendingMachinesListerStarter() {
        System.out.println(currentVendingMachinesList);
    }
}
