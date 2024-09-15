package view.vendingMachineManagementView;

import controller.product.ProductDeleter;
import controller.vendingMachine.VendingMachineDeleter;

import java.util.Scanner;

public class VendingMachineManagementDeleterView {
    private static VendingMachineManagementDeleterView self = new VendingMachineManagementDeleterView();
    public static VendingMachineManagementDeleterView getInstance() { return self; }

    public void vendingMachineManagementDeleterViewDeleter(){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the vending machine you want to delete: ");
        int vendingMachineIndex = myScanner.nextInt();

        VendingMachineDeleter.getInstance().vendingMachineDeleterStarter(vendingMachineIndex);
    }
}
