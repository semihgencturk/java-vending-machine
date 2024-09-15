package View.denominationView;

import Controller.denomination.DenominationReader;
import java.util.Scanner;

public class DenominationReaderView {
    private static DenominationReaderView self = new DenominationReaderView();
    public static DenominationReaderView getInstance() { return self; }

    public void denominationReaderView() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the vending machine you want to see its details:");
        int denominationIndex = myScanner.nextInt();

        System.out.println(DenominationReader.getInstance().denominationReader(denominationIndex));
    }
}
