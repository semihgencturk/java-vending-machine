package view.vendingMachineView;

import controller.VendingMachineDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class VendingMachineDeleterView {
    public void deleteVendingMachine() throws SQLException {
        VendingMachineDatabaseController vendingMachineDatabaseController = new VendingMachineDatabaseController();
        VendingMachineReaderView vendingMachineReaderView = new VendingMachineReaderView();
        Scanner myScanner = new Scanner(System.in);

        vendingMachineReaderView.printVendingMachines();

        // Get all necessary information from the user to delete a vending machine
        System.out.println("Enter the vending machine id you want to delete: (Expected integer - Example entry: 34)");
        int vendingMachineId = myScanner.nextInt();

        vendingMachineDatabaseController.deleteVendingMachine(vendingMachineId);

        System.out.println("Vending machine is deleted successfully!");
    }
}
