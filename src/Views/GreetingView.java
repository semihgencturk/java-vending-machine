package Views;

import java.util.Scanner;

public class GreetingView {
    private static GreetingView self = null;
    public static GreetingView getInstance() {
        if (self == null) {
            self = new GreetingView();
        }
        return self;
    }

    Scanner myScanner = new Scanner(System.in);

    public void greetingView() {
        System.out.println("Welcome to Vending Machine! How can I help you?");
        System.out.println("1-Admin");
        System.out.println("2-Customer");

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