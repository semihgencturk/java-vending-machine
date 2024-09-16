package Views;

import Views.vendingMachineView.VendingMachineReaderAllView;

import java.util.Scanner;

public class GreetingView {
    private static GreetingView self = new GreetingView();
    public static GreetingView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);



    public void greetingView() {
        System.out.println("Welcome to Vending Machine! How can I help you?");
        System.out.println("1-Admin");
        System.out.println("2-Customer");

        System.out.println("GREET");
        VendingMachineReaderAllView.getInstance().vendingMachineReaderAllView();
        System.out.println("=====");

        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                AdminView.getInstance().adminView();
                break;
            case 2:
                CustomerView.getInstance().customerView();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}