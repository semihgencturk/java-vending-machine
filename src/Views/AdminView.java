package Views;

import Views.denominationView.DenominationView;
import Views.productView.ProductView;
import Views.vendingMachineView.VendingMachineView;
import java.util.Scanner;

public class AdminView {
    private static AdminView self = null;
    public static AdminView getInstance() {
        if (self == null) {
            self = new AdminView();
        }
        return self;
    }

    Scanner myScanner = new Scanner(System.in);

    public void adminView() {
        System.out.println("This is the Admin Page. Please select the operations:");
        System.out.println("1- Vending Machine Management (List Of Defined Machines -> Add, Update, Delete, Detail Vending Machine)");
        System.out.println("2- Denomination Management (List Of Defined Denominations -> Add, Update, Delete, Detail Denomination)");
        System.out.println("3- Product Management (List Of Defined Products -> Add, Update, Delete, Detail Product)");

        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                VendingMachineView.getInstance().vendingMachineView();
                break;
            case 2:
                DenominationView.getInstance().denominationView();
                break;
            case 3:
                ProductView.getInstance().productView();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}