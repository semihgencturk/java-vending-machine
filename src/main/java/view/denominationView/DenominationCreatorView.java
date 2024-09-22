package view.denominationView;

import controller.DatabaseController;
import java.util.Scanner;

public class DenominationCreatorView {
    public void createDenomination() {
        DatabaseController databaseController = new DatabaseController();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the Denomination Id");
        int denominationId = myScanner.nextInt();

        System.out.println("Enter the Denomination Currency");
        String denominationCurrency = myScanner.nextLine();

        System.out.println("Enter the Denomination Amount");
        double denominationAmount = myScanner.nextInt();

        databaseController.insertDenomination(denominationId, denominationCurrency, denominationAmount);
    }
}
