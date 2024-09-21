package view.productView;

import controller.product.ProductCreator;
import java.util.Scanner;

public class ProductCreatorView {
    private static ProductCreatorView self = null;
    public static ProductCreatorView getInstance() {
        if (self == null) {
            self = new ProductCreatorView();
        }
        return self;
    }

    Scanner myScanner = new Scanner(System.in);

    public void productCreatorView() {
        System.out.println("Enter the Product Id");
        int productId = myScanner.nextInt();

        System.out.println("Enter the productName");
        String productName = myScanner.nextLine();

        System.out.println("Enter the productPrice");
        Double productPrice = myScanner.nextDouble();

        ProductCreator.getInstance().productCreator(productId, productName, productPrice);
    }
}
