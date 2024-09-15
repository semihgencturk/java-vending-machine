package view.productManagementView;


import java.util.Scanner;

public class ProductManagementView {
    private static ProductManagementView self = new ProductManagementView();
    public static ProductManagementView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void productManagementViewStarter() {
        System.out.println("You can manage the product in there. Please select the operation:");
        System.out.println("1- Detail Of Defined Products");
        System.out.println("2- Detail Of An Product");
        System.out.println("3- Create A New Product");
        System.out.println("4- Update An Product");
        System.out.println("5- Delete An Product");

        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                ProductManagementListerView.getInstance().productManagementListerViewStarter();
                break;
            case 2:
                ProductManagementDetailerView.getInstance().productManagementDetailerViewStarter();
                break;
            case 3:
                ProductManagementCreatorView.getInstance().productManagementCreatorViewStarter();
                break;
            case 4:
                ProductManagementUpdaterView.getInstance().productManagementUpdaterViewStarter();
                break;
            case 5:
                ProductManagementDeleterView.getInstance().productManagementDeleterViewStarter();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
