package view.vendingMachineView;

import controller.VendingMachineController;
import java.util.Scanner;

public class VendingMachineDeleterView {
    public void deleteVendingMachine(){
        VendingMachineController vendingMachineController = new VendingMachineController();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the vending machine id you want to delete: ");
        int vendingMachineId = myScanner.nextInt();

        vendingMachineController.deleteVendingMachine(vendingMachineId);
    }
}
