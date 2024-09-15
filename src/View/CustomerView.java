package View;

import java.util.Scanner;

public class CustomerView {
    private static CustomerView self = new CustomerView();
    public static CustomerView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void customerView() {
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
