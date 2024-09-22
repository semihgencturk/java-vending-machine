package view.denominationView;

import controller.DatabaseController;
import java.util.Scanner;

public class DenominationDeleterView {
    public void deleteDenomination(){
        DatabaseController databaseController = new DatabaseController();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the denomination id you want to delete: ");
        int denominationId = myScanner.nextInt();

        databaseController.deleteDenomination(denominationId);
    }
}
