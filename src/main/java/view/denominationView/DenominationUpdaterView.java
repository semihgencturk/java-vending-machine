package view.denominationView;

import controller.DatabaseController;
import java.util.Scanner;

public class DenominationUpdaterView {
    public void updateDenomination(){
        DatabaseController databaseController = new DatabaseController();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the denomination's id you want to update:");
        int denominationId = myScanner.nextInt();

        System.out.println("Please enter the new denominationCurrency");
        String denominationCurrency = myScanner.nextLine();

        System.out.println("Please enter the new total denominationAmount");
        Double denominationAmount = myScanner.nextDouble();

        databaseController.updateDenomination(denominationId, denominationCurrency, denominationAmount);
    }
}
