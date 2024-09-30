package view.productView;

import controller.ProductDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductCreatorView {
    public void createProduct() throws SQLException {
        ProductDatabaseController productController = new ProductDatabaseController();
        Scanner myScanner = new Scanner(System.in);

        // Get all necessary information from the user to create a new product
        System.out.println("Enter the productName: (Expected String - Example entry: Fellas)");
        String productName = myScanner.nextLine();

        System.out.println("Enter the productPrice: (Expected double - Example entry: 2.59)");
        double productPrice = myScanner.nextDouble();

        productController.insertProduct(productName, productPrice);

        System.out.println("Product is created successfully!");
    }
}
