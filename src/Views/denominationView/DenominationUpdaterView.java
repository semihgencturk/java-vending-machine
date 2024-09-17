package Views.denominationView;

import Controllers.denomination.DenominationUpdater;
import java.util.Scanner;
import static App_data.DenominationTable.denominationTable;

public class DenominationUpdaterView {
    private static DenominationUpdaterView self = null;
    public static DenominationUpdaterView getInstance() {
        if (self == null) {
            self = new DenominationUpdaterView();
        }
        return self;
    }

    Scanner myScanner = new Scanner(System.in);

    public void denominationUpdaterView(){
        System.out.println("Please select the denomination you want to update:");

        int denominationIndex = myScanner.nextInt();

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
                denominationUpdater.denominationIdUpdater(denominationTable.get(denominationIndex), denominationId);
                break;
            case 2:
                System.out.println("Please enter the new denominationCurrency");
                String denominationCurrency = myScanner.nextLine();
                denominationUpdater.denominationCurrencyUpdater(denominationTable.get(denominationIndex), denominationCurrency);
                break;
            case 3:
                System.out.println("Please enter the new total denominationAmount");
                int denominationAmount = myScanner.nextInt();
                denominationUpdater.denominationAmountUpdater(denominationTable.get(denominationIndex), denominationAmount);
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
