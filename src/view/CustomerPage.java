/*
    The Customer Page gives the customer to getting a product with paying the related amount.
    It gives possible choices to the user and excepts an input from the user.
    Excepted input is an integer represents the choices such as 1,2 etc.
    If the input isn't included the choices, it gives an error. (The error text: Invalid Entry)

 */

package view;

import java.util.Scanner;

public class CustomerPage {
    private static CustomerPage self = new CustomerPage();
    public static CustomerPage getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void customerPageStarter() {
        System.out.println("This is the Customer Page. Please select the operations:");

        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                System.out.println("1 is called");
                break;
            case 2:
                System.out.println("2 is called");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
