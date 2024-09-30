package view.productView;

import controller.ProductDatabaseController;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductUpdaterView {
    public void updateProduct() throws SQLException {
        ProductDatabaseController productController = new ProductDatabaseController();
        ProductReaderView productReaderView = new ProductReaderView();
        Scanner myScanner = new Scanner(System.in);

        productReaderView.printProducts();

        // Get all necessary information from the user to update a new product
        System.out.println("Enter the the product's you want to update: (Expected integer - Example entry: 3)");
        int productId = myScanner.nextInt();

        System.out.println("Please enter the new productName: (Expected String - Example entry: Zuber)");
        String productName = myScanner.nextLine();

        System.out.println("Please enter the new total productPrice: (Expected double - Example entry: 1.99)");
        double productPrice = myScanner.nextDouble();

        productController.updateProduct(productId, productName, productPrice);

        System.out.println("Product is updated successfully!");
    }
}
