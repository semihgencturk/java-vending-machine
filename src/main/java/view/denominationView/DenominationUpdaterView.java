package view.denominationView;

import controller.DenominationDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class DenominationUpdaterView {
    public void updateDenomination() throws SQLException {
        DenominationDatabaseController denominationController = new DenominationDatabaseController();
        DenominationReaderView denominationReaderView = new DenominationReaderView();
        Scanner myScanner = new Scanner(System.in);

        denominationReaderView.printDenominations();

        // Get all necessary information from the user to update a new denomination
        System.out.println("Enter the denomination's id you want to update:");
        int denominationId = myScanner.nextInt();

        System.out.println("Please enter the new denominationCurrency");
        String denominationCurrency = myScanner.nextLine();

        System.out.println("Please enter the new total denominationAmount");
        Double denominationAmount = myScanner.nextDouble();

        denominationController.updateDenomination(denominationId, denominationCurrency, denominationAmount);

        System.out.println("Denomination is updated successfully!");
    }
}
