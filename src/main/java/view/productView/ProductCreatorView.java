package view.productView;

import controller.ProductController;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductCreatorView {
    public void createProduct() throws SQLException {
        ProductController productController = new ProductController();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the Product Id");
        int productId = myScanner.nextInt();

        System.out.println("Enter the productName");
        String productName = myScanner.nextLine();

        System.out.println("Enter the productPrice");
        double productPrice = myScanner.nextDouble();

        productController.insertProduct(productId, productName, productPrice);
    }
}
