package view.productManagementView;

import controller.product.ProductDeleter;

import java.util.Scanner;

public class ProductManagementDeleterView {
    private static ProductManagementDeleterView self = new ProductManagementDeleterView();
    public static ProductManagementDeleterView getInstance() { return self; }

    public void productManagementDeleterViewStarter(){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the product you want to delete: ");
        int productIndex = myScanner.nextInt();

        ProductDeleter.getInstance().productDeleterStarter(productIndex);
    }
}
