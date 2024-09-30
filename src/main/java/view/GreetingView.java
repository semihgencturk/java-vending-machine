package view;

import java.sql.SQLException;
import java.util.Scanner;

public class GreetingView {
    public void getGreetingView() throws SQLException {
        AdminView adminView = new AdminView();
        CustomerView customerView = new CustomerView();
        Scanner myScanner = new Scanner(System.in);
        int selectedOption;

        do {
            // List of operations for admin in the admin view
            System.out.println("How can I help you? (Expected integer - Example entry: 1)");
            System.out.println("1-Admin");
            System.out.println("2-Customer");
            System.out.println("3-Exit");

            selectedOption = myScanner.nextInt();

            // Route the related page according to selected operation
            switch (selectedOption) {
                case 1:
                    adminView.getAdminView();
                    break;
                case 2:
                    customerView.getCustomerView();
                    break;
                case 3:
                    System.out.println("Application is closed successfully!");
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
        } while (selectedOption != 3);
    }
}