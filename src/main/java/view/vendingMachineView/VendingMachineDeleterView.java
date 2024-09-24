package view.vendingMachineView;

import controller.VendingMachineDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class VendingMachineDeleterView {
    public void deleteVendingMachine() throws SQLException {
        VendingMachineDatabaseController vendingMachineController = new VendingMachineDatabaseController();
        Scanner myScanner = new Scanner(System.in);

        // Get all necessary information from the user to delete a vending machine
        System.out.println("Enter the vending machine id you want to delete: ");
        int vendingMachineId = myScanner.nextInt();

        // Delete the vending machine from the database
        vendingMachineController.deleteVendingMachine(vendingMachineId);
    }
}
