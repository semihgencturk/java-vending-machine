package view.denominationView;

import java.sql.SQLException;
import java.util.Scanner;

public class DenominationManagementView {
    public void getDenominationManagementView() throws SQLException {
        DenominationCreatorView denominationCreatorView = new DenominationCreatorView();
        DenominationReaderView denominationReaderView = new DenominationReaderView();
        DenominationUpdaterView denominationUpdaterView = new DenominationUpdaterView();
        DenominationDeleterView denominationDeleterView = new DenominationDeleterView();

        // List of operations for admin in the denomination view
        System.out.println("You can manage the denomination in there. Please select the operation: (Expected integer - Example entry: 5)");
        System.out.println("1- Create A New Denomination");
        System.out.println("2- List Of Denominations");
        System.out.println("3- Detail Of A Denomination");
        System.out.println("4- Update A Denomination");
        System.out.println("5- Delete A Denomination");

        Scanner myScanner = new Scanner(System.in);
        int selectedOperation = myScanner.nextInt();

        // Route the related page according to selected operation
        switch (selectedOperation) {
            case 1:
                denominationCreatorView.createDenomination();
                break;
            case 2:
                denominationReaderView.printDenominations();
                break;
            case 3:
                denominationReaderView.printDenominationById();
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