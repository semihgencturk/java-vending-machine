package view.productView;

import controller.ProductDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductDeleterView {
    public void deleteProduct() throws SQLException {
        ProductDatabaseController productController = new ProductDatabaseController();
        Scanner myScanner = new Scanner(System.in);

        // Get all necessary information from the user to delete a product
        System.out.println("Enter the product id you want to delete: ");
        int productId = myScanner.nextInt();

        // Delete the product from the database
        productController.deleteProduct(productId);
    }
}
