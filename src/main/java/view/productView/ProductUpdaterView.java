package view.productView;

import controller.DatabaseController;
import java.util.Scanner;

public class ProductUpdaterView {
    public void updateProduct(){
        DatabaseController databaseController = new DatabaseController();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the the product's you want to update:");
        int productId = myScanner.nextInt();

        System.out.println("Please enter the new productName");
        String productName = myScanner.nextLine();

        System.out.println("Please enter the new total productPrice");
        Double productPrice = myScanner.nextDouble();

        databaseController.updateDenomination(productId, productName, productPrice);

    }
}
