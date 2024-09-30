package view.denominationView;

import controller.DenominationDatabaseController;
import model.Denomination;
import java.sql.SQLException;
import java.util.Scanner;

public class DenominationReaderView {
    DenominationDatabaseController denominationController = new DenominationDatabaseController();

    public void printDenominationById() throws SQLException {
        Scanner myScanner = new Scanner(System.in);

        printDenominations();

        System.out.println("Enter the vending machine id you want to see its details: (Expected integer - Example entry: 1)");
        int denominationId = myScanner.nextInt();
        Denomination denomination = denominationController.getDenominationById(denominationId);

        printDenomination(denomination);
    }

    public void printDenominations() throws SQLException {
        for (Denomination denomination : denominationController.getDenominations()) {
            printDenomination(denomination);
        }
    }

    private void printDenomination(Denomination denomination) {
        System.out.println("1-denominationId: " + denomination.getDenominationId());
        System.out.println("2-denominationCurrency: " + denomination.getDenominationCurrency());
        System.out.println("3-denominationAmount: " + denomination.getDenominationAmount());
    }
}


