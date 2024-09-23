package view.denominationView;

import controller.DenominationController;
import java.sql.SQLException;
import java.util.Scanner;

public class DenominationUpdaterView {
    public void updateDenomination() throws SQLException {
        DenominationController denominationController = new DenominationController();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the denomination's id you want to update:");
        int denominationId = myScanner.nextInt();

        System.out.println("Please enter the new denominationCurrency");
        String denominationCurrency = myScanner.nextLine();

        System.out.println("Please enter the new total denominationAmount");
        Double denominationAmount = myScanner.nextDouble();

        denominationController.updateDenomination(denominationId, denominationCurrency, denominationAmount);
    }
}
