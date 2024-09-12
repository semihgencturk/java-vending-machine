package controller.currentVendingMachines;

import java.util.Scanner;

import static model.CurrentVendingMachines.currentVendingMachinesList;

public class CurrentVendingMachinesDeleter {
    private static CurrentVendingMachinesDeleter self = new CurrentVendingMachinesDeleter();
    public static CurrentVendingMachinesDeleter getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void CurrentVendingMachinesDeleterStarter() {
        System.out.println("Please select the vending machine you want to update:");

        int selectedVendingMachine = myScanner.nextInt();

        currentVendingMachinesList.remove(selectedVendingMachine);
        // ?? currentVendingMachinesList.remove(currentVendingMachinesList.indexOf(selectedVendingMachine));
    }
}
