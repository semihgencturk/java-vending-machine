package view.denominationView;

import java.util.Scanner;

public class DenominationView {
    public void getDenominationView() {
        DenominationCreatorView denominationCreatorView = new DenominationCreatorView();
        DenominationReaderView denominationReaderView = new DenominationReaderView();
        DenominationUpdaterView denominationUpdaterView = new DenominationUpdaterView();
        DenominationDeleterView denominationDeleterView = new DenominationDeleterView();

        System.out.println("You can manage the denomination in there. Please select the operation:");
        System.out.println("1- Create A New Denomination");
        System.out.println("2- List Of Denominations");
        System.out.println("3- Detail Of A Denomination");
        System.out.println("4- Update A Denomination");
        System.out.println("5- Delete A Denomination");

        Scanner myScanner = new Scanner(System.in);
        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                denominationCreatorView.createDenomination();
                break;
            case 2:
                denominationReaderView.getDenominations();
                break;
            case 3:
                denominationReaderView.getDenominationById();
                break;
            case 4:
                denominationUpdaterView.updateDenomination();
                break;
            case 5:
                denominationDeleterView.deleteDenomination();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}