/*
    The Admin Page gives the admin to manage vending machines, denominations and products in the system.
    It gives possible choices to the user and excepts an input from the user.
    Excepted input is an integer represents the choices such as 1,2 etc.
    If the input isn't included the choices, it gives an error. (The error text: Invalid Entry)
    The Admin page gives two choices:
        1-Vending Machine Management:
        This option goes to vending machine management page
        When the user enter 1, this is invoked.
        2-Denomination Management:
        This option goes to denomination management page
        When the user enter 2, this is invoked.
        3-Product Management:
        This option goes to product management page
        When the user enter 3, this is invoked.
 */

package view;

import view.denominationManagementView.DenominationManagementView;
import view.productManagementView.ProductManagementView;
import view.vendingMachineManagementView.VendingMachineManagementView;

import java.util.Scanner;

public class AdminView {
    private static AdminView self = new AdminView();
    public static AdminView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void adminViewStarter() {
        System.out.println("This is the Admin Page. Please select the operations:");
        System.out.println("1- Vending Machine Management (List Of Defined Machines -> Add, Update, Delete, Detail Vending Machine)");
        System.out.println("2- Denomination Management (List Of Defined Denominations -> Add, Update, Delete, Detail Denomination)");
        System.out.println("3- Product Management (List Of Defined Products -> Add, Update, Delete, Detail Product)");

        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                VendingMachineManagementView.getInstance().VendingMachineManagementViewStarter();
                break;
            case 2:
                DenominationManagementView.getInstance().denominationManagementViewStarter();
                break;
            case 3:
                ProductManagementView.getInstance().productManagementViewStarter();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}