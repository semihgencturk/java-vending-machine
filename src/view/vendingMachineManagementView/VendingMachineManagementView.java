/*
    The Vending Machine Management Page gives the admin to manage vending machines
    It gives possible choices to the user and excepts an input from the user.
    Excepted input is an integer represents the choices such as 1,2 etc.
    If the input isn't included the choices, it gives an error. (The error text: Invalid Entry)
    The Admin page gives two choices:
        1-Define a New Vending Machine:
        This option calls the method to create a new vending machine. (the method: definingNewVendingMachine)
        When the user enter 1, this is invoked.
        2-Update An Existing Vending Machine:
        This option calls the method to update an existing vending machine.
        When the user enter 2, this is invoked.
        3-Delete An Existing Vending Machine:
        This option calls the method to delete an existing vending machine.
        When the user enter 3, this is invoked.
        4- List of All Vending Machines
        This option calls the method to list all vending machines in the application.
        When the user enter 4, this is invoked.
 */

package view.vendingMachineManagementView;

import java.util.Scanner;

public class VendingMachineManagementView {
    private static VendingMachineManagementView self = new VendingMachineManagementView();
    public static VendingMachineManagementView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void VendingMachineManagementViewStarter() {
        System.out.println("You can manage the vending machines in there. Please select the operation:");
        System.out.println("1- List Of Defined Vending Machines");
        System.out.println("2- See Details of An Existing Vending Machine");
        System.out.println("3- Create A New Vending Machine");
        System.out.println("4- Update An Existing Vending Machine");
        System.out.println("5- Delete An Existing Vending Machine");

        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                VendingMachineManagementListerView.getInstance().vendingMachineManagementListerViewStarter();
                break;
            case 2:
                VendingMachineManagementDetailerView.getInstance().vendingMachineManagementDetailerViewStarter();
                break;
            case 3:
                VendingMachineManagementCreatorView.getInstance().vendingMachineManagementCreatorViewStarter();
                break;
            case 4:
                VendingMachineManagementUpdaterView.getInstance().vendingMachineManagementUpdaterViewStarter();
                break;
            case 5:
                VendingMachineManagementDeleterView.getInstance().vendingMachineManagementDeleterViewDeleter();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}