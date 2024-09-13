package view.productManagementView;

import controller.product.ProductUpdater;

import java.util.Scanner;

import static model.DefinedProducts.definedProductsList;


public class ProductManagementUpdaterView {
    private static ProductManagementUpdaterView self = new ProductManagementUpdaterView();
    public static ProductManagementUpdaterView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void productManagementUpdaterViewStarter(){
        System.out.println("Please select the product you want to update:");

        int product = myScanner.nextInt();

        System.out.println("Please select the property you want to update:");
        System.out.println("1-productId");
        System.out.println("2-productName");
        System.out.println("3-productPrice");

        int selectedOption = myScanner.nextInt();

        ProductUpdater productUpdater = ProductUpdater.getInstance();

        switch (selectedOption) {
            case 1:
                System.out.println("Please enter the new productId");
                int productId = myScanner.nextInt();
                productUpdater.productIdUpdater(definedProductsList.get(product), productId);
                break;
            case 2:
                System.out.println("Please enter the new productName");
                String productName = myScanner.nextLine();
                productUpdater.productNameUpdater(definedProductsList.get(product), productName);
                break;
            case 3:
                System.out.println("Please enter the new total productPrice");
                Double productPrice = myScanner.nextDouble();
                productUpdater.productPriceUpdater(definedProductsList.get(product), productPrice);
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
