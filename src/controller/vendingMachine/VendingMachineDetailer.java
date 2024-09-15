package controller.vendingMachine;

import static model.DefinedVendingMachineList.definedVendingMachineList;

public class VendingMachineDetailer {
    private static VendingMachineDetailer self = new VendingMachineDetailer();
    public static VendingMachineDetailer getInstance() { return self; }

    public void vendingMachineDetailerStarter(int vendingMachineIndex) {
        System.out.println(definedVendingMachineList.get(vendingMachineIndex));
    }
}
