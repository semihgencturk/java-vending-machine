package view;

import java.sql.SQLException;
import java.util.Scanner;

public class GreetingView {
    public void getGreetingView() throws SQLException {
        AdminView adminView = new AdminView();
        CustomerView customerView = new CustomerView();

        // List of operations for admin in the admin view
        System.out.println("Welcome to Vending Machine! How can I help you?");
        System.out.println("1-Admin");
        System.out.println("2-Customer");

        // Get the operation from the user
        Scanner myScanner = new Scanner(System.in);
        int selectedOption = myScanner.nextInt();

        // Route the related page according to selected operation
        switch (selectedOption) {
            case 1:
                adminView.getAdminView();
                break;
            case 2:
                customerView.getCustomerView();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}