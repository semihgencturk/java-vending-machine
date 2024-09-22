package view;

import view.denominationView.DenominationView;
import view.productView.ProductView;
import view.vendingMachineView.VendingMachineView;
import java.util.Scanner;

public class AdminView {
    public void getAdminView() {
        DenominationView denominationView = new DenominationView();
        ProductView productView = new ProductView();
        VendingMachineView vendingMachineView = new VendingMachineView();

        System.out.println("This is the Admin Page. Please select the operations:");
        System.out.println("1- Denomination Management (List Of Defined Denominations -> Add, Update, Delete, Detail Denomination)");
        System.out.println("2- Product Management (List Of Defined Products -> Add, Update, Delete, Detail Product)");
        System.out.println("3- Vending Machine Management (List Of Defined Machines -> Add, Update, Delete, Detail Vending Machine)");

        Scanner myScanner = new Scanner(System.in);
        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                denominationView.getDenominationView();
                break;
            case 2:
                productView.getProductView();
                break;
            case 3:
                vendingMachineView.getVendingMachineView();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}