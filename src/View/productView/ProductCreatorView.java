package View.productView;

import Controller.product.ProductCreator;
import java.util.Scanner;

public class ProductCreatorView {
    private static ProductCreatorView self = new ProductCreatorView();
    public static ProductCreatorView getInstance() { return self; }

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
