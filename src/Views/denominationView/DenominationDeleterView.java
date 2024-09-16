package Views.denominationView;

import Controllers.denomination.DenominationDeleter;
import java.util.Scanner;

public class DenominationDeleterView {
    private static DenominationDeleterView self = new DenominationDeleterView();
    public static DenominationDeleterView getInstance() { return self; }

    public void denominationDeleterView(){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the denomination you want to delete: ");
        int denominationIndex = myScanner.nextInt();

        DenominationDeleter.getInstance().denominationDeleter(denominationIndex);
    }
}
