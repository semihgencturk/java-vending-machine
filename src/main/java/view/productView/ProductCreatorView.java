package view.productView;

import controller.ProductDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductCreatorView {
    public void createProduct() throws SQLException {
        ProductDatabaseController productController = new ProductDatabaseController();
        Scanner myScanner = new Scanner(System.in);

        // Get all necessary information from the user to create a new product
        System.out.println("Enter the Product Id");
        int productId = myScanner.nextInt();

        System.out.println("Enter the productName");
        String productName = myScanner.nextLine();

        System.out.println("Enter the productPrice");
        double productPrice = myScanner.nextDouble();

        // Insert the product into the database
        productController.insertProduct(productId, productName, productPrice);
    }
}
