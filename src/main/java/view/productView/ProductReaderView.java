package view.productView;

import controller.ProductController;
import model.Product;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductReaderView {
    ProductController productController = new ProductController();

    public void getProductById() throws SQLException {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the product id you want to see its details:");
        int productId = myScanner.nextInt();

        printProduct(productController.getProductById(productId));
    }

    public void getProducts() throws SQLException {
        for (Product product : productController.getProducts()) {
            printProduct(product);
        }
    }

    private void printProduct(Product product) {
        System.out.println("1-productId: " + product.getProductId());
        System.out.println("2-productName: " + product.getProductName());
        System.out.println("3-productPrice: " + product.getProductPrice());
    }
}
