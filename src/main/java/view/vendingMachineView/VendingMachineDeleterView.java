package view.vendingMachineView;

import controller.DatabaseController;
import java.util.Scanner;

public class VendingMachineDeleterView {
    public void deleteVendingMachine(){
        DatabaseController databaseController = new DatabaseController();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the vending machine id you want to delete: ");
        int vendingMachineId = myScanner.nextInt();

        databaseController.deleteVendingMachine(vendingMachineId);
    }
}
