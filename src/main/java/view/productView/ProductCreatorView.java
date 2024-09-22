package view.productView;

import controller.DatabaseController;
import java.util.Scanner;

public class ProductCreatorView {
    public void createProduct() {
        DatabaseController databaseController = new DatabaseController();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the Product Id");
        int productId = myScanner.nextInt();

        System.out.println("Enter the productName");
        String productName = myScanner.nextLine();

        System.out.println("Enter the productPrice");
        double productPrice = myScanner.nextDouble();

        databaseController.insertProduct(productId, productName, productPrice);
    }
}
