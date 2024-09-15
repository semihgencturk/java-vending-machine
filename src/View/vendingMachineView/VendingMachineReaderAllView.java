package View.vendingMachineView;

import Controller.vendingMachine.VendingMachineReaderAll;

public class VendingMachineReaderAllView {
    private static VendingMachineReaderAllView self = new VendingMachineReaderAllView();
    public static VendingMachineReaderAllView getInstance() { return self; }

    public void vendingMachineReaderAllView() {
        System.out.println("List of Defined Vending Machines:");
        System.out.println(VendingMachineReaderAll.getInstance().vendingMachineReaderAll());
    }
}
