package view;

import view.denominationView.DenominationManagementView;
import view.productView.ProductManagementView;
import view.vendingMachineView.VendingMachineManagementView;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminView {
    public void getAdminView() throws SQLException {
        DenominationManagementView denominationView = new DenominationManagementView();
        ProductManagementView productView = new ProductManagementView();
        VendingMachineManagementView vendingMachineView = new VendingMachineManagementView();

        // List of operations for admin in the admin view
        System.out.println("This is the Admin Page. Please select the operations: (Expected integer - Example entry: 2)");
        System.out.println("1- Denomination Management (List Of Defined Denominations -> Add, Update, Delete, Detail Denomination)");
        System.out.println("2- Product Management (List Of Defined Products -> Add, Update, Delete, Detail Product)");
        System.out.println("3- Vending Machine Management (List Of Defined Machines -> Add, Update, Delete, Detail Vending Machine)");

        Scanner myScanner = new Scanner(System.in);
        int selectedOption = myScanner.nextInt();

        // Route the related page according to selected operation
        switch (selectedOption) {
            case 1:
                denominationView.getDenominationManagementView();
                break;
            case 2:
                productView.getProductManagementView();
                break;
            case 3:
                vendingMachineView.getVendingMachineManagementView();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}