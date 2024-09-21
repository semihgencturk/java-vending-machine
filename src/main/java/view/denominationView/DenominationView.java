package view.denominationView;

import java.util.Scanner;

public class DenominationView {
    private static DenominationView self = null;
    public static DenominationView getInstance() {
        if (self == null) {
            self = new DenominationView();
        }
        return self;
    }

    Scanner myScanner = new Scanner(System.in);

    public void denominationView() {
        System.out.println("You can manage the denomination in there. Please select the operation:");
        System.out.println("1- List Of Defined Denominations");
        System.out.println("2- Detail Of An Denomination");
        System.out.println("3- Create A New Denomination");
        System.out.println("4- Update An Denomination");
        System.out.println("5- Delete An Denomination");

        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                DenominationReaderAllView.getInstance().denominationReaderAllView();
                break;
            case 2:
                DenominationReaderView.getInstance().denominationReaderView();
                break;
            case 3:
                DenominationCreatorView.getInstance().denominationCreatorView();
                break;
            case 4:
                DenominationUpdaterView.getInstance().denominationUpdaterView();
                break;
            case 5:
                DenominationDeleterView.getInstance().denominationDeleterView();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}