package view.denominationView;

import controller.DenominationDatabaseController;
import model.Denomination;
import java.sql.SQLException;
import java.util.Scanner;

public class DenominationReaderView {
    DenominationDatabaseController denominationController = new DenominationDatabaseController();

    // Print all attributes of a denomination
    public void printDenominationById() throws SQLException {
        Scanner myScanner = new Scanner(System.in);

        // Show the denominations to the user
        printDenominations();

        // Get the denomination by id
        System.out.println("Enter the vending machine id you want to see its details:");
        int denominationId = myScanner.nextInt();
        Denomination denomination = denominationController.getDenominationById(denominationId);

        // print the denomination
        printDenomination(denomination);
    }

    // Print all denominations with their details
    public void printDenominations() throws SQLException {
        for (Denomination denomination : denominationController.getDenominations()) {
            printDenomination(denomination);
        }
    }

    // Create a GUI and print the attributes of the denomination
    private void printDenomination(Denomination denomination) {
        System.out.println("1-denominationId: " + denomination.getDenominationId());
        System.out.println("2-denominationCurrency: " + denomination.getDenominationCurrency());
        System.out.println("3-denominationAmount: " + denomination.getDenominationAmount());
    }
}


