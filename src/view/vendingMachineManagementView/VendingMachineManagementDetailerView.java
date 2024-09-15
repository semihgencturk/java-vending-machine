package view.vendingMachineManagementView;

import controller.vendingMachine.VendingMachineDetailer;

import java.util.Scanner;

public class VendingMachineManagementDetailerView {
    private static VendingMachineManagementDetailerView self = new VendingMachineManagementDetailerView();
    public static VendingMachineManagementDetailerView getInstance() { return self; }

    public void vendingMachineManagementDetailerViewStarter(){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the vending machine you want to see its details:");
        int vendingMachine = myScanner.nextInt();

        VendingMachineDetailer.getInstance().vendingMachineDetailerStarter(vendingMachine);
    }
}
