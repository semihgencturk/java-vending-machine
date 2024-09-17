package Views.vendingMachineView;

import Controllers.vendingMachine.VendingMachineDeleter;
import java.util.Scanner;

public class VendingMachineDeleterView {
    private static VendingMachineDeleterView self = null;
    public static VendingMachineDeleterView getInstance() {
        if (self == null) {
            self = new VendingMachineDeleterView();
        }
        return self;
    }

    public void vendingMachineDeleterView(){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the vending machine you want to delete: ");
        int vendingMachineIndex = myScanner.nextInt();

        VendingMachineDeleter.getInstance().vendingMachineDeleter(vendingMachineIndex);
    }
}
