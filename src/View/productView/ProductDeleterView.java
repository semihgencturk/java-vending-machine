package View.productView;

import Controller.product.ProductDeleter;
import java.util.Scanner;

public class ProductDeleterView {
    private static ProductDeleterView self = new ProductDeleterView();
    public static ProductDeleterView getInstance() { return self; }

    public void productDeleterView(){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the product you want to delete: ");
        int productIndex = myScanner.nextInt();

        ProductDeleter.getInstance().productDeleter(productIndex);
    }
}
