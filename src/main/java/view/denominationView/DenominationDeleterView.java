package view.denominationView;

import controller.DenominationDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class DenominationDeleterView {
    public void deleteDenomination() throws SQLException {
        DenominationDatabaseController denominationController = new DenominationDatabaseController();
        Scanner myScanner = new Scanner(System.in);

        // Get all necessary information from the user to delete a denomination
        System.out.println("Enter the denomination id you want to delete: ");
        int denominationId = myScanner.nextInt();

        // Delete the denomination from the database
        denominationController.deleteDenomination(denominationId);
    }
}
