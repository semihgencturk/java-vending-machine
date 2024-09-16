package Views.denominationView;

import Controllers.denomination.DenominationReader;
import Controllers.product.ProductReader;
import Models.Denomination;
import Models.Product;

import java.util.Scanner;

import static App_data.DenominationTable.denominationTable;
import static App_data.ProductTable.productTable;

public class DenominationReaderView {
    private static DenominationReaderView self = new DenominationReaderView();
    public static DenominationReaderView getInstance() { return self; }

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


