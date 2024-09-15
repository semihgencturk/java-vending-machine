package View.vendingMachineView;

import Controller.vendingMachine.VendingMachineDeleter;
import java.util.Scanner;

public class VendingMachineDeleterView {
    private static VendingMachineDeleterView self = new VendingMachineDeleterView();
    public static VendingMachineDeleterView getInstance() { return self; }

    public void vendingMachineDeleterView(){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the vending machine you want to delete: ");
        int vendingMachineIndex = myScanner.nextInt();

        VendingMachineDeleter.getInstance().vendingMachineDeleter(vendingMachineIndex);
    }
}
