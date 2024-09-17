package Views.denominationView;

import Controllers.denomination.DenominationDeleter;
import java.util.Scanner;

public class DenominationDeleterView {
    private static DenominationDeleterView self = null;
    public static DenominationDeleterView getInstance() {
        if (self == null) {
            self = new DenominationDeleterView();
        }
        return self;
    }

    public void denominationDeleterView(){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the denomination you want to delete: ");
        int denominationIndex = myScanner.nextInt();

        DenominationDeleter.getInstance().denominationDeleter(denominationIndex);
    }
}
