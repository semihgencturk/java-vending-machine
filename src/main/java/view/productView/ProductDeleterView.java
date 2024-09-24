package view.productView;

import controller.ProductDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductDeleterView {
    public void deleteProduct() throws SQLException {
        ProductDatabaseController productController = new ProductDatabaseController();
        ProductReaderView productReaderView = new ProductReaderView();
        Scanner myScanner = new Scanner(System.in);

        productReaderView.printProducts();

        // Get all necessary information from the user to delete a product
        System.out.println("Enter the product id you want to delete: ");
        int productId = myScanner.nextInt();

        productController.deleteProduct(productId);

        System.out.println("Product is deleted successfully!");
    }
}
