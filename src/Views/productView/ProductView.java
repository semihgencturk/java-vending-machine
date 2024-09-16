package Views.productView;

import java.util.Scanner;

public class ProductView {
    private static ProductView self = new ProductView();
    public static ProductView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void productView() {
        System.out.println("You can manage the product in there. Please select the operation:");
        System.out.println("1- Detail Of Defined Products");
        System.out.println("2- Detail Of An Product");
        System.out.println("3- Create A New Product");
        System.out.println("4- Update An Product");
        System.out.println("5- Delete An Product");

        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                ProductReaderAllView.getInstance().productReaderAllView();
                break;
            case 2:
                ProductReaderView.getInstance().productReaderView();
                break;
            case 3:
                ProductCreatorView.getInstance().productCreatorView();
                break;
            case 4:
                ProductUpdaterView.getInstance().productUpdaterView();
                break;
            case 5:
                ProductDeleterView.getInstance().productDeleterView();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
