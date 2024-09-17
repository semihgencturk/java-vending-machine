package Views.productView;

import Controllers.product.ProductDeleter;
import java.util.Scanner;

public class ProductDeleterView {
    private static ProductDeleterView self = null;
    public static ProductDeleterView getInstance() {
        if (self == null) {
            self = new ProductDeleterView();
        }
        return self;
    }

    public void productDeleterView(){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the product you want to delete: ");
        int productIndex = myScanner.nextInt();

        ProductDeleter.getInstance().productDeleter(productIndex);
    }
}
