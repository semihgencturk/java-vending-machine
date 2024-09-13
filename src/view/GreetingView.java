/*
    The Greeting Page is the opening page of the Application.
    It provides an entry point to application for all types of the users such as Admin, customer.
    It gives possible choices to the user and excepts an input from the user.
    Excepted input is an integer represents the choices such as 1,2 etc.
    If the input isn't included the choices, it gives an error. (The error text: Invalid Entry)
    The Greeting page gives two choices:
        1-Admin:
        This option goes to admin page to manage admin operations.
        When the user enter 1, this is invoked.
        2-User:
        This option goes to shopping page
        When the user enter 2, this is invoked.
 */

package view;

import java.util.Scanner;

public class GreetingView {
    private static GreetingView self = new GreetingView();
    public static GreetingView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void greetingViewStarter() {
        System.out.println("Welcome to Vending Machine! How can I help you?");
        System.out.println("1-Admin");
        System.out.println("2-Customer");

        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                AdminView.getInstance().adminViewStarter();
                break;
            case 2:
                CustomerView.getInstance().customerViewStarter();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}