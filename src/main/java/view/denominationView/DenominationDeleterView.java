package view.denominationView;

import controller.DenominationDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class DenominationDeleterView {
    public void deleteDenomination() throws SQLException {
        DenominationDatabaseController denominationController = new DenominationDatabaseController();
        DenominationReaderView denominationReaderView = new DenominationReaderView();
        Scanner myScanner = new Scanner(System.in);

        denominationReaderView.printDenominations();

        // Get all necessary information from the user to delete a denomination
        System.out.println("Enter the denomination id you want to delete: (Expected integer - Example entry: 4)");
        int denominationId = myScanner.nextInt();

        denominationController.deleteDenomination(denominationId);

        System.out.println("Denomination is deleted successfully!");
    }
}
