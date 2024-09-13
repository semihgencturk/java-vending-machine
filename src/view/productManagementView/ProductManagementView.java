package view.productManagementView;


import java.util.Scanner;

public class ProductManagementView {
    private static ProductManagementView self = new ProductManagementView();

    public static ProductManagementView getInstance() {
        return self;
    }

    Scanner myScanner = new Scanner(System.in);

    public void productManagementViewStarter() {
        System.out.println("You can manage the product in there. Please select the operation:");
        System.out.println("1- Create A New Product");
        System.out.println("2- Update An Product");
        System.out.println("3- Delete An Product");

        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                ProductManagementCreatorView.getInstance().productManagementCreatorViewStarter();
                break;
            case 2:
                ProductManagementUpdaterView.getInstance().productManagementUpdaterViewStarter();
                break;
            case 3:
                ProductManagementDeleterView.getInstance().productManagementDeleterViewStarter();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
