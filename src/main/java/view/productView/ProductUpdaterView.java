package view.productView;

import controller.ProductDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductUpdaterView {
    public void updateProduct() throws SQLException {
        ProductDatabaseController productController = new ProductDatabaseController();
        Scanner myScanner = new Scanner(System.in);

        // Get all necessary information from the user to update a new product
        System.out.println("Enter the the product's you want to update:");
        int productId = myScanner.nextInt();

        System.out.println("Please enter the new productName");
        String productName = myScanner.nextLine();

        System.out.println("Please enter the new total productPrice");
        Double productPrice = myScanner.nextDouble();

        // Update the product into the database
        productController.updateProduct(productId, productName, productPrice);

    }
}
