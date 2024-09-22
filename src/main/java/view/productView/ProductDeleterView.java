package view.productView;

import controller.DatabaseController;
import java.util.Scanner;

public class ProductDeleterView {
    public void deleteProduct(){
        DatabaseController databaseController = new DatabaseController();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the product id you want to delete: ");
        int productId = myScanner.nextInt();

        databaseController.deleteProduct(productId);
    }
}
