package view.denominationManagementView;

import controller.denomination.DenominationDeleter;

import java.util.Scanner;

public class DenominationManagementDeleterView {
    private static DenominationManagementDeleterView self = new DenominationManagementDeleterView();
    public static DenominationManagementDeleterView getInstance() { return self; }

    public void denominationManagementDeleterViewStarter(){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the denomination you want to delete: ");
        int denominationIndex = myScanner.nextInt();

        DenominationDeleter.getInstance().denominationDeleterStarter(denominationIndex);
    }
}
