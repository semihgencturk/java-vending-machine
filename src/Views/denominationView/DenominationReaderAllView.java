package Views.denominationView;

import Controllers.denomination.DenominationReader;
import Models.Denomination;

import static App_data.DenominationTable.denominationTable;

public class DenominationReaderAllView {
    private static DenominationReaderAllView self = null;
    public static DenominationReaderAllView getInstance() {
        if (self == null) {
            self = new DenominationReaderAllView();
        }
        return self;
    }

    public void denominationReaderAllView() {
        System.out.println("List of Defined Nominations and their details:");

        DenominationReader denominationReader = DenominationReader.getInstance();

        for (Denomination denomination : denominationTable) {
            System.out.println("1-denominationId: " + denominationReader.denominationIdReader(denomination));
            System.out.println("2-denominationCurrency: " + denominationReader.denominationCurrencyReader(denomination));
            System.out.println("3-denominationAmount: " + denominationReader.denominationAmountReader(denomination));
        }
    }
}
