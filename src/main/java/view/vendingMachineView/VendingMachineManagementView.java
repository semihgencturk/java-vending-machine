package view.vendingMachineView;

import java.sql.SQLException;
import java.util.Scanner;

public class VendingMachineManagementView {
    public void getVendingMachineManagementView() throws SQLException {
        VendingMachineCreatorView vendingMachineCreatorView = new VendingMachineCreatorView();
        VendingMachineReaderView vendingMachineReaderView = new VendingMachineReaderView();
        VendingMachineUpdaterView vendingMachineUpdaterView = new VendingMachineUpdaterView();
        VendingMachineDeleterView vendingMachineDeleterView = new VendingMachineDeleterView();

        System.out.println("You can manage the vending machines in there. Please select the operation:");
        System.out.println("1- Create A New Vending Machine");
        System.out.println("2- List Of Defined Vending Machines");
        System.out.println("3- See Details of An Existing Vending Machine");
        System.out.println("4- Update An Existing Vending Machine");
        System.out.println("5- Delete An Existing Vending Machine");

        Scanner myScanner = new Scanner(System.in);
        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                vendingMachineCreatorView.createVendingMachine();
                break;
            case 2:
                vendingMachineReaderView.getVendingMachines();
                break;
            case 3:
                vendingMachineReaderView.getVendingMachineById();
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