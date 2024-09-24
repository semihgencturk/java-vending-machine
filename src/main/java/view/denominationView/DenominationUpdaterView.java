package view.denominationView;

import controller.DenominationDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class DenominationUpdaterView {
    public void updateDenomination() throws SQLException {
        DenominationDatabaseController denominationController = new DenominationDatabaseController();
        Scanner myScanner = new Scanner(System.in);

        // Get all necessary information from the user to update a new denomination
        System.out.println("Enter the denomination's id you want to update:");
        int denominationId = myScanner.nextInt();

        System.out.println("Please enter the new denominationCurrency");
        String denominationCurrency = myScanner.nextLine();

        System.out.println("Please enter the new total denominationAmount");
        Double denominationAmount = myScanner.nextDouble();

        // Update the denomination into the database
        denominationController.updateDenomination(denominationId, denominationCurrency, denominationAmount);
    }
}
