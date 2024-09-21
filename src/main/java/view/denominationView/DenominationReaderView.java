package view.denominationView;

import controller.denomination.DenominationReader;
import model.Denomination;
import java.util.Scanner;
import static app_data.DenominationTable.denominationTable;

public class DenominationReaderView {
    private static DenominationReaderView self = null;
    public static DenominationReaderView getInstance() {
        if (self == null) {
            self = new DenominationReaderView();
        }
        return self;
    }

    public void denominationReaderView() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the vending machine you want to see its details:");
        int denominationIndex = myScanner.nextInt();

        Denomination denomination = denominationTable.get(denominationIndex);

        DenominationReader denominationReader = DenominationReader.getInstance();

        System.out.println("1-denominationId: " + denominationReader.denominationIdReader(denomination));
        System.out.println("2-denominationCurrency: " + denominationReader.denominationCurrencyReader(denomination));
        System.out.println("3-denominationAmount: " + denominationReader.denominationAmountReader(denomination));
    }
}


