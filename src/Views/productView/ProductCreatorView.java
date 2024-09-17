package Views.productView;

import Controllers.product.ProductCreator;
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
        System.out.println("Enter the Denomination Id");
        int productId = myScanner.nextInt();

        System.out.println("Enter the Denomination Currency");
        String productName = myScanner.nextLine();

        System.out.println("Enter the Denomination Amount");
        Double productPrice = myScanner.nextDouble();

        ProductCreator.getInstance().productCreator(productId, productName, productPrice);
    }
}
