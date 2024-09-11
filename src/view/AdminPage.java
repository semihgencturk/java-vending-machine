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

import java.util.Scanner;

public class AdminPage {
    private static AdminPage self = new AdminPage();
    public static AdminPage getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void adminPageStarter() {
        System.out.println("This is the Admin Page. Please select the operations:");
        System.out.println("1-Vending Machine Management (Add, Update, Delete Machine)");
        System.out.println("2-Denomination Management (Add, Update, Delete Denomination)");
        System.out.println("3-Product Management (Add, Update, Delete Product)");

        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                System.out.println("1 is called");
                VendingMachineManagementPage.getInstance().VendingMachineManagementPageOpener();
                break;
            case 2:
                System.out.println("2 is called");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}