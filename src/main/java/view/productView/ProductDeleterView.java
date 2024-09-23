package view.productView;

import controller.ProductController;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductDeleterView {
    public void deleteProduct() throws SQLException {
        ProductController productController = new ProductController();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the product id you want to delete: ");
        int productId = myScanner.nextInt();

        productController.deleteProduct(productId);
    }
}
