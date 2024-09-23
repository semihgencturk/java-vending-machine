package view.denominationView;

import controller.DenominationController;
import java.util.Scanner;

public class DenominationDeleterView {
    public void deleteDenomination(){
        DenominationController denominationController = new DenominationController();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the denomination id you want to delete: ");
        int denominationId = myScanner.nextInt();

        denominationController.deleteDenomination(denominationId);
    }
}
