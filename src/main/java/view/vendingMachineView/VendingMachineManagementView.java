package view.vendingMachineView;

import java.sql.SQLException;
import java.util.Scanner;

public class VendingMachineManagementView {
    public void getVendingMachineManagementView() throws SQLException {
        VendingMachineCreatorView vendingMachineCreatorView = new VendingMachineCreatorView();
        VendingMachineReaderView vendingMachineReaderView = new VendingMachineReaderView();
        VendingMachineUpdaterView vendingMachineUpdaterView = new VendingMachineUpdaterView();
        VendingMachineDeleterView vendingMachineDeleterView = new VendingMachineDeleterView();

        // List of operations for admin in the vending machine view
        System.out.println("You can manage the vending machines in there. Please select the operation:");
        System.out.println("1- Create A New Vending Machine");
        System.out.println("2- List Of Defined Vending Machines");
        System.out.println("3- See Details of An Existing Vending Machine");
        System.out.println("4- Update An Existing Vending Machine");
        System.out.println("5- Delete An Existing Vending Machine");

        // Get the operation from the user
        Scanner myScanner = new Scanner(System.in);
        int selectedOption = myScanner.nextInt();

        // Route the related page according to selected operation
        switch (selectedOption) {
            case 1:
                vendingMachineCreatorView.createVendingMachine();
                break;
            case 2:
                vendingMachineReaderView.printVendingMachines();
                break;
            case 3:
                vendingMachineReaderView.printVendingMachineById();
                break;
            case 4:
                vendingMachineUpdaterView.updateVendingMachine();
                break;
            case 5:
                vendingMachineDeleterView.deleteVendingMachine();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}