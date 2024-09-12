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

package view;

import controller.currentVendingMachines.CurrentVendingMachinesAdder;
import controller.currentVendingMachines.CurrentVendingMachinesDeleter;
import controller.currentVendingMachines.CurrentVendingMachinesLister;
import controller.currentVendingMachines.currentVendingMachineUpdater;
import controller.vendingMachine.VendingMachineCreator;

import java.util.Scanner;

public class VendingMachineManagementPage {
    private static VendingMachineManagementPage self = new VendingMachineManagementPage();
    public static VendingMachineManagementPage getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void VendingMachineManagementPageOpener() {
        System.out.println("You can manage the machines in there. Please select the operation:");
        System.out.println("1- Define A New Vending Machine");
        System.out.println("2- Update An Existing Vending Machine");
        System.out.println("3- Delete An Existing Vending Machine");
        System.out.println("4- List of All Vending Machines");

        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                CurrentVendingMachinesAdder.getInstance().CurrentVendingMachinesAdderStarter(VendingMachineCreator.getInstance().definingNewVendingMachine());
                break;
            case 2:
                currentVendingMachineUpdater.getInstance().VendingMachineUpdaterStarter();
                break;
            case 3:

                CurrentVendingMachinesDeleter.getInstance().CurrentVendingMachinesDeleterStarter();
                break;
            case 4:
                CurrentVendingMachinesLister.getInstance().currentVendingMachinesListerStarter();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}

// CurrentVendingMachinesLister.getInstance().currentVendingMachinesListerStarter();
//                System.out.println("Select the vending machine you want to update");
//                int selectedVendingMachine = myScanner.nextInt();
//                System.out.println("s" + myVendingMachine1.getTotalProductStorageUnitNumber());
//                VendingMachineUpdater.getInstance().totalProductStorageUnitNumberUpdater(myVendingMachine1, 20);