package view.denominationManagementView;

import controller.denomination.DenominationDetailer;

import java.util.Scanner;

public class DenominationManagementDetailerView {
    private static DenominationManagementDetailerView self = new DenominationManagementDetailerView();
    public static DenominationManagementDetailerView getInstance() { return self; }

    public void denominationManagementDetailerViewStarter() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the vending machine you want to see its details:");
        int denomination = myScanner.nextInt();

        DenominationDetailer.getInstance().denominationDetailerStarter(denomination);
    }
}
