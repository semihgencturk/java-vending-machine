package View.vendingMachineView;

import java.util.Scanner;

public class VendingMachineView {
    private static VendingMachineView self = new VendingMachineView();
    public static VendingMachineView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void vendingMachineView() {
        System.out.println("You can manage the vending machines in there. Please select the operation:");
        System.out.println("1- List Of Defined Vending Machines");
        System.out.println("2- See Details of An Existing Vending Machine");
        System.out.println("3- Create A New Vending Machine");
        System.out.println("4- Update An Existing Vending Machine");
        System.out.println("5- Delete An Existing Vending Machine");

        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                VendingMachineReaderAllView.getInstance().vendingMachineReaderAllView();
                break;
            case 2:
                VendingMachineReaderView.getInstance().vendingMachineReaderView();
                break;
            case 3:
                VendingMachineCreatorView.getInstance().vendingMachineCreatorView();
                break;
            case 4:
                VendingMachineUpdaterView.getInstance().vendingMachineUpdaterView();
                break;
            case 5:
                VendingMachineDeleterView.getInstance().vendingMachineDeleterView();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}