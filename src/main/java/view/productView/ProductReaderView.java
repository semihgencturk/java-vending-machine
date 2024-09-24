package view.productView;

import controller.ProductDatabaseController;
import model.Product;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductReaderView {
    ProductDatabaseController productController = new ProductDatabaseController();

    // Print all attributes of a product
    public void printProductById() throws SQLException {
        Scanner myScanner = new Scanner(System.in);

        // Show the products to the user
        printProducts();

        // Get the product by id
        System.out.println("Enter the product id you want to see its details:");
        int productId = myScanner.nextInt();
        Product product = productController.getProductById(productId);

        // print the product
        printProduct(product);
    }

    // Print all products with their details
    public void printProducts() throws SQLException {
        for (Product product : productController.getProducts()) {
            printProduct(product);
        }
    }

    // Create a GUI and print the attributes of the product
    private void printProduct(Product product) {
        System.out.println("1-productId: " + product.getProductId());
        System.out.println("2-productName: " + product.getProductName());
        System.out.println("3-productPrice: " + product.getProductPrice());
    }
}
