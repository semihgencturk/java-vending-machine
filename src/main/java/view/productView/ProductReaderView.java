package view.productView;

import controller.DatabaseController;
import model.Product;
import java.util.Scanner;

public class ProductReaderView {
    DatabaseController databaseController = new DatabaseController();

    public void getProductById() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the product id you want to see its details:");
        int productId = myScanner.nextInt();

        printProduct(databaseController.getProductById(productId));
    }

    public void getProducts() {
        for (Product product : databaseController.getProducts()) {
            printProduct(product);
        }
    }

    private void printProduct(Product product) {
        System.out.println("1-productId: " + product.getProductId());
        System.out.println("2-productName: " + product.getProductName());
        System.out.println("3-productPrice: " + product.getProductPrice());
    }
}
