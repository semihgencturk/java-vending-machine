package view.denominationManagementView;

import controller.definedDenominations.DefinedDenominationsAdder;
import controller.denomination.DenominationCreator;

import java.util.Scanner;

public class DenominationManagementCreatorView {
    private static DenominationManagementCreatorView self = new DenominationManagementCreatorView();
    public static DenominationManagementCreatorView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void denominationManagementCreatorViewStarter() {

        System.out.println("Enter the Denomination Id");
        int denominationId = myScanner.nextInt();

        System.out.println("Enter the Denomination Currency");
        String denominationCurrency = myScanner.nextLine();

        System.out.println("Enter the Denomination Amount");
        int denominationAmount = myScanner.nextInt();

        DefinedDenominationsAdder.getInstance().definedDenominationsAdderStarter(DenominationCreator.getInstance().denominationCreatorStarter(denominationId, denominationCurrency, denominationAmount));
    }
}
