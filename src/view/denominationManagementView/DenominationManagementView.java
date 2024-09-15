package view.denominationManagementView;


import java.util.Scanner;

public class DenominationManagementView {
    private static DenominationManagementView self = new DenominationManagementView();
    public static DenominationManagementView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void denominationManagementViewStarter() {
        System.out.println("You can manage the denomination in there. Please select the operation:");
        System.out.println("1- List Of Defined Denominations");
        System.out.println("2- Detail Of An Denomination");
        System.out.println("3- Create A New Denomination");
        System.out.println("4- Update An Denomination");
        System.out.println("5- Delete An Denomination");

        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                DenominationManagementListerView.getInstance().denominationManagementListerViewStarter();
                break;
            case 2:
                DenominationManagementDetailerView.getInstance().denominationManagementDetailerViewStarter();
                break;
            case 3:
                DenominationManagementCreatorView.getInstance().denominationManagementCreatorViewStarter();
                break;
            case 4:
                DenominationManagementUpdaterView.getInstance().denominationManagementUpdaterViewStarter();
                break;
            case 5:
                DenominationManagementDeleterView.getInstance().denominationManagementDeleterViewStarter();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}