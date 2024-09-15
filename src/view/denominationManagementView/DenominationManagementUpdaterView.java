package view.denominationManagementView;


import controller.denomination.DenominationUpdater;

import java.util.Scanner;

import static model.DefinedDenominationList.definedDenominationList;


public class DenominationManagementUpdaterView {
    private static DenominationManagementUpdaterView self = new DenominationManagementUpdaterView();
    public static DenominationManagementUpdaterView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void denominationManagementUpdaterViewStarter(){
        System.out.println("Please select the denomination you want to update:");

        int denomination = myScanner.nextInt();

        System.out.println("Please select the property you want to update:");
        System.out.println("1-denominationId");
        System.out.println("2-denominationCurrency");
        System.out.println("3-denominationAmount");

        int selectedOption = myScanner.nextInt();

        DenominationUpdater denominationUpdater = DenominationUpdater.getInstance();

        switch (selectedOption) {
            case 1:
                System.out.println("Please enter the new denominationId");
                int denominationId = myScanner.nextInt();
                denominationUpdater.denominationIdUpdater(definedDenominationList.get(denomination), denominationId);
                break;
            case 2:
                System.out.println("Please enter the new denominationCurrency");
                String denominationCurrency = myScanner.nextLine();
                denominationUpdater.denominationCurrencyUpdater(definedDenominationList.get(denomination), denominationCurrency);
                break;
            case 3:
                System.out.println("Please enter the new total denominationAmount");
                int denominationAmount = myScanner.nextInt();
                denominationUpdater.denominationAmountUpdater(definedDenominationList.get(denomination), denominationAmount);
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
