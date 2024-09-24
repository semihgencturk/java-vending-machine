package view.denominationView;

import controller.DenominationDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class DenominationCreatorView {
    public void createDenomination() throws SQLException {
        DenominationDatabaseController denominationController = new DenominationDatabaseController();
        Scanner myScanner = new Scanner(System.in);

        // Get all necessary information from the user to create a new denomination
        System.out.println("Enter the Denomination Currency");
        String denominationCurrency = myScanner.nextLine();

        System.out.println("Enter the Denomination Amount");
        double denominationAmount = myScanner.nextInt();

        denominationController.insertDenomination(denominationCurrency, denominationAmount);

        System.out.println("Denomination is created successfully!");
    }
}
