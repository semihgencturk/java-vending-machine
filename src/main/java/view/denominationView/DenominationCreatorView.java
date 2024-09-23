package view.denominationView;

import controller.DenominationController;

import java.sql.SQLException;
import java.util.Scanner;

public class DenominationCreatorView {
    public void createDenomination() throws SQLException {
        DenominationController denominationController = new DenominationController();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the Denomination Id");
        int denominationId = myScanner.nextInt();

        System.out.println("Enter the Denomination Currency");
        String denominationCurrency = myScanner.nextLine();

        System.out.println("Enter the Denomination Amount");
        double denominationAmount = myScanner.nextInt();

        denominationController.insertDenomination(denominationId, denominationCurrency, denominationAmount);
    }
}
